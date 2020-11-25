package io.github.cainaoliboni.domain.repository;

import io.github.cainaoliboni.domain.entity.Cliente;
import io.github.cainaoliboni.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface PedidoDAO extends JpaRepository<Pedido, Integer> {

    Set<Pedido> findByCliente(Cliente cliente);

}
