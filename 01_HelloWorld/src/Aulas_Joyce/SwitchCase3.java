package Aulas_Joyce;

import util.Teclado;

public class SwitchCase3 {

	public static void main(String[] args) {
		System.out.println("Seja Bem-vindo ao Conversor de Moedas!");

		double real = Teclado.lerDouble("Digite quantos Reais Você Quer Converter");;
		int opcao;
		do {
			
			System.out.println("Agora Escolha Uma Opção. Digite: ");
			System.out.println("1 - USD (Dólar Americano)");
			System.out.println("2 - EUR (Euro)");
			System.out.println("3 - JPY (Iene Japonês)");
			System.out.println("4 - CAD (Dólar Canadense)");
			System.out.println("5 - AUD (Dólar Australiano)");
			 opcao = Teclado.lerInt("");
		switch (opcao) {
		case 1:
			System.out.println("BRL R$" + real + " -> USD $" + (real * 5.40));
			break;
		case 2:
			System.out.println("BRL R$" + real + " -> EUR £" + (real * 5.45));
			break;
		
		case 3:
			System.out.println("BRL R$" + real + " -> JPY \u00A5" + (real * 0.04));
			break;
		case 4:
			System.out.println("BRL R$" + real + " -> CAD $" + (real * 4.15));
			break;
		case 5:
			System.out.println("BRL R$" + real + " -> AUD $" + (real * 3.67));
			break;
		default:
			System.out.println("VocÊ Não digitou uma opção válida");
			break;
		}
		} while ((opcao != 1) && (opcao != 2) && (opcao != 3) && (opcao != 4 ) && (opcao != 5));
		
		

	}

}
