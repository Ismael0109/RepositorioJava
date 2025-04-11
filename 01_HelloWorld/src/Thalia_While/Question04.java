package Thalia_While;

import util.Teclado;

public class Question04 {
	/*
	 * Ler Números Até Digitar 0
	 * Mostrar a Média
	 */

	public static void main(String[] args) {
		double num;
		double media = 0;
		int opcao = 1;
		int x = 0;
		while (opcao != 0) {
			x++;
			num = Teclado.lerDouble("Digite o " + x + "º Número");
			
			media += num ;
			opcao = Teclado.lerInt("Deseja Continuar?(Digite 0 Para Não OU Digite Qualquer Número para Continuar)");
		}
		media /= x;
		System.out.println("Média dos " + x + " Números Digitados -> " + media);
		System.out.println("*********************FIM DO PROGRAMA**********************");


	}

}
