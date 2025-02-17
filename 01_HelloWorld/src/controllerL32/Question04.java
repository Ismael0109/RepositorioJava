package controllerL32;

import util.Teclado;

public class Question04 {
	
	/*
	 * Desenvolver um programa que pergunte ao usuário o seu peso e sua altura.
	 *  Ao final o programa deverá exibir na tela o valor do índice de massa corporal desta pessoa (IMC).  
	 *  Fórmula:  IMC = peso / altura2  -  Obs: peso em quilos e altura em metros.


	 */

	public static void main(String[] args) {
		double peso, altura, imc;
		
		peso = Teclado.lerDouble("Vamos calcular seu IMC. Digite seu Peso em KG");
		altura = Teclado.lerDouble("Agora digite sua altura em Metros");
		
		imc = peso/(altura*altura);
		 System.out.println("Seu IMC = " + imc);

	}

}
