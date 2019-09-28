package br.com.projetorsi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetorsi.beans.Auth;
import br.com.projetorsi.beans.Usuario;

@Repository
public interface AuthRepository extends JpaRepository<Auth, Long>{
	
	List<Usuario> findByLogin(Usuario login);
	List<Usuario> findByLogout(Usuario logout);
}