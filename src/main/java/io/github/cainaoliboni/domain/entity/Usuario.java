package io.github.cainaoliboni.domain.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotEmpty(message = "{campo.login.obrigatorio}")
    private String login;

    @Column
    @NotEmpty(message = "{campo.senha.obrigatorio}")
    private String senha;

    @Column
    private boolean admin;

    public Usuario(Integer id, @NotEmpty(message = "{campo.login.obrigatorio}") String login, @NotEmpty(message = "{campo.senha.obrigatorio}") String senha, boolean admin) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.admin = admin;
    }

    public Usuario() {
    }

    public static UsuarioBuilder builder() {
        return new UsuarioBuilder();
    }

    public Integer getId() {
        return this.id;
    }

    public @NotEmpty(message = "{campo.login.obrigatorio}") String getLogin() {
        return this.login;
    }

    public @NotEmpty(message = "{campo.senha.obrigatorio}") String getSenha() {
        return this.senha;
    }

    public boolean isAdmin() {
        return this.admin;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLogin(@NotEmpty(message = "{campo.login.obrigatorio}") String login) {
        this.login = login;
    }

    public void setSenha(@NotEmpty(message = "{campo.senha.obrigatorio}") String senha) {
        this.senha = senha;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Usuario)) return false;
        final Usuario other = (Usuario) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$login = this.getLogin();
        final Object other$login = other.getLogin();
        if (this$login == null ? other$login != null : !this$login.equals(other$login)) return false;
        final Object this$senha = this.getSenha();
        final Object other$senha = other.getSenha();
        if (this$senha == null ? other$senha != null : !this$senha.equals(other$senha)) return false;
        if (this.isAdmin() != other.isAdmin()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Usuario;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $login = this.getLogin();
        result = result * PRIME + ($login == null ? 43 : $login.hashCode());
        final Object $senha = this.getSenha();
        result = result * PRIME + ($senha == null ? 43 : $senha.hashCode());
        result = result * PRIME + (this.isAdmin() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "Usuario(id=" + this.getId() + ", login=" + this.getLogin() + ", senha=" + this.getSenha() + ", admin=" + this.isAdmin() + ")";
    }

    public static class UsuarioBuilder {
        private Integer id;
        private @NotEmpty(message = "{campo.login.obrigatorio}") String login;
        private @NotEmpty(message = "{campo.senha.obrigatorio}") String senha;
        private boolean admin;

        UsuarioBuilder() {
        }

        public UsuarioBuilder id(Integer id) {
            this.id = id;
            return this;
        }

        public UsuarioBuilder login(@NotEmpty(message = "{campo.login.obrigatorio}") String login) {
            this.login = login;
            return this;
        }

        public UsuarioBuilder senha(@NotEmpty(message = "{campo.senha.obrigatorio}") String senha) {
            this.senha = senha;
            return this;
        }

        public UsuarioBuilder admin(boolean admin) {
            this.admin = admin;
            return this;
        }

        public Usuario build() {
            return new Usuario(id, login, senha, admin);
        }

        public String toString() {
            return "Usuario.UsuarioBuilder(id=" + this.id + ", login=" + this.login + ", senha=" + this.senha + ", admin=" + this.admin + ")";
        }
    }
}
