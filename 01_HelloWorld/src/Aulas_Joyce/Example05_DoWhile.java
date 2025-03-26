package Aulas_Joyce;

import util.Teclado;

public class Example05_DoWhile {
	public static void main(String[] args) {
		int x = 1;
		int num;
		int soma = 0;
		do {
			num = Teclado.lerInt("Digite o " + x + "º Valor");
			if (num < 40) {
				soma += num;
				
			}
			x++;
		}while(x <= 10);
		System.out.println("Soma dos Valores Menores que 40: " + soma);
		System.out.println("*********************FIM DO PROGRAMA**********************");

	}

}
