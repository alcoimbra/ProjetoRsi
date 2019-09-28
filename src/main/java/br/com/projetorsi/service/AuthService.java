package br.com.projetorsi.service;

import java.util.List;

import br.com.projetorsi.beans.Usuario;

public interface AuthService {
	
	List<Usuario> login(Usuario login);
	List<Usuario> logout(Usuario logout);
}