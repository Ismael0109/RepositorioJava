package controllerL51;

public class Question07 {
	
	/*
	 * Desenvolver um programa que apresente todos os números divisíveis por 4 que sejam menores que 200.
	 *  Para saber se o número é divisível por 4 será necessário verificar a lógica desta condição com o comando if. 
	 *  Sendo divisível, mostre-o; não sendo, passe para o próximo passo. 
	 *  A variável que controla o contador deve ser iniciada com valor 1
	 */

	public static void main(String[] args) {
		int n, restdiv;
		n = 1;
		
		System.out.println("Todos os números menores que 200 divisíveis por 4 são:");
		while(n < 200) 
		{
			restdiv = n % 4;
			
			if (restdiv == 0) 
			{
				System.out.println(n);
				
			}
			n++;
		}

		
	}

}
