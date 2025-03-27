package controllerL54;

import util.Teclado;

public class Question06 {
	/*
	 * Pedir um Número
	 * Informar se está acima ou abaixo de 1000
	 */

	public static void main(String[] args) {
		int num = Teclado.lerInt("Digite um Número");
		if (num > 1000) {
			System.out.println(num + " é Maior que 1000");
			
		} else if (num < 1000) {
			System.out.println(num + " é Menor que 1000");
			
		} else {
			System.out.println(num + " é 1000");
			
		}

	}

}
