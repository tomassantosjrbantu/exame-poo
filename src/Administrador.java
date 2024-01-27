
public class Administrador {
	private String emailPessoal;
	private String senha;
	
	public Administrador(String emailPessoal, String senha) {
		super();
		this.emailPessoal = emailPessoal;
		this.senha = senha;
	}
	public String getEmailPessoal() {
		return emailPessoal;
	}
	public void setEmailPessoal(String emailPessoal) {
		this.emailPessoal = emailPessoal;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
