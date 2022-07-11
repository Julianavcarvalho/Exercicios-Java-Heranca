package ex3;

public class CD extends Produto{

	private int faixas;
	
	public CD(String nome, double preco, int faixa) {
		super(nome, preco);
		this.faixas = faixa;
	}
	
	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}



	public void Imprime() {
		System.out.println("O CD: "+this.getNome()
		+", tem "+this.getFaixas()+", e custa R$"
		+ this.getPreco());
	}
	

}
