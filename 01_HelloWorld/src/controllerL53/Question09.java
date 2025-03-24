package controllerL53;

import util.Teclado;

public class Question09 {
	/*
	 * Desenvolver um programa que pergunte um número inteiro e exiba os números que são,
	 *  ao mesmo tempo, múltiplos de 3 e 5, na sequência de 1 até o número informado pelo usuário. 
	 */

	public static void main(String[] args) {
		System.out.println("Este programa mostra todos os Números Múltiplos de 3 E 5 na faixa de 1 até o limite que você digite:");		
		
		int limite = Teclado.lerInt("Digite o limite");
		for (int x = 1; x <= limite; x++) {
			if((x % 3 == 0) && (x % 5 == 0)) {
				System.out.print(x + " ");
				
			} 
			
		}

	}

}
