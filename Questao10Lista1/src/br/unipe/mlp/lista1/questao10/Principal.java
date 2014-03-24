package br.unipe.mlp.lista1.questao10;

/* Questão 10
 * Feito por Diego Veloso & Mayara Vanessa - P4 - Ciência da Computação
 */

public class Principal {
	public static void main(String[] args) {
		
		Lapis circulo = new Circulo();
		Lapis quadrado = new Quadrado();
		Lapis triangulo = new Triangulo();
		
		FiguraGeometrica figura = new FiguraGeometrica(circulo);
		figura.acao();
		
		FiguraGeometrica figura1 = new FiguraGeometrica(quadrado);
		figura1.acao();
		
		FiguraGeometrica figura2 = new FiguraGeometrica(triangulo);
		figura2.acao();
		
		
	}

}
