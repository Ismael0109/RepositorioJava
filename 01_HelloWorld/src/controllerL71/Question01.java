package controllerL71;

import util.Teclado;

public class Question01 {
	/*
	 * Ler 5 valores de um Vetor A
	 * Apresentar a Soma de Todos os Ímpares
	 */

	public static void main(String[] args) {
		double num [] = new double [5];
		double soma = 0;
		for (int x = 0; x < 5; x++) {
			num [x] = Teclado.lerDouble("Digite o " + (x + 1) + "º Valor");
			if (num[x] % 2 == 1) {
				soma += num[x];
				
			}
			if(x != 4) {
			System.out.println("");
			System.out.println("*****PRÓXIMO*****");
			System.out.println("");
			
			}
		}
		System.out.println("Soma dos ímpares -> " + soma);
		

	}

}
