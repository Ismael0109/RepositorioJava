package controllerL51;

import util.Teclado;

public class Question12 {
	/*
	 * Desenvolver um programa que peça ao usuário para digitar diversos números reais,
	 *  e ao final, exibir o maior e o menor número que foram digitados, 
	 *  além da média entre TODOS os números digitados pelo usuário. 
	 *  A inserção de números deve parar quando o usuário digitar o número -1, 
	 *  e este número -1 não deve ser considerado nem como maior, nem como menor, e nem na contagem da média. 
	 */

	public static void main(String[] args) {
		double num = 0;
		double media;
		double maior = 0;
		double menor = 0;
		double soma = 0;
		int contador = 0;
		
		System.out.println("Neste programa digite quantos valores quiser, que acharemos o maior, o menor e a média deles. OBS: Caso digite -1, acaba o processo");
		
		while (num != (-1)) {//1
			num = Teclado.lerDouble("Pode digitar um número");
			if (num == (-1)) {
				
			} else {//else
				
			
			if ((maior == 0) || (maior == (-1))) {//4
				maior = num;
			}//4
			if ((menor == 0) || (menor == (-1))){//5
				menor = num;
			}//5
			
			 
			if (num >= maior) {//2
				maior = num;
				}//2
			if (num <= menor) {//3
				menor = num;
				
				}//3
			}//else
			
			if (num == (-1)) {
				
			}else {
				soma += num;
				contador++;
				
			}
		}//1
		media = soma/contador;
		System.out.println("O Maior valor digitado é " + maior);
		System.out.println("O Menor valor digitado é " + menor);
		System.out.println("A Média é  " + media);

	}

}
