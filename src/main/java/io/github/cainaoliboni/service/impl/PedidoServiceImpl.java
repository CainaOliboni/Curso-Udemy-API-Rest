package io.github.cainaoliboni.service.impl;

import io.github.cainaoliboni.domain.entity.Cliente;
import io.github.cainaoliboni.domain.entity.ItemPedido;
import io.github.cainaoliboni.domain.entity.Pedido;
import io.github.cainaoliboni.domain.entity.Produto;
import io.github.cainaoliboni.domain.enums.StatusPedido;
import io.github.cainaoliboni.domain.repository.ClienteDAO;
import io.github.cainaoliboni.domain.repository.ItemPedidoDAO;
import io.github.cainaoliboni.domain.repository.PedidoDAO;
import io.github.cainaoliboni.domain.repository.ProdutoDAO;
import io.github.cainaoliboni.exception.PedidoNaoEncontradoException;
import io.github.cainaoliboni.exception.RegraNegocioException;
import io.github.cainaoliboni.rest.dto.ItemPedidoDTO;
import io.github.cainaoliboni.rest.dto.PedidoDTO;
import io.github.cainaoliboni.service.PedidoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PedidoServiceImpl implements PedidoService {

    private final PedidoDAO pedidoDAO;
    private final ClienteDAO clienteDAO;
    private final ProdutoDAO produtoDAO;
    private final ItemPedidoDAO itemPedidoDAO;

    public PedidoServiceImpl(PedidoDAO pedidoDAO, ClienteDAO clienteDAO, ProdutoDAO produtoDAO, ItemPedidoDAO itemPedidoDAO) {
        this.pedidoDAO = pedidoDAO;
        this.clienteDAO = clienteDAO;
        this.produtoDAO = produtoDAO;
        this.itemPedidoDAO = itemPedidoDAO;
    }

    @Override
    @Transactional
    public Pedido salvar(PedidoDTO dto) {

        Integer idCliente = dto.getCliente();
        Cliente cliente = clienteDAO
                .findById(idCliente)
                .orElseThrow(() -> new RegraNegocioException("Código de cliente inválido."));

        Pedido pedido = new Pedido();
        pedido.setDataPedido(LocalDate.now());
        pedido.setTotal(dto.getTotal());
        pedido.setCliente(cliente);
        pedido.setStatus(StatusPedido.REALIZADO);

        List<ItemPedido> itemsPedido = converterItems(pedido, dto.getItems());
        pedidoDAO.save(pedido);
        itemPedidoDAO.saveAll(itemsPedido);
        pedido.setItens(itemsPedido);

        return pedido;
    }

    @Override
    public Optional<Pedido> obterPedidoCompleto(Integer id) {
        return pedidoDAO.findByIdFetchItens(id);
    }

    @Override
    @Transactional
    public void atualizaStatus(Integer id, StatusPedido statusPedido) {
        pedidoDAO
                .findById(id)
                .map((pedido -> {
                    pedido.setStatus(statusPedido);
                    return pedidoDAO.save(pedido);
                })).orElseThrow(() -> new PedidoNaoEncontradoException());
    }

    private List<ItemPedido> converterItems(Pedido pedido, List<ItemPedidoDTO> items){
        if(items.isEmpty()){
            throw new RegraNegocioException("Não é possível realizar um pedido sem items.");
        }
        return items
                .stream()
                .map(itemPedidoDTO -> {
                    Produto produto = produtoDAO
                            .findById(itemPedidoDTO.getProduto())
                            .orElseThrow(() -> new RegraNegocioException("Código de produto inválido:" + itemPedidoDTO.getProduto()));
                    ItemPedido itemPedido = new ItemPedido();
                    itemPedido.setQuantidade(itemPedidoDTO.getQuantidade());
                    itemPedido.setPedido(pedido);
                    itemPedido.setProduto(produto);

                    return itemPedido;
                })
                .collect(Collectors.toList());
    }
}
