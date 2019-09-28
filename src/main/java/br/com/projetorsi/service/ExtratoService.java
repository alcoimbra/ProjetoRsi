package br.com.projetorsi.service;

import java.util.List;

import br.com.projetorsi.beans.Extrato;

public interface ExtratoService {
	
	List<Extrato> extrato(Extrato extrato);
	List<Extrato> buscaDoExtratoPorConta(Extrato conta);
}