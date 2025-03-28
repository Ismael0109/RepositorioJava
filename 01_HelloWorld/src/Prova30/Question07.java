package Prova30;

import util.Teclado;

public class Question07 {
	/*
	 * Perguntar Qual Time O Usuário Quer Saber As Cores
	 * A resposta deve ser Por Extenso e Minúscula
	 * Exibir As Cores dos Times OU A Mensagem de que o Time Não está Catalogado
	 * Botafogo - Preto e Branco
	 * Flamengo - Preto e Vermelho
	 * Fluminense - Verde, Branco e Grená
	 * Vasco - Preto, Vermelho e Branco
	 */

	public static void main(String[] args) {
		String time, opcao;
		System.out.println("Seja Bem-Vindo(a) ao Rio de Janeiro! Aqui Você Descobre Qual Cor Usar Para Torcer Por Um Time!!");
		System.out.println("");
		do {
		 time = Teclado.lerTexto("Digite o Time que Você quer Saber as Cores | OBS: Digite o Nome em Minúsculo");
		if (time.equals("botafogo")) {
			System.out.println("Botafogo -> Preto e Branco");
			
		} else if(time.equals("flamengo")) {
			System.out.println("Flamengo -> Preto e Vermelho");
			
		} else if (time.equals("fluminense")) {
			
			System.out.println("Fluminense -> Verde, Branco e Grená");
			
		} else if (time.equals("vasco")) {
			System.out.println("Vasco -> Preto, Branco e Vermelho");
			
			
		} else if ((time.equals("Botafogo")) || (time.equals("Flamengo")) || (time.equals("Fluminense")) || (time.equals("Vasco"))) {
			System.out.println("Digite em Minúsculo!!!!");
		}
		else {
			System.out.println("Time Não Está No Catálogo");
			
		}
		opcao = Teclado.lerTexto("Deseja Continuar? (s/n)");
		while (!(opcao.equalsIgnoreCase("s")) && !(opcao.equalsIgnoreCase("n"))) {
			System.out.println("Favor Digitar uma Opção Válida");
			opcao = Teclado.lerTexto("Deseja Continuar? (s/n)");
			
		}
		} while ((opcao.equalsIgnoreCase("s")));

		System.out.println("");
		System.out.println("*****FIM DO PROGRAMA*****");
	}

}
