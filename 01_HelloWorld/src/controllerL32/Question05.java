package controllerL32;

import util.Teclado;

public class Question05 {
	/*
	 * Fazer um algoritmo que pergunte dois números 
	 * e ao final apresente os seguintes valores: 
	 * a soma dos dois números, 
	 * a subtração do primeiro pelo segundo número, 
	 * a subtração do segundo pelo primeiro número,
	 * a multiplicação entre os dois números, 
	 * a divisão do primeiro pelo segundo número, 
	 * e também o resto da divisão do primeiro pelo segundo número. 
	 */

	public static void main(String[] args) {
		double n1, n2, soma, sub1, sub2, mult, div, restodiv;
		
		n1 = Teclado.lerInt("Digite o Primeiro Valor");
		n2 = Teclado.lerInt("Digite o Segundo Valor");
		
		soma = n1 + n2;
		sub1 = n1 - n2;
		sub2 = n2 - n1;
		mult = n1 * n2;
		div = n1 / n2;
		restodiv = n1 % n2;
		
		System.out.println(n1 + " + " + n2 + " = " + soma);
		System.out.println(n1 + " - " + n2 + " = " + sub1);
		System.out.println(n2 + " - " + n1 + " = " + sub2);
		System.out.println(n1 + " * " + n2 + " = " + mult);
		System.out.println(n1 + " / " + n2 + " = " + div);
		System.out.println("O Resto da Divisão "+ n1 + " / " + n2 + " = " + restodiv);
				

	}

}
