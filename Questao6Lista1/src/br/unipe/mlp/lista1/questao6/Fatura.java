package br.unipe.mlp.lista1.questao6;

public class Fatura {
	private String numero;
	private String descricao;
	private int qntComprada;
	private double precoItem;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
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
	public Fatura (	String numero, String descricao, int qntComprada, double precoItem){
		this.numero = numero;
		this.descricao = descricao;
		this.qntComprada = qntComprada;
		this.precoItem = precoItem;
		
	}
	
	//Metodo para calcular o valor da fatura e retorna o valor 
	
	public double getValorfatura(int qntComprada, double precoItem){
		double valorTotal = (qntComprada * precoItem);
		
		return valorTotal;
	}
	
	

}
