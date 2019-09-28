package br.com.projetorsi.service;

import br.com.projetorsi.beans.Usuario;

public interface UsuarioService {
	
	Usuario findAll();
	Usuario buscaPorCpf(String cpf);
	Usuario usuario(Usuario usuario);
	Usuario update(Usuario usuario);
	Usuario delete(String id);
	Usuario insert(Usuario usuario);
}