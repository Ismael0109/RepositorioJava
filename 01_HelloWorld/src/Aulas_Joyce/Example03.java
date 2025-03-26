package Aulas_Joyce;

import util.Teclado;

public class Example03 {
	/*
	 * Ler 10 Valores
	 * Mostrar Quantos deles estão no intervalo de 10 e 20
	 * Mostrar Quantos deles estão Fora desse intervalo
	 */

	public static void main(String[] args) {
		int n, quantD = 0, quantF = 0;
		for(int x = 1; x <= 10; x++) {
			n = Teclado.lerInt("Digite o " + x + "º valor");
			if((n >= 10) && (n <= 20)) {
				quantD++;
			} else {
				quantF++;
			}
			
		}
		System.out.println("Quantidade de Números Dentro do Intervalo 10 a 20 -> " + quantD);
		System.out.println("Quantidade de Números Fora do Intervalo 10 a 20 -> " + quantF);
		System.out.println("*********************FIM DO PROGRAMA**********************");
		
		
		

	}

}
