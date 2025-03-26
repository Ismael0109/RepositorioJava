package Aulas_Joyce;

import util.Teclado;

public class Projeto01 {
	/*
	 * Simulação do Caixa de Mercado
	 * Lançar Valores para N Produtos
	 * Toda Vez que um Lançamento for Realizado, deverá Perguntar se será feito novamente, escolhendo entre s/n
	 * Ao Finalizar o Processo Acima o Sistema deverá calcular o Valor total 
	 * O sistema deverá pedir o Valor que o Cliente deu ao Caixa
	 * O sistema deverá mostrar o Troco do Cliente 
	 */

	public static void main(String[] args) {
		String opcao;
		double valor, total = 0;
		do {
			valor = Teclado.lerDouble("Digite o Valor do Produto Atual");
			total += valor;
			
			opcao = Teclado.lerTexto("Deseja Continuar? (s/n)");
			
			
				while(!(opcao.equalsIgnoreCase("n")) && !(opcao.equalsIgnoreCase("s"))) {
					System.out.println("Digite s ou n, Por favor!!");
					opcao = Teclado.lerTexto("Deseja Continuar? (s/n)");
			}
			
		}while (opcao.equalsIgnoreCase("s"));
		System.out.println("*****Término de Registros*****");
		double pagamento = Teclado.lerDouble("Digite o valor que o Cliente Pagou:");
		double troco = pagamento - total;
		System.out.println("O troco a ser Devolvido ao Cliente é R$" + troco);

	}

}
