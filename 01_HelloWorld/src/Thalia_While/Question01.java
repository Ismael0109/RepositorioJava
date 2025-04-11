package Thalia_While;

public class Question01 {
	/*
	 * Mostre os Números de 1 a 10
	 */

	public static void main(String[] args) {
		int num = 1;
		while(num <= 10) {
			if (num < 10) {
			System.out.print(num + " - ");
			} else {
				System.out.println(num);
				
			}
			num++;
		}
		System.out.println("*********************FIM DO PROGRAMA**********************");

	}

}
