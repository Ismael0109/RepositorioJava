package Thalia_Revisao_Laco;

import java.text.DecimalFormat;

public class Question02 {
	/*
	 * (FOR) Calculadora de juros compostos mensal.
	 * Você aplicou R$ 1.000,00 em uma conta que rende 1% ao mês.
	 * Escreva um programa que calcule e mostre o saldo atualizado mês a mês durante 12 meses, com o 
	 * valor total ao final.

	 */
	public static String conversor_Decimal(double num) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		return df.format(num);
		
	}
	
	public static void main(String[] args) {
		double saldo = 1000;
		double rendimento = 0.01;
		System.out.println("Aumento de 1% a Cada Mês, Saldo Inicial = R$" + conversor_Decimal(saldo) + ":");
		System.out.println();
		for (int mes = 1; mes <= 12; mes++) {
			System.out.println("Saldo " + mes + "º Mês -> " + "R$" + conversor_Decimal(saldo));
			if(mes != 12) {
			saldo += (saldo * rendimento);
			} 
		}
		
	}

}
