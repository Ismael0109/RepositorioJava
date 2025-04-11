package Thalia_While;

import util.Teclado;

public class Question02 {
	/*
	 * Com While
	 * Informar 5 Números
	 * Realizar Soma Deles
	 */

	public static void main(String[] args) {
		int num;
		int soma = 0;
		int x = 1;
		//Enquanto x for Mneor ou Igual a 5 
		while(x <= 5) {//While 1
			//Pedir um Número
			num = Teclado.lerInt("Digite o " + x + "º Número");
			//Soma o Valor Obtido anteriormente com o novo Número
			soma += num;
			//Soma mais 1 ao Contador
			x++;
		
		} //Fim While 1
		System.out.println("A Soma = " + soma);;
		System.out.println("*********************FIM DO PROGRAMA**********************");

		

	}

}
