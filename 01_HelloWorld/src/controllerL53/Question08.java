package controllerL53;

import util.Teclado;

public class Question08 {
	/*
	 * Desenvolver um programa que pergunte 20 vezes o nome inteiro de uma pessoa, sexo e idade,
	 *  e exiba o nome inteiro das pessoas que são do sexo masculino e possuem 21 anos ou mais. 
	 */

	public static void main(String[] args) {
		for (int x = 1; x <= 20; x++) {
			String nome = Teclado.lerTexto("Digite seu Nome");
			String sexo = Teclado.lerTexto("Digite seu Sexo: m = Masculino; f = Feminino; n = Prefiro não Dizer");
			
			while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("n")) {
				if (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")  && !sexo.equalsIgnoreCase("n")) {
				
					System.out.println("Digite um valor Válido, m, f ou n ");
					sexo = Teclado.lerTexto("Digite seu Sexo: m = Masculino; f = Feminino; n = Prefiro não Dizer");
				}
			}
			
			int idade = Teclado.lerInt("Digite sua Idade");
			
		if ((sexo.equalsIgnoreCase("m")) && (idade >= 21)) {
			System.out.println("****** NOME COMPLETO: " + nome + " ******");
			
		}else {
			System.out.println("*******PRÓXIMO********");
		}
		}
		
	}

}
