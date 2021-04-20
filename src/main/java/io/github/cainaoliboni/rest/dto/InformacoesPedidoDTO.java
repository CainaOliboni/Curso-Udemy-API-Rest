package io.github.cainaoliboni.rest.dto;

import java.math.BigDecimal;
import java.util.List;

public class InformacoesPedidoDTO {

    private Integer codigo;
    private String cpf;
    private String nomeCliente;
    private BigDecimal total;
    private String dataPedido;
    private String status;
    private List<InformacaoItemPedidoDTO> items;

    public InformacoesPedidoDTO(Integer codigo, String cpf, String nomeCliente, BigDecimal total, String dataPedido, String status, List<io.github.cainaoliboni.rest.dto.InformacaoItemPedidoDTO> items) {
        this.codigo = codigo;
        this.cpf = cpf;
        this.nomeCliente = nomeCliente;
        this.total = total;
        this.dataPedido = dataPedido;
        this.status = status;
        this.items = items;
    }

    public InformacoesPedidoDTO() {
    }

    public static InformacoesPedidoDTOBuilder builder() {
        return new InformacoesPedidoDTOBuilder();
    }

    public Integer getCodigo() {
        return this.codigo;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public BigDecimal getTotal() {
        return this.total;
    }

    public String getDataPedido() {
        return this.dataPedido;
    }

    public String getStatus() {
        return this.status;
    }

    public List<io.github.cainaoliboni.rest.dto.InformacaoItemPedidoDTO> getItems() {
        return this.items;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setItems(List<io.github.cainaoliboni.rest.dto.InformacaoItemPedidoDTO> items) {
        this.items = items;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof InformacoesPedidoDTO)) return false;
        final InformacoesPedidoDTO other = (InformacoesPedidoDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$codigo = this.getCodigo();
        final Object other$codigo = other.getCodigo();
        if (this$codigo == null ? other$codigo != null : !this$codigo.equals(other$codigo)) return false;
        final Object this$cpf = this.getCpf();
        final Object other$cpf = other.getCpf();
        if (this$cpf == null ? other$cpf != null : !this$cpf.equals(other$cpf)) return false;
        final Object this$nomeCliente = this.getNomeCliente();
        final Object other$nomeCliente = other.getNomeCliente();
        if (this$nomeCliente == null ? other$nomeCliente != null : !this$nomeCliente.equals(other$nomeCliente))
            return false;
        final Object this$total = this.getTotal();
        final Object other$total = other.getTotal();
        if (this$total == null ? other$total != null : !this$total.equals(other$total)) return false;
        final Object this$dataPedido = this.getDataPedido();
        final Object other$dataPedido = other.getDataPedido();
        if (this$dataPedido == null ? other$dataPedido != null : !this$dataPedido.equals(other$dataPedido))
            return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$items = this.getItems();
        final Object other$items = other.getItems();
        if (this$items == null ? other$items != null : !this$items.equals(other$items)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof InformacoesPedidoDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $codigo = this.getCodigo();
        result = result * PRIME + ($codigo == null ? 43 : $codigo.hashCode());
        final Object $cpf = this.getCpf();
        result = result * PRIME + ($cpf == null ? 43 : $cpf.hashCode());
        final Object $nomeCliente = this.getNomeCliente();
        result = result * PRIME + ($nomeCliente == null ? 43 : $nomeCliente.hashCode());
        final Object $total = this.getTotal();
        result = result * PRIME + ($total == null ? 43 : $total.hashCode());
        final Object $dataPedido = this.getDataPedido();
        result = result * PRIME + ($dataPedido == null ? 43 : $dataPedido.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $items = this.getItems();
        result = result * PRIME + ($items == null ? 43 : $items.hashCode());
        return result;
    }

    public String toString() {
        return "InformacoesPedidoDTO(codigo=" + this.getCodigo() + ", cpf=" + this.getCpf() + ", nomeCliente=" + this.getNomeCliente() + ", total=" + this.getTotal() + ", dataPedido=" + this.getDataPedido() + ", status=" + this.getStatus() + ", items=" + this.getItems() + ")";
    }

    public static class InformacoesPedidoDTOBuilder {
        private Integer codigo;
        private String cpf;
        private String nomeCliente;
        private BigDecimal total;
        private String dataPedido;
        private String status;
        private List<io.github.cainaoliboni.rest.dto.InformacaoItemPedidoDTO> items;

        InformacoesPedidoDTOBuilder() {
        }

        public InformacoesPedidoDTOBuilder codigo(Integer codigo) {
            this.codigo = codigo;
            return this;
        }

        public InformacoesPedidoDTOBuilder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public InformacoesPedidoDTOBuilder nomeCliente(String nomeCliente) {
            this.nomeCliente = nomeCliente;
            return this;
        }

        public InformacoesPedidoDTOBuilder total(BigDecimal total) {
            this.total = total;
            return this;
        }

        public InformacoesPedidoDTOBuilder dataPedido(String dataPedido) {
            this.dataPedido = dataPedido;
            return this;
        }

        public InformacoesPedidoDTOBuilder status(String status) {
            this.status = status;
            return this;
        }

        public InformacoesPedidoDTOBuilder items(List<io.github.cainaoliboni.rest.dto.InformacaoItemPedidoDTO> items) {
            this.items = items;
            return this;
        }

        public InformacoesPedidoDTO build() {
            return new InformacoesPedidoDTO(codigo, cpf, nomeCliente, total, dataPedido, status, items);
        }

        public String toString() {
            return "InformacoesPedidoDTO.InformacoesPedidoDTOBuilder(codigo=" + this.codigo + ", cpf=" + this.cpf + ", nomeCliente=" + this.nomeCliente + ", total=" + this.total + ", dataPedido=" + this.dataPedido + ", status=" + this.status + ", items=" + this.items + ")";
        }
    }
}
