package controllerL51;

public class Question10 {
	/*
	 * Desenvolver um programa que apresente as potências de 3 variando de 0 a 15. 
	 * Deve ser considerado que qualquer número elevado a zero é 1, 
	 * e elevado a 1 é ele próprio. 
	 * A apresentação deve observar a seguinte exibição na tela: 
	 * 3 elevado à 0 = 1
	 * 3 elevado à 1 = 3 
	 * 3 elevado à 2 = 9 
	 * (...)
	 * 3 elevado à 15 = 14348907 
	 * SEM MATH.POW
	 */

	public static void main(String[] args) {
		
		int x = 0;
		int pot3 = 1;
		
		while (x <= 15) {//1
			
			if (x == 0) { //2
				pot3 = 1;
				
			}//2
			else if (x == 1) {//3
				pot3 = 3;
				
			}//3
			else {//4
				pot3 = pot3 * 3;
				
			}//4
			
			System.out.println("3 elevado à " + x + " = " + pot3);
			
			x++;
		}//1
		

	}

}
