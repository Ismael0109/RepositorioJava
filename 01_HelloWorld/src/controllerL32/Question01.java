package controllerL32;

import util.Teclado;

public class Question01 {
	
	/*
	 * Desenvolver um programa que pergunte o valor da conta a ser paga no restaurante 
	 * e exiba como resposta o valor com o acréscimo dos 10% da gorjeta do garçom. 
	 */

	public static void main(String[] args) {
		
		double valCont, valFim;
		
		valCont = Teclado.lerDouble("Para saber qual o valor final da sua conta com o acréscimo do Garçom, digite qual o valor da sua Compra");
		
		valFim = valCont + (valCont*10/100);
		
		System.out.println("Sua Conta Final terá o Valor de R$" + valFim);
	}

}
