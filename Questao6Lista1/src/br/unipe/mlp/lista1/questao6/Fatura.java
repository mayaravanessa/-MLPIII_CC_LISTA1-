package br.unipe.mlp.lista1.questao6;

public class Fatura {
	private int numero;
	private String descricao;
	private int qntComprada;
	private double precoItem;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQntComprada() {
		return qntComprada;
	}
	public void setQntComprada(int qntComprada) {
		this.qntComprada = qntComprada;
	}
	public double getPrecoItem() {
		return precoItem;
	}
	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}
	//Construtor
	public Fatura (	int numero, String descricao, int qntComprada, double precoItem){
		this.numero = numero;
		this.descricao = descricao;
		this.qntComprada = qntComprada;
		this.precoItem = precoItem;
		
	}
	
	//Metodo para calcular o valor da fatura e retorna o valor 
	
	public double getValorfatura(){
		
		if(this.qntComprada<=0.0){
			return 0.;
		}
		
		if(this.precoItem<=0.0){
			return 0.0;
		}
		
		return  (this.qntComprada * this.precoItem);	
		
	}
	

}
