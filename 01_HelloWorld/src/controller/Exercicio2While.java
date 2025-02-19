package controller;

import util.Teclado;

public class Exercicio2While {

	public static void main(String[] args) {
		int r, x, i;
		i = 0;
		
		while(i <= 5)
		{
			x = Teclado.lerInt("Digite um número: " + i);
			r = x * 3;
			System.out.println(x + " * 3 = " + r);
			i++;
		}
	}

}
