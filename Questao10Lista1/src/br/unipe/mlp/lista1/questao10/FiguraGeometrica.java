package br.unipe.mlp.lista1.questao10;

public class FiguraGeometrica {
	Lapis lapis;
	
//Constutor
	public FiguraGeometrica(Lapis lapis) {
		this.lapis = lapis;
	}
//Método que fará o objeto se comportar	
	public void acao(){
		this.lapis.desenha();
	}
	
	

}
