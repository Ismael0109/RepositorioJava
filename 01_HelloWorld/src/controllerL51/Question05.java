package controllerL51;

import util.Teclado;

public class Question05 {
	/*
	 * Desenvolver um programa que apresente os resultados de uma tabela de um número qualquer. 
	 * Ela deve ser impressa no seguinte formato:  
	 * Considerando como exemplo o fornecimento do número 2 
	 * 2 . 1 = 2 
	 * 2 . 2 = 4 
	 * 2 . 3 = 6 
	 * 2 . 4 = 8 
	 * 2 . 5 = 10 
	 * (...) 
	 * 2 . 10 = 20 
	 */

	public static void main(String[] args) {
		int num, multiplicador, resp;
		
		num = Teclado.lerInt("Digite um número para saber sua tabuada");
		multiplicador = 1;
		
		while (multiplicador <= 10) 
		{
			resp = num * multiplicador;
			System.out.println(num + " x " + multiplicador + " = " + resp);		
			multiplicador++;
			
		}

	}

}
