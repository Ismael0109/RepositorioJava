package controllerL54;

import util.Teclado;

public class Question05 {
	/*
	 * Pedir um Número de 3 Dígitos
	 * Exibir de Forma Invertida
	 */

	public static void main(String[] args) {
		int num = Teclado.lerInt("Digite um Número de 3 Dígitos");
		int centenas = num / 100;
		int dezenas = ((num/10) - (centenas * 10));
		int unidades = (num - ((num/10)*10));
		System.out.println(unidades + "" + dezenas + "" + centenas);
		

	}

}
