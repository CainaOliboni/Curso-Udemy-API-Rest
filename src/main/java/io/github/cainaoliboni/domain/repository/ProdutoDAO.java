package io.github.cainaoliboni.domain.repository;

import io.github.cainaoliboni.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoDAO extends JpaRepository<Produto, Integer> {
}
