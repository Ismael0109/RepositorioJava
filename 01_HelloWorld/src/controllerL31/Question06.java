package controllerL31;

import util.Teclado;

public class Question06 {
	/*
	 * Fazer um programa que pergunte uma temperatura ao usuário, em graus Fahrenheit, 
	 * e apresente esta temperatura convertida em graus Celsius. 
	 * A fórmula da conversão é c = (f – 32) x 5 : 9 
	 *  , onde c  é a temperatura em graus Celsius e f  em Fahrenheit. 
	 */

	public static void main(String[] args) {
		double	f, c;
		
		System.out.println("Este é um Conversor de Temperatura em °F para °C");
		
		f = Teclado.lerDouble("Digite a Temperatura em Graus Fahrenheit (°F) *Digite Apenas Números*");
		c = (f - 32) * 5 /9;
		
		System.out.println(f + "°F = " + c + "°C");

	}

}
