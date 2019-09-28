package br.com.projetorsi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetorsi.beans.Conta;
import br.com.projetorsi.dto.ContaDTO;
import br.com.projetorsi.service.ContaService;
import br.com.projetorsi.service.serviceImpl.ContaServiceImpl;

@RestController
@RequestMapping("/conta")
public class ContaResource {

	@Autowired
	private ContaService contaService;
	
	@Autowired
	private ContaServiceImpl contaServiceImpl;
	
	public ResponseEntity<Conta> insert(@RequestBody ContaDTO contaDTO){
		Conta conta = this.contaServiceImpl.fromDTO(contaDTO);
		conta = this.contaService.i
		return null;
	}
}