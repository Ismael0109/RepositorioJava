package controllerL41;

import util.Teclado;

public class Question06 {
	
	/*
	 * Desenvolver um programa que pergunte dois valores numéricos inteiros 
	 * e apresente o valor da diferença entre o maior valor e o menor valor lido. 
	 */

	public static void main(String[] args) {
		int n1, n2, diferenca;
		
		n1 = Teclado.lerInt("Digite o Primeiro Valor");
		n2 = Teclado.lerInt("Digite o Segundo Valor");
		
		if (n1 > n2) {
			
			diferenca = n1 - n2;
			System.out.println(n1 + " - " + n2 + " = " + diferenca);
		} else {
			diferenca = n2 - n1;
			System.out.println(n2 + " - " + n1 + " = " + diferenca);
		}

	}

}
