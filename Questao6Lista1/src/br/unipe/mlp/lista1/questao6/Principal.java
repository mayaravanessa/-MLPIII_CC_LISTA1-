package br.unipe.mlp.lista1.questao6;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
	    System.out.println("Digite o c�digo do produto: ");
	    int numero = input.nextInt();
	    System.out.println("Digite a descricao do produto: ");
	    String descricao = input.nextLine();
	    System.out.println("Digite a quantidade comprada: ");
	    int QntComprada = input.nextInt();
	    System.out.println("Digite o pre�o do item: ");
	    double precoItem = input.nextDouble();
	    
	    Fatura fatura = new Fatura(numero,descricao,QntComprada,precoItem);
	    
	    System.out.println("Valor Total = R$ "+fatura.getValorfatura());
	    		
	    
	}

}
