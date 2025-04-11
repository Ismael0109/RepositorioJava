package Thalia_Do_While;

import util.Teclado;

public class Question03 {
	/*
	 * Realizar a Leitura de Notas Até digitar -1
	 * Mostrar a Média
	 */
	public static void main(String[] args) {
		
		double nota;
		double media = 0;
		int x = 0;
		do {
			x++;
			nota = Teclado.lerDouble("Digite sua " + x + "º Nota. (Se Acabou, Digite -1)");
			if (nota != -1) {
				media += nota;
				
			}else {
				System.out.println("Você Finalizou o Registro de Notas!");
				x--;
			}
			
		}while(nota != -1);
		media /= x;
		System.out.println("Média -> " + media);
	}

}
