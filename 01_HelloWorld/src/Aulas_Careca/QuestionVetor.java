package Aulas_Careca;

import util.Teclado;

public class QuestionVetor {

	public static void main(String[] args) {
		double nota [] = new double [4];
		int x = 0;
		for ( x = 0; x < 4; x++) {
			nota[x] = Teclado.lerDouble("Digite sua " + (x + 1) + "º Nota");
		}
		double media = 0;
		int y = 1;
		while ((x - y) >= 0) {
		 media += nota[(x-y)] ;
		 System.out.println("NOTA " + (y + 1) + " -> " + nota[x]);
		 y++;
		}
		media /= x;
		System.out.println("MÉDIA -> " + media);
		if (media >= 7) {
			
			System.out.println("SITUAÇÃO -> APROVADO");
		} else if ((media < 7) && (media >= 4)) {
			
			System.out.println("SITUAÇÃO -> RECUPERAÇÃO");
		}else  {
			
			System.out.println("SITUAÇÃO -> REPROVADO");
		}
		System.out.println("*****FIM DO PROGRAMA*****");
		

	}

}
