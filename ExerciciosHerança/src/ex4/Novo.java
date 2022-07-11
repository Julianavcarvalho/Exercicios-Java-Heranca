package ex4;

public class Novo extends Imovel{

	public Novo(String endereco, double preco) {
		super(endereco, preco);
	}
	
	public double valorNovo() {
		return this.getPreco() * 1.5;
	}
	
	public void Imprime() {
		System.out.println("O valor da casa nova em "
				+this.getEndereco()+", custa: R$ "
				+valorNovo());
	}

}
