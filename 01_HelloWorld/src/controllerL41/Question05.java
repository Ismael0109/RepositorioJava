package controllerL41;

import util.Teclado;

public class Question05 {
	/*
	 * Desenvolver um programa que pergunte 4 notas escolares de um aluno e 
	 * exiba mensagem informando que o aluno foi aprovado se a média escolar for maior ou igual a 5. 
	 * Se o aluno não foi aprovado, indicar uma mensagem informando essa condição. 
	 * Apresentar junto com a mensagem de aprovação ou reprovação o valor da média obtida pelo aluno. 
	 */

	public static void main(String[] args) {
		double n1, n2, n3, n4, media;
		
		n1 = Teclado.lerDouble("Digite a Primeira Nota");
		n2 = Teclado.lerDouble("Digite a Segunda Nota");
		n3 = Teclado.lerDouble("Digite a Terceira Nota");
		n4 = Teclado.lerDouble("Digite a Quarta Nota");
		
		media = (n1+n2+n3+n4)/4;
		
		if (media >= 5) {
			System.out.println("APROVADO");
		} else {
			
			System.out.println("REPROVADO");
		}
	}
}
