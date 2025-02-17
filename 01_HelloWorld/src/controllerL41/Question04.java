package controllerL41;

import util.Teclado;

public class Question04 {
	/*
	 * Desenvolver um programa que pergunte um valor numérico inteiro e 
	 * faça a exibição desse valor caso seja divisível por 4 e 5.
	 *  Não sendo divisível por 4 e 5, 
	 *  o programa deverá exibir a mensagem “Valor não é divisível por 4 e 5”.	
	 */

	public static void main(String[] args) {
		int num, restodiv4, restodiv5;
		
		num = Teclado.lerInt("Digite um número para sabermos se ele é divisível por 4 e 5");
		
		restodiv4 = num % 4;
		restodiv5 = num % 5;
		
		if ((restodiv4 == 0) && (restodiv5 == 0)){
			System.out.println(num + " é divisível por 4 e 5");
			
		} else {
			System.out.println(num + " não é divisível por 4 e 5");
			
		}

	}

}
