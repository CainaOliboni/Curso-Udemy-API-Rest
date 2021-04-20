package io.github.cainaoliboni.domain.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "PRODUTO")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DESCRICAO")
    @NotEmpty(message = "{campo.descricao.obrigatorio}")
    private String descricao;

    @Column(name = "PRECO_UNITARIO")
    @NotNull(message = "{campo.preco.obrigatorio}")
    private BigDecimal preco;

    public Produto(Integer id, @NotEmpty(message = "{campo.descricao.obrigatorio}") String descricao, @NotNull(message = "{campo.preco.obrigatorio}") BigDecimal preco) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto() {
    }

    public Integer getId() {
        return this.id;
    }

    public @NotEmpty(message = "{campo.descricao.obrigatorio}") String getDescricao() {
        return this.descricao;
    }

    public @NotNull(message = "{campo.preco.obrigatorio}") BigDecimal getPreco() {
        return this.preco;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescricao(@NotEmpty(message = "{campo.descricao.obrigatorio}") String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(@NotNull(message = "{campo.preco.obrigatorio}") BigDecimal preco) {
        this.preco = preco;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Produto)) return false;
        final Produto other = (Produto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$descricao = this.getDescricao();
        final Object other$descricao = other.getDescricao();
        if (this$descricao == null ? other$descricao != null : !this$descricao.equals(other$descricao)) return false;
        final Object this$preco = this.getPreco();
        final Object other$preco = other.getPreco();
        if (this$preco == null ? other$preco != null : !this$preco.equals(other$preco)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Produto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $descricao = this.getDescricao();
        result = result * PRIME + ($descricao == null ? 43 : $descricao.hashCode());
        final Object $preco = this.getPreco();
        result = result * PRIME + ($preco == null ? 43 : $preco.hashCode());
        return result;
    }

    public String toString() {
        return "Produto(id=" + this.getId() + ", descricao=" + this.getDescricao() + ", preco=" + this.getPreco() + ")";
    }
}
