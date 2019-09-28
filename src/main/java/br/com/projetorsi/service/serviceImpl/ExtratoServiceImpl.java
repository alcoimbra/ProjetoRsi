package br.com.projetorsi.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetorsi.beans.Extrato;
import br.com.projetorsi.dto.ExtratoDTO;
import br.com.projetorsi.repository.ExtratoRepository;
import br.com.projetorsi.service.ExtratoService;

@Service
public class ExtratoServiceImpl implements ExtratoService {
	
	@Autowired
	private ExtratoRepository extratoRepository;

	public List<Extrato> extrato(Extrato extrato) {
		return this.extratoRepository.findByExtrato(extrato);
	}

	public List<Extrato> buscaDoExtratoPorConta(Extrato conta) {
		return this.extratoRepository.findByExtroPorConta(conta);
	}
	
	public Extrato fromDTO(ExtratoDTO extratoDTO) {
		return new Extrato(extratoDTO.getId(), extratoDTO.getData(), extratoDTO.getValor(), extratoDTO.getConta());
	}
}