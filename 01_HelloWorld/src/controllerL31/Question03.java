package controllerL31;

import util.Teclado;

public class Question03 {
	/*
	 * Fazer um programa que pergunte um valor em Dólares e apresente o equivalente em Reais. 
	 * Considere U$1,00 = R$5,78. 
	 */
	
	
	public static void main(String[] args) {
		
		double dolar, real;
		
		System.out.println("Este Programa é um conversor Dólares para Reais (ATUALIZADO EM 10/02/2025)");
		
		dolar = Teclado.lerDouble("Digite o valor em dólares");
		
		real = dolar * 5.78;
		System.out.println("U$" + dolar + " = R$" + real );
	}
}
