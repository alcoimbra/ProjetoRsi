package br.com.projetorsi.service;

import br.com.projetorsi.beans.Conta;

public interface ContaService {
	
	Conta conta(Conta conta);
	Conta 	buscaDaContaEAdicionaSaldo(Conta adicionarSaldo);
	Conta buscarId(String id);

	Conta findAll();
	Conta update(Conta conta);
	Conta delete(String id);
	Conta insert(Conta conta);
}