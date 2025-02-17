package controllerL41;

import util.Teclado;

public class Question02 {
	/*
	 * Desenvolver um programa que permita ao aluno responder qual a capital do Brasil. 
	 * O programa deverá exibir se a resposta está certa ou errada.  
	 */

	public static void main(String[] args) {
		
		String capital;
		
		System.out.println("Vamos ver se você conhece bem o seu País");
		
		capital = Teclado.lerTexto("Qual a Capital do Brasil");
		
	if ((capital.equals("Brasilia")) || (capital.equals("Brasília")) || (capital.equals("brasília")) || (capital.equals("brasilia")) ) {
		
		System.out.println("OHHHHH Parabéns!! Você Acertou! A Capital do Brasil é Brasília");
		
	} else {
		System.out.println("Que Pena!! Você Errou! A Capital do Brasil é Brasília. Vai estudar um pouco");
		
			
	}
		
	}

}
