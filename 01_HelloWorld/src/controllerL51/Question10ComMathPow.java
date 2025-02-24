package controllerL51;
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
 * COM MATH.POW
 */


public class Question10ComMathPow {
	public static void main(String[] args) {
		
	
		int x = 0;
		
	
		while (x <= 15) {//1
		
			
		
			System.out.println("3 elevado à " + x + " = " + Math.pow(3, x));
		
			x++;
		}//1

}
}
