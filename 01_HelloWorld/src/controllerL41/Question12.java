package controllerL41;

import util.Teclado;

public class Question12 {
	/*
	 * Desenvolver um programa que pergunte 5 números inteiros 
	 * e identifique o maior número e o menor número. 

 
	 */

	public static void main(String[] args) {
		int n1, n2, n3, n4, n5, maior, menor;
		maior = 0;
		menor = 0;
		
		n1 = Teclado.lerInt("Digite o Primeiro número");
		n2 = Teclado.lerInt("Digite o Segundo número");
		n3 = Teclado.lerInt("Digite o Terceiro número");
		n4 = Teclado.lerInt("Digite o Quarto número");
		n5 = Teclado.lerInt("Digite o Quinto número");
		
		if ((n1 > n2) && (n1 > n3) && (n1 > n4) && (n1 > n5)) {
			maior = n1;
			
		} else if ((n2 > n1) && (n2 > n3) && (n2 > n4) && (n2 > n5)) {
			maior = n2;
			
		} else if ((n3 > n1) && (n3 > n2) && (n3 > n4) && (n3 > n5)) {
			maior = n3;
			
		}else if ((n4 > n1) && (n4 > n3) && (n4 > n2) && (n4 > n5)) {
			maior = n4;
			
		}else if ((n5 > n1) && (n5 > n3) && (n5 > n4) && (n5 > n2)) {
			maior = n5;
		}
		
		if ((n1 < n2) && (n1 < n3) && (n1 < n4) && (n1 < n5)) {
			menor = n1;
			
		} else if ((n2 < n1) && (n2 < n3) && (n2 < n4) && (n2 < n5)) {
			menor = n2;
			
		} else if ((n3 < n1) && (n3 < n2) && (n3 < n4) && (n3 < n5)) {
			menor = n3;
		
		}else if ((n4 < n1) && (n4 < n3) && (n4 < n2) && (n4 < n5)) {
			menor = n4;
		
		}else if ((n5 < n1) && (n5 < n3) && (n5 < n4) && (n5 < n2)) {
			menor = n5;
		}
		
		System.out.println("O Maior número é " + maior + " e o Menor é " + menor);
	}

}
