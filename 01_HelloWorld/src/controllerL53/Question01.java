package controllerL53;

public class Question01 {
	/*
	 * Desenvolver um programa que apresente todos os valores numéricos inteiros ímpares 
	 * situados na faixa de 1000 a 1500. 
	 */

	public static void main(String[] args) {
		
		System.out.println("Abaixo, Todos os Números Ímpares na Faixa de 1000 - 1500: ");
		for(int i = 1000; i <= 1500; i++) {
			
			if(i % 2 == 1) {
			System.out.print(i + " ");
			}
		}
		
		System.out.println("");
		System.out.println("Fim do Programa.");
		

	}

}
