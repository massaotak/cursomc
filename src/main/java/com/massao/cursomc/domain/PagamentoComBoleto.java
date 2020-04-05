package com.massao.cursomc.domain;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.massao.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private java.util.Date dataVencimento;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private java.util.Date dataPagamento;
	
	public PagamentoComBoleto() {
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido,
			java.util.Date dataVencimento, java.util.Date dataPagamento) {
		super(id, estado, pedido);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}

	public java.util.Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(java.util.Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public java.util.Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(java.util.Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
}
