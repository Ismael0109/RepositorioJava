package controllerL41;

import util.Teclado;

public class Question08 {
	/*
	 * Desenvolver um programa que pergunte um número e 
	 * exiba a informação de que ele é positivo, negativo ou nulo. 
	 */

	public static void main(String[] args) {
		
		int num;
		
		num = Teclado.lerInt("Digite um Número inteiro ");
		
		if (num > 0 ) {
			
			System.out.println(num + " é Positivo");
			
		}  else if (num == 0) {
			
			System.out.println(num + " é Nulo");
			
		} else {
			System.out.println(num + " é Negativo");
			
		}

	}

}
