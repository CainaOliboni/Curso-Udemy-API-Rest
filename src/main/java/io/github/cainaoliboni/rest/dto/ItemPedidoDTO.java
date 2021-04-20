package io.github.cainaoliboni.rest.dto;

public class ItemPedidoDTO {

    private Integer produto;
    private Integer quantidade;

    public ItemPedidoDTO(Integer produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ItemPedidoDTO() {
    }

    public Integer getProduto() {
        return this.produto;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setProduto(Integer produto) {
        this.produto = produto;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ItemPedidoDTO)) return false;
        final ItemPedidoDTO other = (ItemPedidoDTO) o;
        if (!other.canEqual((Object) this)) return false;
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
        return other instanceof ItemPedidoDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $produto = this.getProduto();
        result = result * PRIME + ($produto == null ? 43 : $produto.hashCode());
        final Object $quantidade = this.getQuantidade();
        result = result * PRIME + ($quantidade == null ? 43 : $quantidade.hashCode());
        return result;
    }

    public String toString() {
        return "ItemPedidoDTO(produto=" + this.getProduto() + ", quantidade=" + this.getQuantidade() + ")";
    }
}
