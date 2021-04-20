package io.github.cainaoliboni.rest.dto;

public class TokenDTO {

    private String login;
    private String token;

    public TokenDTO(String login, String token) {
        this.login = login;
        this.token = token;
    }

    public TokenDTO() {
    }

    public String getLogin() {
        return this.login;
    }

    public String getToken() {
        return this.token;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TokenDTO)) return false;
        final TokenDTO other = (TokenDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$login = this.getLogin();
        final Object other$login = other.getLogin();
        if (this$login == null ? other$login != null : !this$login.equals(other$login)) return false;
        final Object this$token = this.getToken();
        final Object other$token = other.getToken();
        if (this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TokenDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $login = this.getLogin();
        result = result * PRIME + ($login == null ? 43 : $login.hashCode());
        final Object $token = this.getToken();
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        return result;
    }

    public String toString() {
        return "TokenDTO(login=" + this.getLogin() + ", token=" + this.getToken() + ")";
    }
}
