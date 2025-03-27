package controllerL54;

import util.Teclado;

public class Question02 {
	/*
	 * Perguntar Valor Atual do Salário Mínimo
	 * Perguntar Valor do Salário de Uma Pessoa
	 * Exibir Quantos Salários Mínimos a Pessoa Ganha
	 */

	public static void main(String[] args) {
		double salMin, salario, quantSalMin;
		salMin = Teclado.lerDouble("Digite o Valor do Salário Mínimo Atual");
		salario = Teclado.lerDouble("Digite Seu Salário");
		quantSalMin = salario/salMin;
		System.out.println("Seu Salário de R$" + salario +" equivale a " + quantSalMin + " Salários Mínimos");

	}

}
