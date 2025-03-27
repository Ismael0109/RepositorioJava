package controllerL54;

import util.Teclado;

public class Question04 {
	/*
	 * Perguntar Valor de um Produto à Venda
	 * Perguntar Qual a Porcentagem de Desconto Dada Pelo Vendedor
	 * Exibir Valor Final Já Com Desconto
	 */

	public static void main(String[] args) {
		
		double valor = Teclado.lerDouble("Digite o Valor do Produto");
		double desconto = Teclado.lerDouble("Digite o Desconto que Será Aplicado (em %)");
		double valorFinal = valor - ( valor * (desconto/100));
		System.out.println("Valor do Produto -> R$" + valor);
		System.out.println("Valor  do Desconto -> R$" + (valor *desconto/100));
		System.out.println("Valor Final do Produto -> R$" + valorFinal);
		

	}

}
