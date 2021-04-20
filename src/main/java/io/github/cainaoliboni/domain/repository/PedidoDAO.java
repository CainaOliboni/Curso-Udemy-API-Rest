package io.github.cainaoliboni.domain.repository;

import io.github.cainaoliboni.domain.entity.Cliente;
import io.github.cainaoliboni.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.Set;

public interface PedidoDAO extends JpaRepository<Pedido, Integer> {

    Set<Pedido> findByCliente(Cliente cliente);

    @Query(" select p from Pedido p left join fetch p.itens where p.id = :id")
    Optional<Pedido> findByIdFetchItens(@Param("id") Integer id);

}
