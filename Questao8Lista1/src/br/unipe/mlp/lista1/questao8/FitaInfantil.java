package br.unipe.mlp.lista1.questao8;

//Classe que contem heran�a

public class FitaInfantil extends Fita {
	
	private double valor;
	
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}


	//Aqui � calculado descontado 40 % do valor da loca��o
	public void desconto(){
		this.valor = (2.10 * 40) / 100; 
		System.out.println("O pre�o de loca��o �: R$ "+valor);
		
		double total = (2.10) - valor;
		System.out.println("O valor TOTAL � : R$ "+total);
	}
}
