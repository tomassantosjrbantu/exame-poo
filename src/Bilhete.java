
public class Bilhete {
	private double preco;
	String dataHoraPartida;
	String dataHoraChegada;
	private int idade;
	private String dataHoraFormatada; 

	public Bilhete(double preco, String dataHoraPartida, String dataHoraChegada, int idade, String dataHoraFormatada) {
		super();
		this.preco = preco;
		this.dataHoraPartida = dataHoraPartida;
		this.dataHoraChegada = dataHoraChegada;
		this.idade = idade;
		this.dataHoraFormatada = dataHoraFormatada;
	}

	public double getPreco() {
		return preco;
	}
	
	public double getPreco(int idade) {
		return ((this.preco-0.25*this.preco)+this.preco);
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDataHoraPartida() {
		return dataHoraPartida;
	}

	public void setDataHoraPartida(String dataHoraPartida) {
		this.dataHoraPartida = dataHoraPartida;
	}

	public String getDataHoraChegada() {
		return dataHoraChegada;
	}

	public void setDataHoraChegada(String dataHoraChegada) {
		this.dataHoraChegada = dataHoraChegada;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataHoraFormatada() {
		return dataHoraFormatada;
	}

	public void setDataHoraFormatada(String dataHoraFormatada) {
		this.dataHoraFormatada = dataHoraFormatada;
	}
	
}
