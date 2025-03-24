package controllerL53;

public class Question07 {
	/*
	 * Desenvolver um programa que apresente no final a soma dos valores pares existentes na faixa de 3 até 21. 
	 */

	public static void main(String[] args) {
		
		int soma = 0;
		System.out.println("Este Programa soma todos os números pares dentro da faixa de 3 até 21");
		for (int num = 3; num <=21; num++) {
			if (num % 2 == 0) {
			soma += num;	
			}
		}

		System.out.println("A soma = " + soma);
	}

}
