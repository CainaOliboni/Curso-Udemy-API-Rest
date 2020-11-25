package io.github.cainaoliboni.service;


import io.github.cainaoliboni.domain.entity.Pedido;
import io.github.cainaoliboni.rest.dto.PedidoDTO;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto);

}
