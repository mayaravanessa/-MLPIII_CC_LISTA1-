package br.unipe.mlp.lista1.questao8;

//Classe que contem herança

public class FitaInfantil extends Fita {
	
	private double valor;
	
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}


	//Aqui é calculado descontado 40 % do valor da locação
	public void desconto(){
		this.valor = (2.10 * 40) / 100; 
		System.out.println("O preço de locação é: R$ "+valor);
		
		double total = (2.10) - valor;
		System.out.println("O valor TOTAL é : R$ "+total);
	}
}
