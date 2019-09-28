package br.com.projetorsi.dto;

import java.util.Date;

import br.com.projetorsi.beans.Conta;
import br.com.projetorsi.beans.Extrato;

public class ExtratoDTO {
	
	private Long id;
	private Date data;
	private Double valor;
	
	private Conta conta;
	
	public ExtratoDTO(Extrato extrato) {
		id = extrato.getId();
		data = extrato.getData();
		valor = extrato.getValor();
		conta = extrato.getConta();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
}