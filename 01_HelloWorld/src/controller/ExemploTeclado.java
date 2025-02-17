package controller;

import util.Teclado;

public class ExemploTeclado {

	public static void main(String[] args) {
		
		String nome; // String -> caracter
		int idade; // int -> inteiro
		double salario; // double -> real
		
		nome = Teclado.lerTexto("Informe seus Nome:");
		
		System.out.println("Olá " + nome);
		
		idade = Teclado.lerInt("Informe sua Idade: ");
		salario = Teclado.lerDouble("Informe seu Salário");
		
		System.out.println("Seu salário é R$" + salario + " enquanto sua idade é " + idade);

	}

}
