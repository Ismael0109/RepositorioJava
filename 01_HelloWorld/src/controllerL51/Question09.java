package controllerL51;

public class Question09 {
	/*
	 * Elaborar um programa que apresente no final a soma dos valores pares existentes na faixa de 0 até 500. 
	 * Utilize um laço que efetue a variação de 2 em 2. 
	 */

	public static void main(String[] args) {
		int soma, n, restodiv2;
		n = 0;
		soma = 0;
		while (n <= 500) { //1
			restodiv2 = n % 2;
			
			if (restodiv2 == 0) { //2
				soma += n;
				System.out.print(soma + " ");
				
			}//2
			
			
			n++;
		}//1
		
		

	}

}
