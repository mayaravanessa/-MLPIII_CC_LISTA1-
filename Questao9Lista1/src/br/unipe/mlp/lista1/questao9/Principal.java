package br.unipe.mlp.lista1.questao9;

/* Quest�o 9
 * Feito por Diego Veloso & Mayara Vanessa - P4 - Ci�ncia da Computa��o
 */

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		Veiculo veiculo = new Veiculo();
		//VeiculoCarga veiculoCarga = new VeiculoCarga(); Teste
	   //VeiculoPasseio veiculoPasseio = new VeiculoPasseio();
		
		
		System.out.println("Digite o km Final, o Km Inicial e o Pre�o do km Rodado:");
		double KmFinal = input.nextDouble();
		double KmInicial  = input.nextDouble();
		double kmRodado = input.nextDouble();
		
		veiculo.valorLocacao(KmFinal,KmInicial,kmRodado);
		}

}
