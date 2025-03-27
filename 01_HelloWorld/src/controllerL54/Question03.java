package controllerL54;

import util.Teclado;

public class Question03 {
	/*
	 * Perguntar um Valor
	 * Exibir o Valor com um Acréscimo de 18%
	 * Exibir o Valor com um Desconto de 65%
	 */

	public static void main(String[] args) {
		double num = Teclado.lerDouble("Digite um Valor");
		double acrescimo = num + (num * 0.18);
		double desconto = num - (num * 0.65);
		System.out.println("Valor Inserido -> " + num);
		System.out.println("Valor com Acréscimo de 18% -> " + acrescimo);
		System.out.println("Valor com Desconto de 65% -> " + desconto);

	}

}
