package controllerL51;

public class Question03 {
	/*
	 * Desenvolver um programa que apresente os quadrados dos números inteiros de 15 a 200. 
	 */

	public static void main(String[] args) {
		
		int num, pot2;
		num = 15;
		pot2 = 0;
		
		while (num <= 200) 
		{
			pot2 = num * num;
			System.out.println(num + "² = " + pot2);
			num++;
			
		}

	}

}
