package Prova30;

import util.Teclado;

public class Question05 {
	/*
	 * Receber 3 Notas de um Aluno
	 * Calcular a Média
	 * Exibir Média e Situação
	 * <5 - Reprovado
	 * >= 5 && <= 6.9 - Recuperação
	 * >= 7 - Aprovado
	 */

	public static void main(String[] args) {
		double nota; 
		double media = 0;
		for (int x = 1; x <= 3; x++) {
			nota = Teclado.lerDouble("Digite a " + x + "º Nota do(a) Aluno(a)");
			media += nota;
			
		}
		media = media / 3;
		System.out.println("Média -> " + media);
		if (media < 5) {
			System.out.println("Situação -> Reprovado");
			
		} else if ((media >= 5) && (media <= 6.9))  {
			System.out.println("Situação -> Recuperação");
			
		} else {
			System.out.println("Situação -> Aprovado");
		
		}
		System.out.println("");
		System.out.println("*****FIM DO PROGRAMA*****");

	}

}
