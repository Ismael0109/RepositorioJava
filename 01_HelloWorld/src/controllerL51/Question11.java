package controllerL51;

import util.Teclado;

public class Question11 {
	/*
	 * Elaborar um programa que apresente o valor 
	 * de uma potência de uma base qualquer (Variável b) elevada a um expoente qualquer (Variável e),
	 *  ou seja, de b^e. (Sem usar Math.pow();) 
	 */

	public static void main(String[] args) {
		int b, e;
		int pot = 1;
		int cont = 1;
		
		b = Teclado.lerInt("Digite a Base da Potência");
		e = Teclado.lerInt("Digite o Expoente da sua Potência");
		
		while (cont<= e) {//1
			
			pot = pot*b;
			cont++;
			
		}//1
		System.out.println(b + " ^ " + e + " = " + pot);

	}

}
