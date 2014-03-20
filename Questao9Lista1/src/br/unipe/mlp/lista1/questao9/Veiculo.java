package br.unipe.mlp.lista1.questao9;

public class Veiculo {
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private double valorKmRodado;
	private double kmInicial;
	private double KmFinal;
	private double valorLocacao;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValorKmRodado() {
		return valorKmRodado;
	}
	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}
	public double getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(double kmInicial) {
		this.kmInicial = kmInicial;
	}
	public double getKmFinal() {
		return KmFinal;
	}
	public void setKmFinal(double kmFinal) {
		KmFinal = kmFinal;
	}
	public double getValorLocacao() {
		return valorLocacao;
	}
	public void setValorLocacao(double valorLocacao) {

		this.valorLocacao = valorLocacao;
	}
	
	//Método que calcula o valor da locação
	public void valorLocacao (double KmFinal, double kmInicial, double valorKmRodado){
		
		valorLocacao = (KmFinal - kmInicial)*valorKmRodado;
		
		System.out.println("O valor foi: R$ " +valorLocacao);
		
	}
	
	

}
