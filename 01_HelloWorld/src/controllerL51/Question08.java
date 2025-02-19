package controllerL51;

public class Question08 {
	/*
	 * Desenvolver um programa que apresente todos os valores numéricos inteiros ímpares situados na
	 *  faixa de 0 a 20. Para saber se o número é ímpar,
	 *   será necessário verificar essa condição com o comando if.
	 *    Sendo ímpar, mostre-o; não sendo, passe para o próximo passo. 
	 */

	public static void main(String[] args) {
		int n, restodiv2;
		n = 0;
		
		System.out.println("Abaixo, todos os números Ímpares menores que 20");
		while (n <= 20) 
		{//WHILE1
			restodiv2 = n % 2;
			
			if (restodiv2 == 1)
			{//IF1
				System.out.print(n + " ");
			}//IF1
			
			n++;
			
		}//WHILE1

	}

}
