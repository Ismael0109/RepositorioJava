package controllerL51;

public class Question14 {
	/*
	 * Desenvolver um programa que calcule o fatorial do número 5, ou seja, 5!.
	 *  Desta forma, temos que 5! = 5 . 4 . 3 . 2 . 1 
	 *  ou 5! = 1 . 2 . 3 . 4 . 5, equivalente a 120. 
	 */

	public static void main(String[] args) {
		
		int mult = 1;
		int fatorial = 1;
		
		while (mult <= 5) {//1
		 fatorial = fatorial * mult;
		 mult++;
			
		}//1
		System.out.println("5! = " + fatorial);
		

	}

}
