package Aulas_Joyce;

import util.Teclado;

public class Example05 {
	/*
	 * Ler 10 Números
	 * Todos os Números Lidos Inferiores a 40 Devem Ser Somados
	 * Escrever a Soma Final
	 * Usando WHILE
	 */

	public static void main(String[] args) {
		int x = 1;
		int num;
		int soma = 0;
		while(x <= 10) {
			num = Teclado.lerInt("Digite o " + x + "º Valor");
			if (num < 40) {
				soma += num;
				
			}
			x++;
		}
		System.out.println("Soma dos Valores Menores que 40: " + soma);
		System.out.println("*********************FIM DO PROGRAMA**********************");

	}

}
