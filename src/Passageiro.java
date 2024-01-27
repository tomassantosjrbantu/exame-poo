
public class Passageiro extends Pessoa{
	private long teleemergencia;
	private String bagagem;
	private int id;
	private String acompanhate;

	public Passageiro(String nome, int idade, long telefone, String bi, String email, String genero, String dataNasciimento,
			long teleemergencia, String bagagem, int id, String acompanhate) {
		super(nome, idade, telefone, bi, email, genero, dataNasciimento);
		this.teleemergencia = teleemergencia;
		this.bagagem = bagagem;
		this.id = id;
		this.acompanhate = acompanhate;
	}

	public long getTeleemergencia() {
		return teleemergencia;
	}

	public void setTeleemergencia(long teleemergencia) {
		this.teleemergencia = teleemergencia;
	}

	public String getBagagem() {
		return bagagem;
	}

	public void setBagagem(String bagagem) {
		this.bagagem = bagagem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcompanhate() {
		return acompanhate;
	}

	public void setAcompanhate(String acompanhate) {
		this.acompanhate = acompanhate;
	}
	
	
}
