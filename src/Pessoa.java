
public abstract class Pessoa {
	private String nome;
	private int idade;
	private long telefone;
	private String bi;
	private String dataNasciimento;
	private String email;
	private String genero;
	
	public Pessoa(String nome, int idade, long telefone, String bi, String email, String genero, String dataNasciimento) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.bi = bi;
		this.dataNasciimento = dataNasciimento;
		this.email = email;
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public long getTelefone() {
		return telefone;
	}
	
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	
	public String getBi() {
		return bi;
	}
	
	public void setBi(String bi) {
		this.bi = bi;
	}
	
	public String getDataNasciimento() {
		return dataNasciimento;
	}
	
	public void setDataNasciimento(String dataNasciimento) {
		this.dataNasciimento = dataNasciimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
