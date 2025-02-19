package controllerL51;

import util.Teclado;

public class Question06 {
	/*
	 *  Desenvolver um programa que leia um número n qualquer menor ou igual a 50 
	 *  e apresente o valor obtido da multiplicação sucessiva de n por 3 enquanto o produto for menor que 250. 
	 *  (n x 3; n x 3 x 3; n x 3 x 3 x 3 etc...). 
	 */

	public static void main(String[] args) {
		int n, produto, mult3;
		
		n = Teclado.lerInt("Digite um número qualquer menor ou igual a 50");
		produto = 0;
		mult3 = 3;
		
		if (n <= 50) 
		{
			while (produto < 250) 
			{
				produto = n * mult3;
				System.out.println(n + " x " + mult3 + " = " + produto);
				mult3 = mult3 * 3;
				
			}
			
		} else 
		{
			System.out.println("O número que você digitou não é menor ou igual a 50!!! :(");
		}

	}

}
