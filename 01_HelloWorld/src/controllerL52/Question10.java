package controllerL52;

import util.Teclado;

public class Question10 {
	/*
	 * A série de Ricci difere da série de Fibonacci porque os dois primeiros termos são fornecidos pelo usuário. 
	 * O restante da série é calculado da mesma forma que na série de Fibonacci. 
	 * Altere o programa da questão anterior, para que sejam perguntados os dois primeiros termos da série de Ricci,
	 *  e sejam exibidos os 15 termos subsequentes desta série. 
	 */

	public static void main(String[] args) {
		int contador = 1;
		int ricci = 0;
		int num1, num2;
		
		
		num1 = Teclado.lerInt("Digite um número para a Série de Ricci");
		num2 = Teclado.lerInt("Digite mais um número para a Série de Ricci");
		System.out.println("A Sequência de Ricci até o Décimo Quinto Termo utilizando seus números é: ");
		
		
		do {//1
			ricci = num1 + num2;
			System.out.print(ricci + " ");
			num1 = num2;
			num2 = ricci;
			ricci = 0;
			
			contador++;
		}while (contador <= 15);//1

	}

}
