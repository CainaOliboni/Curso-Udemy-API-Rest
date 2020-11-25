package io.github.cainaoliboni.rest.controller;

import io.github.cainaoliboni.domain.entity.Pedido;
import io.github.cainaoliboni.rest.dto.PedidoDTO;
import io.github.cainaoliboni.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Integer save(@RequestBody PedidoDTO dto){

        Pedido pedido = pedidoService.salvar(dto);
        return pedido.getId();
    }
}
