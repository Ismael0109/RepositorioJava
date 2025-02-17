package controllerL41;

import util.Teclado;

public class Question01 {
	/*
	 * Desenvolver um programa que pergunte um número. 
	 * Se este número for maior que 20, então ele deverá exibir a metade deste número,
	 *  senão, ele deverá exibir o número sem alterações. 
	 */

	 

	public static void main(String[] args) {
		double num;
		
		num = Teclado.lerDouble("Informa algum número");
		
		if (num >20) {
			System.out.println("A metade de " + num + " é " + (num/2));
							
		} else {
			System.out.println(num + "O número não sofreu alterações");
			
		}
		
	}

}
