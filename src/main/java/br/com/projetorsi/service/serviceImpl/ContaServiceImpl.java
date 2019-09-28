package br.com.projetorsi.service.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetorsi.beans.Conta;
import br.com.projetorsi.dto.ContaDTO;
import br.com.projetorsi.repository.ContaRepository;
import br.com.projetorsi.service.ContaService;

@Service
public class ContaServiceImpl implements ContaService {
	
	@Autowired
	private ContaRepository contaRepository;

	@Override
	public Conta conta(Conta conta) {
		return this.contaRepository.findByConta(conta);
	}


	@Override
	public Conta buscaDaContaEAdicionaSaldo(Conta adicionarSaldo) {
		return this.contaRepository.findByContaPorAdicionarSaldo(adicionarSaldo);
	}


	@Override
	public Conta buscarId(String id) {
		return this.contaRepository.findById(id);
	}


	@Override
	public Conta findAll() {
		return (Conta) this.contaRepository.findAll();
	}


	@Override
	public Conta update(Conta conta) {
		return this.contaRepository.save(conta);
	}


	@Override
	public Conta delete(String id) {
		return this.contaRepository.delete();
	}


	@Override
	public Conta insert(Conta conta) {
		return this.contaRepository.save(conta);
	}
	
	public Conta fromDTO(ContaDTO contaDTO) {
		return new Conta(contaDTO.getId(), contaDTO.getCpf(), contaDTO.getValor());
	}
}