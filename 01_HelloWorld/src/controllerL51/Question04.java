package controllerL51;

public class Question04 {
	/*
	 * Desenvolver um programa que apresente o valor da soma dos cem primeiros números inteiros 
	 * (1 + 2 + 3 + 4 + ... + 97 + 98 + 99 + 100) 
	 */

	public static void main(String[] args) {
		int n, soma;
		n = 1;
		soma = 0;
		
		while(n <= 100) 
		{
			soma = soma + n;
			n++;	
		}
		
		System.out.println("100? = 1 + 2 + 3 + 4 + ... + 99 + 100 = " + soma);
		
	}

}
