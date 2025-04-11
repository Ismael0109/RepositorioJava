package controllerL71;

import util.Teclado;

public class Question02 {
	/*
	 * Ler um Vetor A com 15 Elementos
	 * Um Vetor B, onde cada elemento deve ser Fatorial do Elemento correspondente do vetor A
	 * Apresentar o Vetor B
	 */
	public static long CalculoFatorial(int n) {
		long fat = 1;
		for(int i = 2; i <= n; i++) {
			fat *= i;
		}
		return fat;
	}
public static void main(String[] args) {
		
		int num[] = new int [15]; //Array de  Armazenamento de Números Digitados
		int fatorial[] = new int [15]; // Array de Armazenamento do Fatorial de Cada Número "num"
		int x; //Contador do For 1 e 2
		
		for (x = 0; x < 15; x++) {//For 1
			
			fatorial[x] = 1; //Calculo de Fatorial
			num[x] = Teclado.lerInt("Digite o " + (x + 1) + "º Número");
			for (int y = 1 ; y <= num[x]; y++) {
				fatorial[x] *= y;
				
			}
		}//Fim For 1
		for (x = 0; x < 15; x++) {
		System.out.println(num[x] + "! = " + fatorial[x]);
		}
		System.out.println("*********************FIM DO PROGRAMA**********************");
		
		
		
		
	}

}
