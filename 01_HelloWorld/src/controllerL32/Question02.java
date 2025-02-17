package controllerL32;

import util.Teclado;

public class Question02 {
	
	/*
	 * Desenvolver um programa que faça duas perguntas: 
	 * o valor referente às horas atuais e o valor referente aos minutos atuais. 
	 * Exemplo, se agora são 09:35h o usuário deverá informar como resposta às horas atuais o valor 09 
	 * e como resposta aos minutos atuais o valor 35. 
	 * 
	 * Em seguida o programa deverá apresentar como resposta quantos minutos já se passaram desde às 00:00h deste dia. 
	 */
	public static void main(String[] args) {
		int h,min,hmin;
		
		h = Teclado.lerInt("A medida de uma Curiosidade Interessante, digite que Horas são. *MAS APENAS AS HORAS* Ex: 09:32, digite 09");
		min = Teclado.lerInt("Agora, digite os Minutos. *MAS APENAS OS MINUTOS* Ex: 09:32, digite 32");
		
		hmin = h * 60;
		
		System.out.println("Desde 00:00 deste dia se passaram " + (min + hmin) + " min");
		
	}

}
