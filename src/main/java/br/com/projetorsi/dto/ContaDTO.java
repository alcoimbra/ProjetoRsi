package br.com.projetorsi.dto;

import br.com.projetorsi.beans.Conta;

public class ContaDTO {
	
	private Long id;
	private String cpf;
	private Double valor;
	
	public ContaDTO(Conta conta) {
		id = conta.getId();
		cpf = conta.getCpf();
		valor = conta.getValor();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}