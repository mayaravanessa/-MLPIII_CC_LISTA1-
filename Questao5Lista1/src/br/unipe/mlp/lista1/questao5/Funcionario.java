package br.unipe.mlp.lista1.questao5;

public class Funcionario {
	
	private String valor;

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	//Construtor
	public Funcionario(String valor) {
		super();
		this.valor = valor;
	}
	
	
	public void conversao(String valor){
		
		//Usando a função slip
		String[] resultado = valor.split("[a-zA-Z\\W]");
		
		int soma = 0;
		
		for(int i=0; i<resultado.length; i++){
			if(resultado[i].length()>0)
			//convertendo a variavel resultado de String para inteiro	
			soma = soma + Integer.parseInt(resultado[i]); 
		}
		
		System.out.println("valor: " + valor);
		System.out.println("resultado:" + soma);
		System.out.println();
	}
	
	public void conversao2(String valor){
		String[] resultado = valor.split("[a-zA-Z\\W]");
		
		int soma = 0;
		
		for(int i=0; i<resultado.length; i++){
			if(resultado[i].length()>0)
				soma = soma + Integer.parseInt(resultado[i]);
			
			}
			
		System.out.println("valor2: " + valor);
		System.out.println("resultado:" + soma);
		
	}
	
	
	
	 

}
