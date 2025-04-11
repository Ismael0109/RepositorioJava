package Thalia_Do_While;

public class Question01 {
	/*
	 * Mostrar os Números de 1 a 5
	 */

	public static void main(String[] args) {
		int x = 1;
		do {
			if(x != 5) {
				System.out.print(x + " - ");
			} else {
				System.out.println(x);
				
			}
			x++;
		
			}while(x <= 5);
		

	}

}
