package Thalia_Do_While;

import util.Teclado;

public class Question02 {
	/*
	 * Peça a Senha até que ele digite a senha correta (1234)
	 */

	public static void main(String[] args) {
		String senha;
		
		do {
			senha = Teclado.lerTexto("Digite a Senha");
			if(!(senha.equals("1234"))) {
				System.out.println("Senha Incorreta! Digite a Senha Correta!");
				
			} else {
				System.out.println("Senha Correta!");
			}
		}while (!(senha.equals("1234")));

	}

}
