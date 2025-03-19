package controllerL53;

import util.Teclado;

public class Question02 {
	/*
	 * Desenvolver um programa que apresente o total da soma de n números inteiros do número 1 até n, 
	 * onde n é um valor informado pelo usuário. 
	 */

	public static void main(String[] args) {
		System.out.println("Este Programa Soma Todos os Números Inteiros na faixa de 1 a Qualquer valor que você digitar");
		System.out.println("Exemplo: De 1 a 5 -> 1 + 2 + 3 + 4 + 5 = 15");
		
		int soma = 0, n;
		n = Teclado.lerInt("Digite o até qual número este programa deve somar");
		
		for(int x = 1; x <= n; x++ ) {
			soma += x;
			
			if (x == n) { //SÓ PARA DEIXAR BONITO
				
				System.out.print(x + " = ");
				
			}else {
				System.out.print(x + " + ");
				
			} //SÓ PARA DEIXAR BONITO
			
		}
		System.out.println(soma);	
		System.out.println("Fim do Programa.");
	}

}
