package controllerL41;

import util.Teclado;

public class Question12 {
	/*
	 * Desenvolver um programa que pergunte 3 valores (variáveis a, b e c) 
	 * e ao final apresente-os dispostos em ordem crescente. 
	 */

	public static void main(String[] args) {
		double a, b, c;
		
		a = Teclado.lerDouble("Digite o Primeiro Valor");
		b = Teclado.lerDouble("Digite o Segundo Valor");
		c = Teclado.lerDouble("Digite o Terceiro Valor");
		
		if ((a <= b ) && (b <= c)) {
			System.out.println(a + b + c);
			
		} else if ((b <= a ) && (a >= c)) {
			System.out.println(b + a + c);
			
		} else if ((c <= a ) && (a <= b)) {
			System.out.println(c + a + c);
			
		} else if ((a <= b ) && (a >= c)) {
			
		} //continuar

	}

}
