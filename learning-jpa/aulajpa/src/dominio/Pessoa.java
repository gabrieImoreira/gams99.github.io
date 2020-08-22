package dominio;

import java.io.Serializable;

public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nomeString;
	private String email;
	
	public Pessoa() {
		
	}
	
	public Pessoa(Integer id, String nomeString, String email) {
		super();
		this.id = id;
		this.nomeString = nomeString;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeString() {
		return nomeString;
	}

	public void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nomeString=" + nomeString + ", email=" + email + "]";
	}
	
}
