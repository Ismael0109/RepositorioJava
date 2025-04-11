package controllerL71;

import util.Teclado;

public class Question03 {
	/*
	 * Ler 20 Elementos de um Vetor A
	 * E Construa um Vetor B Invertendo os Elementos
	 */

	public static void main(String[] args) {
		int nA [] = new int [20];
		int nB [] = new int [20];
		int y = 19;
		
		for (int x = 0; x < 20; x++) {
			nA[x] = Teclado.lerInt("Digite o " + (x + 1) + "º Número");
			
			nB[y] = nA[x];
			y--;
		}
		for (y = 0; y < 20; y++) {
			//if(y < 19) {
				System.out.print(nB[y] + " - ");
			//} else {
				//System.out.println(nB[y]);
				
			//}
			}
			System.out.println("*********************FIM DO PROGRAMA**********************");
			
		

	}

}
