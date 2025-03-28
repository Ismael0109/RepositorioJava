package Prova30;

import util.Teclado;

public class Question06 {
	/*
	 * 20 Funcionários
	 * Perguntar Qual Tamanho da Camisa do Uniforme que o Funcionário deve Receber
	 * Respostas Aceitas :
	 * 1 - Para "Tamanho Pequeno"
	 * 2 - Para "Tamanho Médio"
	 * 3 - Para "Tamanho Grande"
	 * 4 - Para "Tamanho Extra Grande"
	 * Qualquer outra Coisa - "Resposta Inválida"
	 * 
	 * Ao Final Relatório com Quantidadde de cada Valor inserido, 1, 2, 3, 4, e até mesmo Inválido
	 * 
	 */

	public static void main(String[] args) {
		int opcao;
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		int cont4 = 0;
		int contInv = 0;
		System.out.println("***PESQUISA DE TAMANHO DE CAMISAS***");
		System.out.println("");
		for (int x = 1; x <= 20; x++) {
			
			if(x < 10) {
			System.out.println("Funcionário 0" + x + ", Escolha Qual é o Tamanho de Sua Camisa para lhe enviarmos");
			} else {
				System.out.println("Funcionário " + x + ", Escolha Qual é o Tamanho de Sua Camisa para lhe enviarmos");	
			}
			System.out.println("Digite 1 - Para \"Tamanho Pequeno\" ");
			System.out.println("Digite 2 - Para \"Tamanho Médio\" ");
			System.out.println("Digite 3 - Para \"Tamanho Grande\" ");
			opcao = Teclado.lerInt("Digite 4 - Para \"Tamanho Extra Grande\"");
			if (opcao == 1) {
				cont1++;
				
			} else if(opcao == 2) {
				cont2++;
			} else if (opcao == 3) {
				cont3++;
			} else if (opcao == 4) {
				cont4++;
			} else {
				contInv++;
			}
		}
		System.out.println("Tamanho P -> " + cont1);
		System.out.println("Tamanho M -> " + cont2);
		System.out.println("Tamanho G -> " + cont3);
		System.out.println("Tamanho XG -> " + cont4);
		System.out.println("Resposta Inválida -> " + contInv);
		System.out.println("");
		System.out.println("*****FIM DO PROGRAMA*****");

	}

}
