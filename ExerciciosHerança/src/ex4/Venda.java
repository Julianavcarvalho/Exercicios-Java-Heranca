package ex4;

import java.util.Scanner;

public class Venda {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String endereco;
		double preco;
		int op;
		
		System.out.print("Onde você quer a casa? ");
		endereco = sc.next();
		System.out.print("Quanto você quer pagar? ");
		preco = sc.nextDouble();
		
		System.out.println("---OPÇÕES DE CASA---");
		System.out.println("---1- NOVA");
		System.out.println("---2- VELHA");
		op = sc.nextInt();
		
		if (op == 1) {
			Novo n = new Novo(endereco, preco);
			n.Imprime();
		} else if (op == 2) {
			Velho v = new Velho(endereco, preco);
			v.Imprime();
		}
		

	}

}
