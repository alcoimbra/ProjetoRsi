package br.com.projetorsi.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	
	public Usuario() {}
	
	public Usuario(Long id, String bairro, String cidade, String complemento, String cpf,
			Date dataNascimento, String email, String estado, String nome, Integer numero,
			String pais, String password, String rua, String sobrenome) {
		this.id = id;
		this.bairro = bairro;
		this.cidade = cidade;
		this.complemento = complemento;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.estado = estado;
		this.nome = nome;
		this.numero = numero;
		this.pais = pais;
		this.password = password;
		this.rua = rua;
		this.sobrenome = sobrenome;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", bairro=" + bairro + ", cidade=" + cidade + ", complemento=" + complemento
				+ ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", email=" + email + ", estado=" + estado
				+ ", nome=" + nome + ", numero=" + numero + ", pais=" + pais + ", password=" + password + ", rua=" + rua
				+ ", sobrenome=" + sobrenome + "]";
	}
}