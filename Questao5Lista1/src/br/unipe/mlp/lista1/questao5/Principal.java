package br.unipe.mlp.lista1.questao5;

/* Quest�o 5
 * Feito por Diego Veloso & Mayara Vanessa - P4 - Ci�ncia da Computa��o
 */
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);		
		
		System.out.println("Digite a express�o: ");
		String expressao = input.nextLine();
		
		Funcionario func = new Funcionario(expressao);
		
		func.conversao(expressao);
		
		System.out.println("Digite outra express�o: ");
		String expressao1 = input.nextLine();
		
		func.conversao(expressao1);
	}

}
