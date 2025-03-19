package controllerL53;

import util.Teclado;

public class Question06 {
	/*
	 * Desenvolver um programa que apresente o valor de uma potência de uma base qualquer elevada 
	 * a um expoente qualquer, ou seja, de be, onde os valores de b e e são fornecidos pelo usuário, 
	 * sem utilizar Math.pow(). 
	 */

	public static void main(String[] args) {
		int b, e;
		int pot = 1;
		
		System.out.println("Este Programa Exibe a Resposta de Qualquer Potência que Você Digitar.");
		System.out.println("Para Começar:");
		
		b = Teclado.lerInt("Digite a Base da Potência");
		e = Teclado.lerInt("Digite o Expoente da sua Potência");
		
		for (int cont = 1; cont<= e; cont++) {//1
			
			pot = pot*b;
			
			
		}//1
		System.out.println(b + " ^ " + e + " = " + pot);
		System.out.println("Fim do Programa.");
	}

}
