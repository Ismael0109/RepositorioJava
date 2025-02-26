package controllerL52;

public class Question02 {
	/*
	 * Desenvolver um programa que apresente no final a soma dos valores pares existentes na faixa de 0 até 500.
	 *  Utilize um laço que varie de 2 em 2. 
	 */

	public static void main(String[] args) {
		int num = 0;
		int soma = 0;
		
		
		do {//1
			if(num % 2 == 0) {//2
			soma += num;
			System.out.println(soma + " ");
			}//2
			num++;
			
			
		}while(num <= 500); //1

	}

}
