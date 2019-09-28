package br.com.projetorsi.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetorsi.beans.Auth;
import br.com.projetorsi.beans.Usuario;
import br.com.projetorsi.dto.AuthDTO;
import br.com.projetorsi.repository.AuthRepository;
import br.com.projetorsi.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {
	
	@Autowired
	private AuthRepository authRepository;

	public List<Usuario> login(Usuario login) {
		return this.authRepository.findByLogin(login);
	}

	public List<Usuario> logout(Usuario logout) {
		return this.authRepository.findByLogout(logout);
	}
	
	public Auth fromDTO(AuthDTO authDTO) {
		return new Auth(authDTO.getId(), authDTO.getCpf(), authDTO.getPassword());
	}
}