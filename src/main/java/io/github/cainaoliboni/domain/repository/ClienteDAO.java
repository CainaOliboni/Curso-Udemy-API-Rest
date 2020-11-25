package io.github.cainaoliboni.domain.repository;

import io.github.cainaoliboni.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByNomeLike(String noia);
    boolean existsByNome(String nome);

    @Query(value = "select c from Cliente c where c.nome like :nome")
    List<Cliente> econtrarPorNome(@Param("nome") String nome);

    @Query("select c from Cliente c left join fetch c.pedidos p where c.id = :id")
    Cliente findClienteFetchPedidos( @Param("id") Integer id);



}

