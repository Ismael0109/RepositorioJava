package controllerL53;

import util.Teclado;

public class Question15 {
	/*
	 * Desenvolver um programa que pergunte o nome e o salário bruto de 10 pessoas,
	 *  e exiba nome, valor da alíquota do imposto de renda,
	 *  e o salário já com o desconto realizado, sabendo-se que: 
	 */

	public static void main(String[] args) {
		String nome;
		double salario;
		for (int x = 1; x <= 10; x++) {
			nome = Teclado.lerTexto("Digite o Nome dessa Pessoa");
			salario = Teclado.lerDouble("Digite o Salário dela");
			double aliquota;
			if (salario < 600) {
			aliquota = 0;		
				
			} else if ((salario >=600) && (salario <= 1499)){
				aliquota = salario * 0.1;
			} else {
				aliquota = salario * 0.15;
			}
			salario -= aliquota;
			System.out.println("Nome -> " + nome);
			System.out.println("Alíquota -> " + aliquota);
			System.out.println("Salário Final -> " + salario);
			System.out.println("*****PRÓXIMO*****");
			
		}
		System.out.println("*********************FIM DO PROGRAMA**********************");

	}

}
