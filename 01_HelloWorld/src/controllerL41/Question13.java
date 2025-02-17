package controllerL41;

import util.Teclado;

public class Question13 {
	/*
	 * Desenvolver um programa que pergunte 3 valores (variáveis a, b e c) 
	 * e ao final apresente-os dispostos em ordem crescente. 
	 */

	public static void main(String[] args) {
		int a, b, c;
		
		a = Teclado.lerInt("Digite o Primeiro Valor");
		b = Teclado.lerInt("Digite o Segundo Valor");
		c = Teclado.lerInt("Digite o Terceiro Valor");
		
		if  ((a >= b)  && (a >= c) && (b >= c) ) {
			System.out.println(a + " - " + b + " - "+ c);
			
		} else if ((a >= b) && (a >= c) && (b <= c) ) {
			System.out.println(a + " - " + c + " - "+ b);
			
		} else if ((b >= a) && (b >= c) && (a >= c) ) {
			System.out.println(b + " - " + a + " - "+ c);
			
		} else if ((b >= a) && (b >= c) && (a <= c) ) {
			System.out.println(b + " - " + c + " - "+ a);
			
		} else if ((c >= a)  && (c >= b) && (a >= b) ) {
			System.out.println(c + " - " + a + " - "+ b);
			
		} else if ((c >= a)  && (c >= b) && (a <= b) ) {
			System.out.println(c + " - " + b + " - "+ a);
			
		}

	}

}
