package br.unipe.mlp.lista1.questao1;

/* Quest�o 8
* Feito por Diego Veloso & Mayara Vanessa - P4 - Ci�ncia da Computa��o
*/

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		FitaLancamento lancamento = new FitaLancamento();
		FitaInfantil infantil = new FitaInfantil();

		System.out.println("Digite 1- p/ lan�amento ou 2- p/ infantil? ");
		int escolha = input.nextInt();

		if(escolha == 1){
			//lancamento.getValor(); teste
			lancamento.acrescismo();
		}

		if(escolha == 2){
			//infantil.getValor();
			infantil.desconto();
		}

	}

}