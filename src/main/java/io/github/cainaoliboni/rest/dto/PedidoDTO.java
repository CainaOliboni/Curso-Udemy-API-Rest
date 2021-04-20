package io.github.cainaoliboni.rest.dto;

import io.github.cainaoliboni.validation.NotEmptyList;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

public class PedidoDTO {

    @NotNull(message = "{campo.codigo-cliente.obrigatorio}")
    private Integer cliente;
    @NotNull(message = "{campo.total-pedido.obrigatorio}")
    private BigDecimal total;
    @NotEmptyList(message = "{campo.items-pedido.obrigatorio}")
    private List<ItemPedidoDTO> items;


    public PedidoDTO(@NotNull(message = "{campo.codigo-cliente.obrigatorio}") Integer cliente, @NotNull(message = "{campo.total-pedido.obrigatorio}") BigDecimal total, List<ItemPedidoDTO> items) {
        this.cliente = cliente;
        this.total = total;
        this.items = items;
    }

    public PedidoDTO() {
    }

    public @NotNull(message = "{campo.codigo-cliente.obrigatorio}") Integer getCliente() {
        return this.cliente;
    }

    public @NotNull(message = "{campo.total-pedido.obrigatorio}") BigDecimal getTotal() {
        return this.total;
    }

    public List<ItemPedidoDTO> getItems() {
        return this.items;
    }

    public void setCliente(@NotNull(message = "{campo.codigo-cliente.obrigatorio}") Integer cliente) {
        this.cliente = cliente;
    }

    public void setTotal(@NotNull(message = "{campo.total-pedido.obrigatorio}") BigDecimal total) {
        this.total = total;
    }

    public void setItems(List<ItemPedidoDTO> items) {
        this.items = items;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PedidoDTO)) return false;
        final PedidoDTO other = (PedidoDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$cliente = this.getCliente();
        final Object other$cliente = other.getCliente();
        if (this$cliente == null ? other$cliente != null : !this$cliente.equals(other$cliente)) return false;
        final Object this$total = this.getTotal();
        final Object other$total = other.getTotal();
        if (this$total == null ? other$total != null : !this$total.equals(other$total)) return false;
        final Object this$items = this.getItems();
        final Object other$items = other.getItems();
        if (this$items == null ? other$items != null : !this$items.equals(other$items)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PedidoDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $cliente = this.getCliente();
        result = result * PRIME + ($cliente == null ? 43 : $cliente.hashCode());
        final Object $total = this.getTotal();
        result = result * PRIME + ($total == null ? 43 : $total.hashCode());
        final Object $items = this.getItems();
        result = result * PRIME + ($items == null ? 43 : $items.hashCode());
        return result;
    }

    public String toString() {
        return "PedidoDTO(cliente=" + this.getCliente() + ", total=" + this.getTotal() + ", items=" + this.getItems() + ")";
    }
}
