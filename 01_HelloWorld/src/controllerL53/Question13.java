package controllerL53;

import util.Teclado;

public class Question13 {
	/*
	 * Sabendo-se que uma Polegada equivale a 2,54 centímetros, 
	 * desenvolver um programa que exiba uma tabela de conversões de polegadas para centímetros, 
	 * de 1 polegada até um valor inteiro de polegada inserido pelo usuário. 
	 */

	public static void main(String[] args) {
		double limite = Teclado.lerDouble("Digite um valor");
		
		System.out.print("Polegadas" + "	| Centímetros");
		System.out.println();
		for (int x = 1; x <= limite; x++) {
			System.out.print(x + " polegadas \t" + " | ");
			System.out.println(x * 2.54 + " cm");
			
			
		}

	}

}
