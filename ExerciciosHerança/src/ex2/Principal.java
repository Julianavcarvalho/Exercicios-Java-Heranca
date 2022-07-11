package ex2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor;
		String localizacao;
		int op;
		
		System.out.print("Qual o valor padrão do ingresso?: ");
		valor = sc.nextDouble();
		
		System.out.println("--- Qual a opção de ingresso desejada?---");
		System.out.println("--- 1 - Normal");
		System.out.println("--- 2 - Vip");
		System.out.println("--- 3 - Camarote Inferior");
		System.out.println("--- 4 - Camarote Superior");
		System.out.println("--- 5 - Sair");
		op = sc.nextInt();
		
	if (op == 1) {
		Normal no = new Normal(valor);
		no.Imprime();		
	} else if (op == 2) {
		Vip vp = new Vip(valor);
		vp.Imprime();
	} else if (op == 3) {
		System.out.print("Qual a localização do seu ingresso? ");
		localizacao = sc.next();
		CamaroteInferior ci = new CamaroteInferior(valor, localizacao);
		ci.Imprime();
	} else if (op == 4) {
		CamaroteSuperior cs = new CamaroteSuperior(valor);
		cs.Imprime();
	} else if (op == 5) {
		System.out.println("Finalizando...");
	} else {
		System.out.println("opcao invalida");
	}

}
}
