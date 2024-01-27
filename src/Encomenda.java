
public class Encomenda {
	private String remetente;
	private String destinatario;
	private String codigo;
	private String conteudo;
	
	public Encomenda(String remetente, String destinatario, String codigo, String conteudo) {
		super();
		this.remetente = remetente;
		this.destinatario = destinatario;
		this.codigo = codigo;
		this.conteudo = conteudo;
	}
	
	public String getRemetente() {
		return remetente;
	}
	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}
	
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	
}
