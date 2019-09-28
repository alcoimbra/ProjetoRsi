package br.com.projetorsi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetorsi.beans.Extrato;

@Repository
public interface ExtratoRepository extends JpaRepository<Extrato, Long>{
	
	List<Extrato> findByExtrato(Extrato extrato);
	List<Extrato> findByExtroPorConta(Extrato conta);
}