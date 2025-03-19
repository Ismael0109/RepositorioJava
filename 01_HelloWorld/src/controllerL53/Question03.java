package controllerL53;

import util.Teclado;

public class Question03 {
	/*
	 * Desenvolver um programa que apresente os resultados de uma tabuada de um número qualquer informado pelo usuário. 
	 */
	

	public static void main(String[] args) {
		double result;
		System.out.println("Este Programa Mostra a Tabuada de Qualquer Número que Você Digitar");
		double n = Teclado.lerDouble("Digite o Número que Gostaria de Saber a Tabuada");
		
		for (double x = 0; x <= 10; x++) {
			result = x * n;
			System.out.println(n + " * " + x + " = " + result);
		}
		
		System.out.println("Fim do Programa.");
	}

}
