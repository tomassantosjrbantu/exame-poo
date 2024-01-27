
public class Mecanico extends Pessoa{
	private String especialidade;
	private int experiencia;

	public Mecanico(String nome, int idade, long telefone, String bi, String email, String genero,
			String dataNasciimento, String especialidade, int experiencia) {
		super(nome, idade, telefone, bi, email, genero, dataNasciimento);
		this.especialidade = especialidade;
		this.experiencia = experiencia;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
}
