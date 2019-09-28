package br.com.projetorsi.dto;

import br.com.projetorsi.beans.Auth;

public class AuthDTO {
	
	private Long id;
	private String cpf;
	private String password;
	
	public AuthDTO(Auth auth) {
		id = auth.getId();
		cpf = auth.getCpf();
		password = auth.getPassword();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}