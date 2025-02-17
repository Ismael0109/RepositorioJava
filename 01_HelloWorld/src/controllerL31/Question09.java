package controllerL31;

import util.Teclado;

public class Question09 {
	/*
	 * Fazer um algoritmo que pergunte 1 número e apresente: 
	 * O próprio namer 
	 * O quadrado deste número 
	 * A raiz quadrada deste número
	 */

	public static void main(String[] args) {
		double num, pot2, raiz2 ;
		
		num = Teclado.lerDouble("Digite o Número que você quer descobrir O quadrado e a raiz quadrada");
		
		pot2 = num*num;
		raiz2 = Math.pow(num, 0.5);
		
		System.out.println("O Quadrado de " + num + " é " +  pot2);
		System.out.println("A Raiz Quadrada de " + num + " é " +  raiz2);
		
	}

}
