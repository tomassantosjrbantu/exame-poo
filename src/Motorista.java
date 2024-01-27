
public class Motorista extends Pessoa{
	private String rota;
	private String transportadora;
	private int esperiencia;

	public Motorista(String nome, int idade, long telefone, String bi, String email, String genero,
			String dataNasciimento, String rota, String transportadora, int esperiencia) {
		super(nome, idade, telefone, bi, email, genero, dataNasciimento);
		this.rota = rota;
		this.transportadora = transportadora;
		this.esperiencia = esperiencia;
	}

	public String getRota() {
		return rota;
	}

	public void setRota(String rota) {
		this.rota = rota;
	}

	public String getTransportadora() {
		return transportadora;
	}

	public void setTransportadora(String transportadora) {
		this.transportadora = transportadora;
	}

	public int getEsperiencia() {
		return esperiencia;
	}

	public void setEsperiencia(int esperiencia) {
		this.esperiencia = esperiencia;
	}
}
