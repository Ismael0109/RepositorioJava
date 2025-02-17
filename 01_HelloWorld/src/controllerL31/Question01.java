package controllerL31;

import util.Teclado;

public class Question01 {
/*
*Desenvolver um programa que pergunte ao usuário o seu nome completo e seu sexo. 
*Em seguida, o programa deve apresentar os dados anteriormente informados. 
*/

	public static void main(String[] args) {
		String nome, sexo;
		
		nome = Teclado.lerTexto("Digite seu Nome por Gentileza");
		sexo = Teclado.lerTexto("Digite seu Sexo por Gentileza");
		System.out.println("Seu nome é " + nome + " e seu sexo é " + sexo);
	}

} 
