package controllerL52;

import util.Teclado;

public class Question08 {
	/*
	 * Desenvolver um programa que apresente o valor de uma potência de uma base qualquer 
	 * elevada a um expoente qualquer, ou seja, de be. (Não utilize Math.pow();) 
	 */

	public static void main(String[] args) {
		int b, e;
		int pot = 1;
		int cont = 1;
		
		b = Teclado.lerInt("Digite a Base da Potência");
		e = Teclado.lerInt("Digite o Expoente da sua Potência");
		
		do {//1
			
			pot = pot*b;
			cont++;
			
		}while (cont<= e);//1
		System.out.println(b + " ^ " + e + " = " + pot);


	}

}
