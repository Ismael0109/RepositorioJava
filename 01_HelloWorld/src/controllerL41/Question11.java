package controllerL41;

import util.Teclado;

public class Question11 {
	/*
	 * Desenvolver um programa que pergunte um número de 3 casas 
	 * e apresente como resultado somente o algarismo das centenas. 
	 */

	public static void main(String[] args) {
		int num;
		
		num = Teclado.lerInt("Digite um número natural que contenha 3 casas");
		
		if ((num >= 100) && (num < 200)) {
			System.out.println("O 1 é o algarismo das centenas");
			
		} else if ((num >= 200) && (num < 300)) {
			System.out.println("O 2 é o algarismo das centenas");
			
		} else if ((num >= 300) && (num < 400)) {
			System.out.println("O 3 é o algarismo das centenas");
			
		} else if ((num >= 400) && (num < 500)) {
			System.out.println("O 4 é o algarismo das centenas");
		
		} else if ((num >= 500) && (num < 600)) {
			System.out.println("O 5 é o algarismo das centenas");
			
		} else if ((num >= 600) && (num < 700)) {
			
			System.out.println("O 6 é o algarismo das centenas");
		} else if ((num >= 700) && (num < 800)) {
			
			System.out.println("O 7 é o algarismo das centenas");
		
		} else if ((num >= 800) && (num < 900)) {
			System.out.println("O 8 é o algarismo das centenas");
		
		} else if ((num >= 900) && (num < 1000)) {
			System.out.println("O 9 é o algarismo das centenas");
			
		} else {
			
			System.out.println("Você não digitou um número de 3 casas");
		}
		
		

	}

}
