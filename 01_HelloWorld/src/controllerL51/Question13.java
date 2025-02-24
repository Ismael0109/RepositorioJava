package controllerL51;

import util.Teclado;

public class Question13 {
	/*
	 * Desenvolver um programa que imprima a tabuada de 3 a 6. 
	 */

	public static void main(String[] args) {
		int n, multiplicador, resp;
		
			n = 3;
			multiplicador = 1;
		while (n <= 6 ) {//1
			
			while (multiplicador <= 10) 
			{//2
				resp = n * multiplicador;
				System.out.println(n + " x " + multiplicador + " = " + resp);		
				multiplicador++;
			
			}//2
			
			
			multiplicador = 1;
			n++;
		
		}//1
			
	}

}
