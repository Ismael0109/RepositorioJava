package controllerL41;

import util.Teclado;

public class Question07 {
	
	/*
	 * Desenvolver um programa que pergunte um número inteiro qualquer e 
	 * verifique se ele está na faixa de 1 a 10. 
	 */

	public static void main(String[] args) {

		int num;
		
		num = Teclado.lerInt("Digite um Número inteiro ");
		
		if ((num > 0 ) && (num < 11)) {
			
			System.out.println(num + " está na faixa de 1 a 10");
			
		} else {
			
			System.out.println(num + " não está na faixa de 1 a 10");
		}
	}

}
