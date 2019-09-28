package br.com.projetorsi.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetorsi.beans.Transferencia;
import br.com.projetorsi.dto.TransferenciaDTO;
import br.com.projetorsi.repository.TransferenciaRepository;
import br.com.projetorsi.service.TransferenciaService;

@Service
public class TransferenciaServiceImpl implements TransferenciaService {
	
	@Autowired
	private TransferenciaRepository transfRepository;

	public List<Transferencia> transferencia(Transferencia transferencia) {
		return this.transfRepository.findByTransferencia(transferencia);
	}
	
	public Transferencia fromDTO(TransferenciaDTO transferenciaDTO) {
		return new Transferencia(transferenciaDTO.getId(), transferenciaDTO.getContaDestino(), transferenciaDTO.getContaOrigem(),
				transferenciaDTO.getValor());
	}
}