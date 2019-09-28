package br.com.projetorsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetorsi.beans.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{
	
	Conta findByConta(Conta conta);
	Conta findByContaPorAdicionarSaldo(Conta adicionarSaldo);
	Conta findById(String id);
	Conta delete();	
}