package br.com.projetorsi.dto;

import br.com.projetorsi.beans.Transferencia;

public class TransferenciaDTO {
	
	private Long id;
	private Long contaDestino;
	private Long contaOrigem;
	private Double valor;
	
	public TransferenciaDTO(Transferencia transferencia) {
		id = transferencia.getId();
		contaDestino = transferencia.getContaDestino();
		contaOrigem = transferencia.getContaOrigem();
		valor = transferencia.getValor();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(Long contaDestino) {
		this.contaDestino = contaDestino;
	}

	public Long getContaOrigem() {
		return contaOrigem;
	}

	public void setContaOrigem(Long contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}