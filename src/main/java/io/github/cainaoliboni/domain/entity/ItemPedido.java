package io.github.cainaoliboni.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "ITEM_PEDIDO")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "PEDIDO_ID")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "PRODUTO_ID")
    private Produto produto;

    @Column(name = "QUANTIDADE")
    private Integer quantidade;

    public ItemPedido(Integer id, Pedido pedido, Produto produto, Integer quantidade) {
        this.id = id;
        this.pedido = pedido;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ItemPedido() {
    }

    public Integer getId() {
        return this.id;
    }

    public Pedido getPedido() {
        return this.pedido;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ItemPedido)) return false;
        final ItemPedido other = (ItemPedido) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$pedido = this.getPedido();
        final Object other$pedido = other.getPedido();
        if (this$pedido == null ? other$pedido != null : !this$pedido.equals(other$pedido)) return false;
        final Object this$produto = this.getProduto();
        final Object other$produto = other.getProduto();
        if (this$produto == null ? other$produto != null : !this$produto.equals(other$produto)) return false;
        final Object this$quantidade = this.getQuantidade();
        final Object other$quantidade = other.getQuantidade();
        if (this$quantidade == null ? other$quantidade != null : !this$quantidade.equals(other$quantidade))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ItemPedido;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $pedido = this.getPedido();
        result = result * PRIME + ($pedido == null ? 43 : $pedido.hashCode());
        final Object $produto = this.getProduto();
        result = result * PRIME + ($produto == null ? 43 : $produto.hashCode());
        final Object $quantidade = this.getQuantidade();
        result = result * PRIME + ($quantidade == null ? 43 : $quantidade.hashCode());
        return result;
    }

    public String toString() {
        return "ItemPedido(id=" + this.getId() + ", pedido=" + this.getPedido() + ", produto=" + this.getProduto() + ", quantidade=" + this.getQuantidade() + ")";
    }
}
