package br.unipe.mlp.lista1.questao7;

import java.util.Scanner;


public class Agenda {
	
    Scanner input = new Scanner(System.in);
    
	private Contato [] contato;
	
	public Contato[] getContato() {
		return contato;
	}
	
	public void setContato(Contato[] contato) {
		this.contato = contato;
	}
	
	public Agenda(){
		Contato[] contato = new Contato[2];
	}
	
	//Perguntar ao prof porque aqui tem que ser statico
	public static void menu(){
		System.out.println("---------AGENDA TELEFÔNICA----------");
		System.out.println("1- Adicionar Contatos");
		System.out.println("2- Procurar Contatos ");
		System.out.println("3- Editar Contatos   ");
		System.out.println("4- Listar Contatos   ");
		System.out.println("5- Sair");
		
		System.out.println("Digite sua opção: ");
	}

	//Método para adicionar um contato 
	//Obs: Preciso saber como passar isso para o vetor
	
	public boolean adicionar(String nome, String telefone){
		
        //System.out.println("Digite o nome: ");
        //for (int i = 0; i < contato.length; i++){
        	
        	//getContato()[i].setNome() = input.nextLine();
        }
       // System.out.println("Digite o telefone  : ");
       // telefone = input.nextLine();
       // System.out.println("CADASTRADO COM SUCESSO");
        
	}

	public void procurar(){
		
	}
}
