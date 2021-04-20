package io.github.cainaoliboni.service.impl;

import io.github.cainaoliboni.domain.entity.Usuario;
import io.github.cainaoliboni.domain.repository.UsuarioDAO;
import io.github.cainaoliboni.exception.SenhaInvalidaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImpl implements UserDetailsService {

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Usuario usuario = usuarioDAO.findByLogin(username).orElseThrow(() ->
                new UsernameNotFoundException("Usuário não encontrado na base de dados"));

        String[] roles = usuario.isAdmin()
                ? new String[] {"ADMIN", "USER"}
                : new String[] {"USER"};

        return User
                .builder()
                .username(usuario.getLogin())
                .password(usuario.getSenha())
                .roles(roles)
                .build();
    }

    @Transactional
    public Usuario salvar(Usuario usuario){
        return usuarioDAO.save(usuario);
    }

    public UserDetails autenticar(Usuario usuario){
        UserDetails userDetails = loadUserByUsername(usuario.getLogin());
        boolean senhasBatem = encoder.matches(usuario.getSenha(), userDetails.getPassword());
        if (senhasBatem){
            return userDetails;
        }

        throw new SenhaInvalidaException();
    }

}
