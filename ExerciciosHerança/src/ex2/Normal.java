package ex2;

public class Normal extends Ingresso{

	
	public Normal(double valor) {
		super(valor);
	}
	
	
	public void Imprime() {
		System.out.println("Valor do ingresso normal: "+this.getValor());
	}
		
}
