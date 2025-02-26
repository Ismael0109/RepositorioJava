package controllerL52;

public class Question05 {
	/*
	 * Desenvolver um programa que apresente todos os números divisíveis por 4 que sejam menores que 20. 
	 */

	public static void main(String[] args) {
		int n, restdiv;
		n = 1;
		
		System.out.println("Todos os números menores que 200 divisíveis por 4 são:");
		do 
		{//1
			restdiv = n % 4;
			
			if (restdiv == 0) 
			{//2
				System.out.println(n);
				
			}//2
			n++;
		} while(n < 200);//1

	}

}
