package Aulas_Joyce;

import util.Teclado;

public class Example02 {
	/*
	 * Criar um Programa onde o usuário digita um valor e ele faz a tabuada deste número
	 */

	public static void main(String[] args) {
		int num = Teclado.lerInt("Digite um Valor para Criar uma Tabuada");
		for (int x = 1; x <= 10; x++) {
			int result = num * x;
			System.out.println(num + " x " + x + " = " + result);
			
			
		}
		System.out.println("*********************FIM DO PROGRAMA**********************");

	}

}
