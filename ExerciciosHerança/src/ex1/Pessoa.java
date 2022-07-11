package ex1;

public class Pessoa {
	/*A CLASSE ALUNO, PROFESSOR, E FUNCIONARIO
	SERÃO FILHAS DA CLASSE PESSOA. 
	CADA UM TERÁ SEUS PROPRIO ATRIBUTOS E 
	METODOS.
	*/
	

	private String nome;
	private String cpf;
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void Imprime() {
		System.out.println("Nome: "+ nome);
		System.out.println("CPF: "+ cpf);
	}
}
