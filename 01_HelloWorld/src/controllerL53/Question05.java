package controllerL53;

public class Question05 {
	/*
	 * Desenvolver um programa que apresente as potências de 2, variando de 0 a 10. 
	 */

	public static void main(String[] args) {
		System.out.println("Abaixo, as 10 Primeiras Potências de 2:");
		for (int x = 0; x <= 10; x++  ) {
			System.out.println("2 ^ " + x + " = " + Math.pow(2, x));
			System.out.println("Fim do Programa.");
		}

	}

}
