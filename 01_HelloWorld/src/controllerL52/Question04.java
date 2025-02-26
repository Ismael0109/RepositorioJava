package controllerL52;

import util.Teclado;

public class Question04 {
	/*
	 * Desenvolver um programa que apresente os resultados de uma tabuada de um número n qualquer 
	 * a ser perguntado ao usuário (n x 1, n x 2, n x 3, ... , n x 9, n x 10) 
	 */

	public static void main(String[] args) {
		int num, multiplicador, resp;
		
			num = Teclado.lerInt("Digite um número para saber sua tabuada");
			multiplicador = 1;
		
			do 
			{//1
				resp = num * multiplicador;
				System.out.println(num + " x " + multiplicador + " = " + resp);		
				multiplicador++;
			
			}while (multiplicador <= 10);//1

		}

	}
