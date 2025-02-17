package controllerL31;

import util.Teclado;

public class Question02 {
	/*
	 * Elaborar um programa que pergunte quatro valores inteiros e apresente 2 resultados:  
	 * Resultado de suas adições 
	 * Resultado de suas multiplicações 
	 */

	public static void main(String[] args) {
		int num1, num2, num3, num4, soma, mult;
	
		System.out.println("Este é um Programa que calcula a Soma e Multiplicação de 4 números quaisquer! Vamos começar");
		num1 = Teclado.lerInt("Digite o Primeiro Valor");
		num2 = Teclado.lerInt("Digite o Segundo Valor");
		num3 = Teclado.lerInt("Digite o Terceiro Valor");
		num4 = Teclado.lerInt("Digite o Quarto Valor");
		
		soma = num1 + num2 + num3 + num4;
		mult = num1 * num2 * num3 * num4;
		
		System.out.println("A soma dos valores digitados é " + soma);
		System.out.println("Já a multiplicação dos valores digitados é " + mult);
	}

}
