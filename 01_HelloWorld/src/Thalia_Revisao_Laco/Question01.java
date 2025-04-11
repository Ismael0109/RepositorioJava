package Thalia_Revisao_Laco;

import util.Teclado;

public class Question01 {
	/*
	 * 1) (FOR) Controle de visitas em uma exposição.
	 * Uma exposição recebe visitantes por turnos. Cada turno dura uma hora. 
	 * Crie um programa que pergunte quantos turnos houve no dia e, para cada turno, quantas pessoas 
	 * entraram. Ao final, mostre o total de visitantes
	 */

	public static void main(String[] args) {
		System.out.println("*****QUANTIDADE DE PESSOAS QUE VISITARAM A EXPOSIÇÃO NESTE DIA*****");
		System.out.println();
		int quantTurno = Teclado.lerInt("Quantos Turnos Tiveram no dia");
		int quantPessoa;
		int somaPessoas = 0;
		
		for (int x = 1; x <= quantTurno; x++) {
			quantPessoa = Teclado.lerInt("Digite a Quantidade de Pessoas Que Visitaram A Exposição No " + x + "º Turno");
			somaPessoas += quantPessoa;
			
			
		}
		System.out.println("Total de Visitantes do Dia -> " + somaPessoas);
		System.out.println("*****FIM DO PROGRAMA*****");
		

	}

}
