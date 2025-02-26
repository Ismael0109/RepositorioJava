package controllerL51;

public class Question15 {
	/*
	 * Desenvolver um programa que apresente a série de Fibonacci até o décimo quinto termo. 
	 * A série de Fibonacci é formada pela sequência 1,1,2,3,5,8,13,21,34, ... etc. 
	 * Ela se caracteriza pela soma de um termo posterior com seu anterior subsequente. 
	 */

	public static void main(String[] args) {
		int contador = 1;
		int fibonacci = 1;
		int num = 0;
		int anterior;
		
		System.out.println("A Sequência de Fibonacci até o Décimo Quinto Termo é: ");
		
		while (contador <= 15) {//1
			fibonacci += num;
			
			System.out.print(fibonacci + " ");
			anterior = num;
			num = fibonacci;
			fibonacci = anterior;
			
			contador++;
		}//1

	}
	

}
