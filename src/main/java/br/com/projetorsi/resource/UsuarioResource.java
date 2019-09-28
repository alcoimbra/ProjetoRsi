package br.com.projetorsi.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetorsi.beans.Usuario;
import br.com.projetorsi.dto.UsuarioDTO;
import br.com.projetorsi.service.UsuarioService;
import br.com.projetorsi.service.serviceImpl.UsuarioServiceImpl;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService userService;
	
	@Autowired
	private UsuarioServiceImpl userServiceImpl;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Usuario> findByCpf(@PathVariable String cpf){
		Usuario usuario = this.userService.buscaPorCpf(cpf);
		
		return ResponseEntity.ok().body(usuario);
	}
	
	@PostMapping()
	public ResponseEntity<List<UsuarioDTO>> findAll(){
		List<Usuario> usuario = (List<Usuario>) this.userService.findAll();
		
		List<UsuarioDTO> usuarioDTO = usuario.stream().map(x -> new UsuarioDTO(x)).collect(Collectors.toList());
		
		return ResponseEntity.ok().body(usuarioDTO);
	}
	
	@PutMapping()
	public ResponseEntity<List<Usuario>> update(@RequestBody UsuarioDTO usuarioDTO, @PathVariable Long id){
		Usuario usuario = this.userServiceImpl.fromDTO(usuarioDTO);
		
		usuario.setId(id);
		
		usuario = this.userService.update(usuario);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<List<Usuario>> delete(@PathVariable String id){
		this.userService.delete(id);
		
		return ResponseEntity.noContent().build();
	}
}