package controllerL31;

import util.Teclado;

public class Question05 {
	/*
	 * Fazer um programa que pergunte o salário de um funcionário e apresente este salário com um aumento de 15%. 
	 */
	
	public static void main(String[] args) { 
		double sal, salf;
		
		sal = Teclado.lerDouble("Digite seu salário para reajustarmos");
		
		salf = sal + (sal * 15/100);
		
		System.out.println("Seu salário reajustado será de R$" + salf);
	
}
}
