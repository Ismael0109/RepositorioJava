package controllerL53;

import util.Teclado;

public class Question10 {
	/*
	 * Desenvolver um programa que apresente o fatorial de um número informado pelo usuário. 
	 */

	public static void main(String[] args) {
		System.out.println("*****CALCULADORA DE FATORIAL*****");
		int fatorial = 1;
		int num = Teclado.lerInt("Digite o Número");
		for (int x = 1; x <= num; x++) {
			
			fatorial *= x;
			
			
		}
		System.out.println(num + "! = " + fatorial);
		System.out.println("*****FIM DO PROGRAMA*****");
	}

}
