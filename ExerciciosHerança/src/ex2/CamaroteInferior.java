package ex2;

public class CamaroteInferior extends Vip{

	private String localizacao;
	
	public CamaroteInferior(double valor, String localizacao) {
		super(valor);
		this.localizacao = localizacao;	
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public double CI() {
		return this.getValor() * 1*2;
	}
	
	public void Imprime() {
		System.out.println("Valor do Ingresso do Camarote Inferior: "+CI());
		System.out.println("Localização: "+this.getLocalizacao());
	}
	
}
