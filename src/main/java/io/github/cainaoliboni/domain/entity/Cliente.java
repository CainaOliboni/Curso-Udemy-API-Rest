package io.github.cainaoliboni.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", length = 100)
    @NotEmpty(message = "{campo.nome.obrigatorio}")
    private String nome;

    @Column(name = "cpf", length = 11)
    @NotEmpty(message = "{campo.descricao.obrigatorio}")
    @CPF(message = "{campo.cpf.invalido}")
    private String cpf;

    @JsonIgnore
    @OneToMany(mappedBy = "cliente")
    private Set<Pedido> pedidos;

    public Cliente(Integer id, @NotEmpty(message = "{campo.nome.obrigatorio}") String nome, @NotEmpty(message = "{campo.descricao.obrigatorio}") @CPF(message = "{campo.cpf.invalido}") String cpf, Set<Pedido> pedidos) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.pedidos = pedidos;
    }

    public Cliente() {
    }

    public Integer getId() {
        return this.id;
    }

    public @NotEmpty(message = "{campo.nome.obrigatorio}") String getNome() {
        return this.nome;
    }

    public @NotEmpty(message = "{campo.descricao.obrigatorio}") @CPF(message = "{campo.cpf.invalido}") String getCpf() {
        return this.cpf;
    }

    public Set<Pedido> getPedidos() {
        return this.pedidos;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(@NotEmpty(message = "{campo.nome.obrigatorio}") String nome) {
        this.nome = nome;
    }

    public void setCpf(@NotEmpty(message = "{campo.descricao.obrigatorio}") @CPF(message = "{campo.cpf.invalido}") String cpf) {
        this.cpf = cpf;
    }

    @JsonIgnore
    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Cliente)) return false;
        final Cliente other = (Cliente) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$nome = this.getNome();
        final Object other$nome = other.getNome();
        if (this$nome == null ? other$nome != null : !this$nome.equals(other$nome)) return false;
        final Object this$cpf = this.getCpf();
        final Object other$cpf = other.getCpf();
        if (this$cpf == null ? other$cpf != null : !this$cpf.equals(other$cpf)) return false;
        final Object this$pedidos = this.getPedidos();
        final Object other$pedidos = other.getPedidos();
        if (this$pedidos == null ? other$pedidos != null : !this$pedidos.equals(other$pedidos)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Cliente;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $nome = this.getNome();
        result = result * PRIME + ($nome == null ? 43 : $nome.hashCode());
        final Object $cpf = this.getCpf();
        result = result * PRIME + ($cpf == null ? 43 : $cpf.hashCode());
        final Object $pedidos = this.getPedidos();
        result = result * PRIME + ($pedidos == null ? 43 : $pedidos.hashCode());
        return result;
    }

    public String toString() {
        return "Cliente(id=" + this.getId() + ", nome=" + this.getNome() + ", cpf=" + this.getCpf() + ", pedidos=" + this.getPedidos() + ")";
    }
}
