package controllerL52;

public class Question07 {
	/*
	 * Desenvolver um programa que apresente as potências de 2, variando de 0 a 10
	 */

	public static void main(String[] args) {
		int pot2 = 1, potcont = 0;
		
		do {//1
			System.out.println("2 ^ " + potcont + " = " + pot2);
			pot2 = pot2 * 2;
			
			potcont++;
			
			
		} while(potcont <= 10);//1

	}

}
