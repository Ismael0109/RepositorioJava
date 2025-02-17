package controller;

import java.util.Locale;
import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		String nome;
		int idade;
		double salario;
		
		System.out.println("Informe o seu nome: ");
		nome = scanner.nextLine();
		
		System.out.println("Informe a sua idade: ");
		idade = scanner.nextInt();
		
		System.out.println("Informe o seu Salário: ");
		salario = scanner.nextDouble();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário R$" + salario);
		
		scanner.close();

	}

}
