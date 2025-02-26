package controllerL52;

public class Question01 {
	/*
	 * Desenvolver um programa que apresente todos os valores numéricos inteiros pares situados na faixa de 100 a 200. 
	 */

	public static void main(String[] args) {
		int cont = 100;
		
		do {//1
			
			if((cont % 2) == 0) {//2	
				System.out.println(cont);
			}//2
			
			cont++;
		}while (cont<= 200); //1

	}

}
