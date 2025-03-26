package Aulas_Joyce;

import util.Teclado;

public class Example04 {
	/*
	 * Ler o Valor Inicial da Contagem; o Valor Final; e o Incremento
	 * Mostrar todos os Valores do Intervalo 
	 */

	public static void main(String[] args) {
		int ni = Teclado.lerInt("Digite o Valor Inicial do Intervalo");
		int nf = Teclado.lerInt("Digite o Valor Final do Intervalo");
		int inc = Teclado.lerInt("Digite o Incremento");
		System.out.print("Contagem: ");
		for(int x = ni; x <= nf; x = x + inc) {
			System.out.print(x + " - ");  
		}
		System.out.println("Fim da Contagem!");
		System.out.println("*********************FIM DO PROGRAMA**********************");
		
		
		

	}

}
