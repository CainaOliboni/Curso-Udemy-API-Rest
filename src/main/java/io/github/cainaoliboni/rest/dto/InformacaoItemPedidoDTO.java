package io.github.cainaoliboni.rest.dto;

import java.math.BigDecimal;

public class InformacaoItemPedidoDTO {

    private String descricaoProduto;
    private BigDecimal precoUnitario;
    private Integer quantidade;

    public InformacaoItemPedidoDTO(String descricaoProduto, BigDecimal precoUnitario, Integer quantidade) {
        this.descricaoProduto = descricaoProduto;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public InformacaoItemPedidoDTO() {
    }

    public static InformacaoItemPedidoDTOBuilder builder() {
        return new InformacaoItemPedidoDTOBuilder();
    }

    public String getDescricaoProduto() {
        return this.descricaoProduto;
    }

    public BigDecimal getPrecoUnitario() {
        return this.precoUnitario;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof InformacaoItemPedidoDTO)) return false;
        final InformacaoItemPedidoDTO other = (InformacaoItemPedidoDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$descricaoProduto = this.getDescricaoProduto();
        final Object other$descricaoProduto = other.getDescricaoProduto();
        if (this$descricaoProduto == null ? other$descricaoProduto != null : !this$descricaoProduto.equals(other$descricaoProduto))
            return false;
        final Object this$precoUnitario = this.getPrecoUnitario();
        final Object other$precoUnitario = other.getPrecoUnitario();
        if (this$precoUnitario == null ? other$precoUnitario != null : !this$precoUnitario.equals(other$precoUnitario))
            return false;
        final Object this$quantidade = this.getQuantidade();
        final Object other$quantidade = other.getQuantidade();
        if (this$quantidade == null ? other$quantidade != null : !this$quantidade.equals(other$quantidade))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof InformacaoItemPedidoDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $descricaoProduto = this.getDescricaoProduto();
        result = result * PRIME + ($descricaoProduto == null ? 43 : $descricaoProduto.hashCode());
        final Object $precoUnitario = this.getPrecoUnitario();
        result = result * PRIME + ($precoUnitario == null ? 43 : $precoUnitario.hashCode());
        final Object $quantidade = this.getQuantidade();
        result = result * PRIME + ($quantidade == null ? 43 : $quantidade.hashCode());
        return result;
    }

    public String toString() {
        return "InformacaoItemPedidoDTO(descricaoProduto=" + this.getDescricaoProduto() + ", precoUnitario=" + this.getPrecoUnitario() + ", quantidade=" + this.getQuantidade() + ")";
    }

    public static class InformacaoItemPedidoDTOBuilder {
        private String descricaoProduto;
        private BigDecimal precoUnitario;
        private Integer quantidade;

        InformacaoItemPedidoDTOBuilder() {
        }

        public InformacaoItemPedidoDTOBuilder descricaoProduto(String descricaoProduto) {
            this.descricaoProduto = descricaoProduto;
            return this;
        }

        public InformacaoItemPedidoDTOBuilder precoUnitario(BigDecimal precoUnitario) {
            this.precoUnitario = precoUnitario;
            return this;
        }

        public InformacaoItemPedidoDTOBuilder quantidade(Integer quantidade) {
            this.quantidade = quantidade;
            return this;
        }

        public InformacaoItemPedidoDTO build() {
            return new InformacaoItemPedidoDTO(descricaoProduto, precoUnitario, quantidade);
        }

        public String toString() {
            return "InformacaoItemPedidoDTO.InformacaoItemPedidoDTOBuilder(descricaoProduto=" + this.descricaoProduto + ", precoUnitario=" + this.precoUnitario + ", quantidade=" + this.quantidade + ")";
        }
    }
}
