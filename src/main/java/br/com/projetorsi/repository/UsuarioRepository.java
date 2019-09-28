package br.com.projetorsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetorsi.beans.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Usuario findByCpf(String cpf);
	Usuario findByUsuario(Usuario usuario);
}