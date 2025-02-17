package controllerL41;

import util.Teclado;

public class Question07 {
	
	/*
	 * Desenvolver um programa que pergunte um valor inteiro positivo ou negativo, 
	 * e exiba como resposta o módulo deste valor, ou seja, o número lido como sendo positivo. 
	 */

	public static void main(String[] args) {

		int num, mod; 
		
		num = Teclado.lerInt("Digite um Número Inteiro para acharmos seu Módulo");
		
		if (num < 0) {
			mod = num * (-1);
			
			System.out.println("|" + num + "| = " +  mod);
			
		} else {
			mod = num * (1);
			System.out.println("|" + num + "| = " +  mod);
			
		}
	}

}
