package io.github.cainaoliboni.domain.entity;

import io.github.cainaoliboni.domain.enums.StatusPedido;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "PEDIDO")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "CLIENTE_ID")
    private Cliente cliente;

    @Column(name="DATA_PEDIDO")
    private LocalDate dataPedido;

    @Column(name="TOTAL", precision = 20, scale = 2)
    private BigDecimal total;

    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itens;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusPedido status;

    public Pedido(Integer id, Cliente cliente, LocalDate dataPedido, BigDecimal total, List<ItemPedido> itens, StatusPedido status) {
        this.id = id;
        this.cliente = cliente;
        this.dataPedido = dataPedido;
        this.total = total;
        this.itens = itens;
        this.status = status;
    }

    public Pedido() {
    }

    public Integer getId() {
        return this.id;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public LocalDate getDataPedido() {
        return this.dataPedido;
    }

    public BigDecimal getTotal() {
        return this.total;
    }

    public List<ItemPedido> getItens() {
        return this.itens;
    }

    public StatusPedido getStatus() {
        return this.status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Pedido)) return false;
        final Pedido other = (Pedido) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$cliente = this.getCliente();
        final Object other$cliente = other.getCliente();
        if (this$cliente == null ? other$cliente != null : !this$cliente.equals(other$cliente)) return false;
        final Object this$dataPedido = this.getDataPedido();
        final Object other$dataPedido = other.getDataPedido();
        if (this$dataPedido == null ? other$dataPedido != null : !this$dataPedido.equals(other$dataPedido))
            return false;
        final Object this$total = this.getTotal();
        final Object other$total = other.getTotal();
        if (this$total == null ? other$total != null : !this$total.equals(other$total)) return false;
        final Object this$itens = this.getItens();
        final Object other$itens = other.getItens();
        if (this$itens == null ? other$itens != null : !this$itens.equals(other$itens)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Pedido;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $cliente = this.getCliente();
        result = result * PRIME + ($cliente == null ? 43 : $cliente.hashCode());
        final Object $dataPedido = this.getDataPedido();
        result = result * PRIME + ($dataPedido == null ? 43 : $dataPedido.hashCode());
        final Object $total = this.getTotal();
        result = result * PRIME + ($total == null ? 43 : $total.hashCode());
        final Object $itens = this.getItens();
        result = result * PRIME + ($itens == null ? 43 : $itens.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "Pedido(id=" + this.getId() + ", cliente=" + this.getCliente() + ", dataPedido=" + this.getDataPedido() + ", total=" + this.getTotal() + ", itens=" + this.getItens() + ", status=" + this.getStatus() + ")";
    }
}
