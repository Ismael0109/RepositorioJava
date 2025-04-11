package controllerL71;

import util.Teclado;

public class Question04 {
	/*
	 * Ler 10 Nomes
	 * Enquanto o Usuário digitar SIM, O Usuário Digita um Nome E o Programa verifica a existência desse nome
	 * 
	 */

	public static void main(String[] args) {
		String nome [] = new String [10];
		for (int x = 0; x < 10; x++) {
			//nome[x] = Teclado.lerTexto("Digite o " + x + "º Nome");
					
			
		}
		String opcao = Teclado.lerTexto("Deseja Seguir o Processo? (s/n)");
		switch (opcao) {
		case "s":
			
			break;
		case "n": 
			System.out.println("Você Encerrou nosso Programa");
			break;
		default: 
			do {
			System.out.println("Digite um Valor Válido");
			
			}while((!(opcao.equals("s"))) && (!(opcao.equals("n"))));
		}
		

	}

}
