package io.github.cainaoliboni.domain.repository;

import io.github.cainaoliboni.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByLogin(String login);

}
