package br.unipe.mlp.lista1.questao5;

/* Questão 5
 * Feito por Diego Veloso & Mayara Vanessa - P4 - Ciência da Computação
 */
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);		
		
		System.out.println("Digite a expressão: ");
		String expressao = input.nextLine();
		
		Funcionario func = new Funcionario(expressao);
		
		func.conversao(expressao);
		
		System.out.println("Digite outra expressão: ");
		String expressao1 = input.nextLine();
		
		func.conversao(expressao1);
	}

}
