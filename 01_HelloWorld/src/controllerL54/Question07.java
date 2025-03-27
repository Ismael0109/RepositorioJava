package controllerL54;

import util.Teclado;

public class Question07 {

	public static void main(String[] args) {
		int num = Teclado.lerInt("Digite um Número");
		if (num < 1000) {
			System.out.println(num + " é Menor que 1000");
			
		} else if ((num > 1000) && (num < 5000)) {
			System.out.println(num + " está na Entre 1000 - 5000");
			
		} else if (num > 5000) {
			System.out.println(num + " é Maior que 5000");
			
		} else if (num == 1000) {
			System.out.println(num + " é 1000");
			
		} else {
			System.out.println(num + " é 5000");
			
		}
	}

}
