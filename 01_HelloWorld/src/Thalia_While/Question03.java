package Thalia_While;

import util.Teclado;

public class Question03 {
	/*
	 * Ler 10 Números 
	 * Dizer QUANTOS São Positivos
	 */

	public static void main(String[] args) {
		int num;
		int x = 1;
		int contPositivo = 0;
		while (x <= 10) {
			num = Teclado.lerInt("Digite o " + x + "º Número Positivo OU Negativo");
			if(num > 0) {
				contPositivo++;
				
			}
			x++;
			
		}
		System.out.println("Você Digitou " + contPositivo + " Números Positivos!");

	}

}
