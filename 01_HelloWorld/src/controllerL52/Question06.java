package controllerL52;

public class Question06 {
	/*
	 * Desenvolver um programa que apresente os quadrados dos números inteiros de 2 a 50. 
	 */

	public static void main(String[] args) {
		int pot2, num;
		num = 2;
		
		System.out.println("Abaixo, todos os Quadrados dos números inteiros na faixa de 2 a 50:");
		
		do {//1
			pot2 = num * num;
			System.out.println(num + "² = " + pot2);
			num++;
			
		}while(num <= 50);//1

	}

}
