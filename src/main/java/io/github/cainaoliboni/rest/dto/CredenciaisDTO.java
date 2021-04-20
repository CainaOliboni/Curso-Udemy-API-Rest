package io.github.cainaoliboni.rest.dto;

public class CredenciaisDTO {

    private String login;
    private String senha;

    public CredenciaisDTO() {
    }

    public String getLogin() {
        return this.login;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CredenciaisDTO)) return false;
        final CredenciaisDTO other = (CredenciaisDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$login = this.getLogin();
        final Object other$login = other.getLogin();
        if (this$login == null ? other$login != null : !this$login.equals(other$login)) return false;
        final Object this$senha = this.getSenha();
        final Object other$senha = other.getSenha();
        if (this$senha == null ? other$senha != null : !this$senha.equals(other$senha)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CredenciaisDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $login = this.getLogin();
        result = result * PRIME + ($login == null ? 43 : $login.hashCode());
        final Object $senha = this.getSenha();
        result = result * PRIME + ($senha == null ? 43 : $senha.hashCode());
        return result;
    }

    public String toString() {
        return "CredenciaisDTO(login=" + this.getLogin() + ", senha=" + this.getSenha() + ")";
    }
}
