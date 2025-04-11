package Aulas_Joyce;

import util.Teclado;

public class SwitchCase {

	public static void main(String[] args) {
		int teste = Teclado.lerInt("Digite um Número Inteiro");
		switch (teste) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		default:
			System.out.println("Não tem Mês Registrado neste número");
			break;
			
		}

	}

}
