package Aulas_Talia;

import Resolucao.teclado;
import util.Teclado;

public class ForCompreencao {

	public static void main(String[] args) {
		double somanota = 0;
		int i;
		
		for( i = 1; i <= 5;i ++) {
			double nota = Teclado.lerDouble("Digite a nota " + i + ":");
			somanota += nota;
		}
		
		double media = somanota / 5;
		System.out.println("Sua média é " + media);
		
	}

}
