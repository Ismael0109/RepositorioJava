package controllerL54;

import util.Teclado;
import java.text.DecimalFormat;

public class Question01 {
	/*
	 * Ler Numerador
	 * Ler Denominador
	 * Mostrar Valor Decimal da Fração
	 */

	public static void main(String[] args) {
		double num, den, dec;
		num = Teclado.lerDouble("Digite o Numerador da Fração");
		den = Teclado.lerDouble("Digite o Denominador da Fração");
		dec = num/den;
		DecimalFormat df = new DecimalFormat("#,###.00");
		String resultFormat = df.format(dec);
		System.out.println("A Fração " + num + "/" + den + " = " + resultFormat);

	}

}
