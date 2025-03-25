package controllerL53;

import util.Teclado;

public class Question14 {
	/*
	 * Desenvolver um programa que pergunte nome, nota1 e nota2 de cada um dos 15 alunos de uma turma.
	 * E exiba a listagem contendo nome, nota1, nota2, média e apresente “APROVADO” se a média for maior ou igual a 5,
	 *  e “REPROVADO” se a média for menor que 5. Ao final, exibir também a média da turma. 
	 */

	public static void main(String[] args) {
		double media_turma = 0;
		for(int x = 1; x <=15; x++) {
		
		String nome = Teclado.lerTexto("Digite o Nome do Aluno");
		double nota1 = Teclado.lerDouble("Digite a Primeira Nota deste Aluno");
		double nota2 = Teclado.lerDouble("Digite a Segunda Nota deste Aluno");
		double media = (nota1 + nota2)/2;
		
		media_turma += media;
		if(media >= 5) {
			System.out.println("Nome -> " + nome);
			System.out.println("Nota 1 -> " + nota1);
			System.out.println("Nota 2 -> " + nota2);
			System.out.println("Média -> " + media);
			System.out.println("APROVADO");
				
			
			
		}else {
			System.out.println("Nome -> " + nome);
			System.out.println("Nota 1 -> " + nota1);
			System.out.println("Nota 2 -> " + nota2);
			System.out.println("Média -> " + media);
			System.out.println("REPROVADO");
		}
		System.out.println("*****PRÓXIMO*****");
		}
		media_turma = media_turma / 15;
		System.out.println("A Média da Turma é " + media_turma);
		System.out.println("*********************FIM DO PROGRAMA**********************");

		
		
	}

}
