package br.com.projetorsi.dto;

import java.util.Date;

import br.com.projetorsi.beans.Usuario;

public class UsuarioDTO {
	
	private Long id;
	private String bairro;
	private String cidade;
	private String complemento;
	private String cpf;
	private Date dataNascimento;
	private String email;
	private String estado;
	private String nome;
	private Integer numero;
	private String pais;
	private String password;
	private String rua;
	private String sobrenome;
	
	public UsuarioDTO (Usuario usuario) {
		id = usuario.getId();
		bairro = usuario.getBairro();
		cidade = usuario.getCidade();
		complemento = usuario.getComplemento();
		cpf = usuario.getCpf();
		dataNascimento = usuario.getDataNascimento();
		email = usuario.getEmail();
		estado = usuario.getEstado();
		nome = usuario.getNome();
		numero = usuario.getNumero();
		pais = usuario.getPais();
		password = usuario.getPassword();
		rua = usuario.getRua();
		sobrenome = usuario.getSobrenome();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}