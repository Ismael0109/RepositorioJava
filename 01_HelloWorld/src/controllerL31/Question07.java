package controllerL31;

import util.Teclado;

public class Question07 {
	/*
	 * Fazer um algoritmo que pergunte 3 números e apresente a média aritmética entre estes 3 números. 
	 */

	public static void main(String[] args) {
		double n1, n2, n3, mediaaritmetica ;
		
		System.out.println("Vamos calcular a média de 3 números que você escolher");
		
		n1 = Teclado.lerDouble("Digite o Primeiro Número");
		n2 = Teclado.lerDouble("Digite o Segundo Número");
		n3 = Teclado.lerDouble("Digite o Terceiro Número");
		
		mediaaritmetica = (n1 + n2 + n3)/3;
		
		System.out.println("A média é " + mediaaritmetica);
	}

}
