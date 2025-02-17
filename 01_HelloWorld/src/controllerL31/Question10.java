package controllerL31;

import util.Teclado;

public class Question10 {
	/*
	 * Fazer um algoritmo que efetue o cálculo do valor de uma prestação em atraso, 
	 * utilizando a fórmula 
	 * prestação = valor + (valor x (taxa : 100) x tempo em dias). 
	 */

	public static void main(String[] args) {
		
		double prest, valor, taxa, dias;
		
	System.out.println("Este programa irá lhe ajudar a descobrir quanto ficará sua prestação após os atrasos");	
		
		valor = Teclado.lerDouble("Digite o valor inicial da Prestação");
		taxa = Teclado.lerDouble("Digite a taxa de atraso em %. Ex: 5%, digite 5");
		dias = Teclado.lerDouble("Digite quantos dias tem de atraso. *Favor, digite apenas números* ");
		
		prest = valor + (valor * (taxa / 100) * dias);
		
		System.out.println("O valor final da Prestação será de R$" + prest);

	}

}
