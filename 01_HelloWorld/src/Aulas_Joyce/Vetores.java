package Aulas_Joyce;

import util.Teclado;

public class Vetores {
	/*
	 * Vetor
	 */

	public static void main(String[] args) {
		double notas [] = new double [4];
		String nomes [] = new String [4];
		
		for (int x1 = 0; x1 < 4; x1++) {
			nomes[x1] = Teclado.lerTexto("Digite seu Nome");
		for (int x = 0; x < 4; x++) {
			int y = 1;
			notas [x] = Teclado.lerDouble(nomes[x1] + ", Digite sua " + y + "º Nota");
			y++;
		}
		System.out.println("Aluno -> " + nomes[x1]);
		System.out.println("Nota 1 -> " + notas[0]);
		System.out.println("Nota 2 -> " + notas[1]);
		System.out.println("Nota 3 -> " + notas[2]);
		System.out.println("Nota 4 -> " + notas[3]);
		
	
		
		}

	}

}
