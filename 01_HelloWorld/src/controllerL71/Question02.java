package controllerL71;

import util.Teclado;

public class Question02 {
	/*
	 * Ler um Vetor A com 15 Elementos
	 * Um Vetor B, onde cada elemento deve ser Fatorial do Elemento correspondente do vetor A
	 * Apresentar o Vetor B
	 */
	public static void main(String[] args) {
		int num[] = new int [15];
		int fatorial[] = new int [15];
		int x;
		for (x = 0; x < 15; x++) {
			fatorial[x] = 1;
			num[x] = Teclado.lerInt("Digite o " + (x + 1) + "º Número");
			for (int y = 1 ; y <= num[x]; y++) {
				fatorial[x] *= y;
				
			}
		}
		for (x = 0; x < 15; x++) {
		System.out.println(num[x] + "! = " + fatorial[x]);
		}
		System.out.println("*********************FIM DO PROGRAMA**********************");
		
	}

}
