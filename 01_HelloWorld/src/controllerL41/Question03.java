package controllerL41;

import util.Teclado;

public class Question03 {
	/*
	 * Desenvolver um programa que pergunte um número, 
	 * e apresente como resposta se o referido número é par ou é ímpar
	 */

	public static void main(String[] args) {
		
		int num, restodiv;
		
		num = Teclado.lerInt("Vamos descobrir se seu número é par ou ímpar. Digite um número");
		restodiv = num % 2;
		
		if (restodiv == 0) {
			
			System.out.println("Este número é PAR");
			
		}else {
			
			System.out.println("Este número é ÍMPAR");
			
		}

	}

}
