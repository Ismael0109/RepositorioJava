package controllerL32;

import util.Teclado;

public class Question06 {
	/*
	 * Fazer um algoritmo que pergunte o nome de um vendedor, 
	 * o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
	 * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
	 *  exibir ao final o seu nome, 
	 *  o salário fixo, 
	 *  a comissão 
	 *  e o salário completo (fixo + comissão sobre vendas) no final do mês. 
	 */

	public static void main(String[] args) {
		String nome;
		double salfix, totvendas, comissao, salfim;
		
		nome = Teclado.lerTexto("Olá vendedor! Vamos descobrir qual será seu salário ao final deste mês. Digite seu Nome");
		salfix = Teclado.lerDouble("Agora preciso saber seu Salário Fixo em R$");
		totvendas = Teclado.lerDouble("Agora, quantos reais você adquiriu este mês com suas vendas");
		
		comissao = totvendas*0.15;
		salfim = salfix + comissao;
		
		System.out.println("Ótimo " + nome + "!! Somando seu Salário fixo(" + salfix + ") a sua Comissão deste Mês(" + 
		comissao + ") temos seu Salário Final - " + salfim);
		

	}

}
