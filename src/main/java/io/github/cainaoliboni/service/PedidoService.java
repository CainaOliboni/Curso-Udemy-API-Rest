package io.github.cainaoliboni.service;


import io.github.cainaoliboni.domain.entity.Pedido;
import io.github.cainaoliboni.domain.enums.StatusPedido;
import io.github.cainaoliboni.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer id);

    void atualizaStatus(Integer id, StatusPedido statusPedido);

}
