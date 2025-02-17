package controllerL41;

import util.Teclado;

public class Question10 {
	/*
	 * Desenvolver um programa que pergunte dois números inteiros, 
	 * e apresente como resultado se o segundo número informado é ou não um divisor do primeiro número informado. 
	 */
	
	public static void main(String[] args) {
		
		int num1, num2, restodiv;
		
		num1 = Teclado.lerInt("Digite o Primeiro Número");
		num2 = Teclado.lerInt("Digite o Segundo Número");
		
		restodiv = num1 % num2;
		
		if (restodiv == 0) {
			System.out.println(num2 + " é divisor de " + num1);
		} else {
			System.out.println(num2 + " não é divisor de " + num1);
		}
		
	}

}
