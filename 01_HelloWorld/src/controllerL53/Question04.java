package controllerL53;

public class Question04 {
	/*
	 * Desenvolver um programa que apresente todos os números divisíveis por 5 que sejam menores que 50. 
	 */

	public static void main(String[] args) {
		System.out.println("Abaixo, Todos os Números Divisíveis por 5 Menores que 50 ");
		for(int i = 0; i <= 50; i++) {
			
			if(i % 5 == 0) {
			System.out.print(i + " ");
			}
		}
		
		System.out.println("");
		System.out.println("Fim do Programa.");

	}

}
