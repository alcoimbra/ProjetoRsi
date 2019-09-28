package br.com.projetorsi.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetorsi.beans.Usuario;
import br.com.projetorsi.dto.UsuarioDTO;
import br.com.projetorsi.repository.UsuarioRepository;
import br.com.projetorsi.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository userRepository;

	@Override
	public Usuario findAll() {
		return this.userRepository.findAll().get(0);
	}

	@Override
	public Usuario buscaPorCpf(String cpf) {
		return this.userRepository.findByCpf(cpf);
	}

	@Override
	public Usuario usuario(Usuario usuario) {
		return this.userRepository.findByUsuario(usuario);
	}

	@Override
	public Usuario update(Usuario usuario) {
		return this.update(usuario);
	}

	@Override
	public Usuario delete(String id) {
		return this.delete(id);
	}

	@Override
	public Usuario insert(Usuario usuario) {
		return this.userRepository.save(usuario);
	}
	
	public Usuario fromDTO(UsuarioDTO usuarioDTO) {
		return new Usuario(usuarioDTO.getId(), usuarioDTO.getBairro(), usuarioDTO.getCidade(), usuarioDTO.getComplemento(),
				usuarioDTO.getCpf(), usuarioDTO.getDataNascimento(), usuarioDTO.getEmail(), usuarioDTO.getEstado(), usuarioDTO.getNome(),
				usuarioDTO.getNumero(), usuarioDTO.getPais(), usuarioDTO.getPassword(), usuarioDTO.getRua(), usuarioDTO.getSobrenome());
	}
}