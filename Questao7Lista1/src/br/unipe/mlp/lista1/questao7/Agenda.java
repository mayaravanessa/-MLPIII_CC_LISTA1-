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
	
	//public Agenda(){
//		Contato[] contato = new Contato[2];
//	}
	
	//Aqui é criado o menu da agenda
	public static void menu(){
		System.out.println("---------AGENDA TELEFÔNICA----------");
		System.out.println("1- Adicionar Contatos");
		System.out.println("2- Procurar Contatos ");
		System.out.println("3- Editar Contatos   ");
		System.out.println("4- Listar Contatos   ");
		System.out.println("5- Remover Contato   ");
		System.out.println("6- Fechar Agenda");
		
		System.out.println("Digite sua opção: ");
	}

	//Método para adicionar um contato 
	//Obs: Preciso saber como passar isso para o vetor
	//
	public void adicionar(Contato [] contato,String nome, String telefone){
		
        System.out.println("Digite o nome: ");
         for (int i = 0; i < this.contato.length; i++){
        	 
         }
        	
        	//getContato()[i].setNome() = input.nextLine();
        }
       // System.out.println("Digite o telefone  : ");
       // telefone = input.nextLine();
       // System.out.println("CADASTRADO COM SUCESSO");
        


	public void procurar(){
		
	}
}
