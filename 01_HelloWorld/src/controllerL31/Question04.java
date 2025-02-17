package controllerL31;

import util.Teclado;

public class Question04 {
	/*
	 * Fazer um programa que pergunte um número inteiro e apresente o seu antecessor e seu sucessor. 
	 */

	public static void main(String[] args) {
		int num, ant, suc;
		
		num = Teclado.lerInt("Digite o Número que você quer descobrir o antecessor e sucessor");
		ant = num - 1;
		suc = num + 1;
		
		System.out.println("O antecessor de " + num + " = " + ant);
		System.out.println("O sucessor de " + num + " = " + suc);
		

	}

}
