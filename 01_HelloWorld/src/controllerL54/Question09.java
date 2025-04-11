package controllerL54;

import util.Teclado;

public class Question09 {
	/*
	 * Pedir um Número de 1 a 7
	 * Indicar qual dia da semana é 
	 */

	public static void main(String[] args) {
  int x = 0;
  while ((x != 1) && (x != 2) && (x != 3) && (x != 4) && (x != 5) && (x != 6) && (x != 7)) {

		x = Teclado.lerInt("Digite um Número de 1 a 7");

		if (x == 1) {
			System.out.println("O dia " + x + " é Domingo");
			
		} else if(x == 2) {
			System.out.println("O dia " + x + " é Segunda-Feira");
			
		} else if(x == 3) {
			System.out.println("O dia " + x + " é Terça-Feira");
			
		} else if (x == 4) {
			System.out.println("O dia " + x + " é Quarta-Feira");
			
		} else if (x == 5) {
			System.out.println("O dia " + x + " é Quinta-Feira");
			
		} else if (x == 6) {
			System.out.println("O dia " + x + " é Sexta-Feira");
			
		} else if (x == 7) {
			System.out.println("O dia " + x + " é Sábado");
			
		} else {
			
			System.out.println("Favor, digitar um valor válido!!");
				
			}
		}

	}


