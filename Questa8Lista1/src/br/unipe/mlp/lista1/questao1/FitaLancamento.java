package br.unipe.mlp.lista1.questao1;

public class FitaLancamento extends Fita{

	private double valor;


	public void setValor(double valor) {
		this.valor = valor;
	}


	public double getValor() {
		return valor;
	}


//Aqui � calculado o valor da loca��o com um acrescimo de 20 %
	public void acrescismo(){
		this.valor = (1.20 * 20) / 100;
		System.out.println("O valor do acrescimo �: R$ "+valor);

		double total = (1.20) +valor;
		System.out.println("O valor TOTAL � : R$ "+total);

	}	

}
