package controllerL32;

import util.Teclado;

public class Question03 {
	/*
	 * Desenvolver um programa que pergunte ao usuário o seu peso (em quilos) e sua altura (em metros).
	 *  Ao final o programa deverá exibir na tela para o usuário 
	 *  o valor do peso informado em gramas e a altura em centímetros. 
	 */

	public static void main(String[] args) {
		
		double m, cm, kg, g;
		
		System.out.println("Programa de Conversão de Peso e Altura");
		
		kg = Teclado.lerDouble("Digite seu Peso em Quilogramas (Kg)");
		m = Teclado.lerDouble("Agora, digite sua Altura em Metros (m)");
		
		g = kg * 1000;
		cm = m * 100;
		
		System.out.println("Seu Peso e altura em gramas e centímetros são respectivamente " + g + "g " + cm + "cm");
		

	}

}
