package Thalia_Revisao_Laco;

import util.Teclado;

public class Question03 {
	/*
	 * (WHILE) Máquina de café com saldo.
	 * Simule uma máquina de café. O usuário insere dinheiro (R$ 1,00, R$ 2,00 ou R$ 5,00).
	 * O café custa R$ 3,00. O programa continua pedindo valores até que o saldo seja suficiente. Se 
	 * passar de R$ 3,00, retorne o troco.
	 */

	public static void main(String[] args) {
		System.out.println("*****MÁQUINA DE CAFÉ*****");
		System.out.println("*****O PREÇO DO CAFÉ É R$ 3,00*****");
		System.out.println();
		
		double dinInserido = 0;
		double somaDin = 0;
		int x = 1;
		double troco = 0;
		// Repetir a Pedição de Dinheiro
		while(somaDin < 3) { //While 1
			
			//Fazer Enquanto o Dinheiro seja Diferente de 1, 5 ou 2 Para Fazer o Usuário Digitar Corretamente
			do { //Do-While 1
			
			// Se For o Primeiro Dinheiro Postado
			if (x == 1) { // If/Else 1
		 dinInserido = Teclado.lerDouble("Insira o Dinheiro. (*ACEITAMOS APENAS R$1,00 / R$2,00 / R$ 5,00*)");
		 x++;
		 
		 //Senão For o Primeiro Dinheiro Postado
			} else {
				dinInserido = Teclado.lerDouble("Insira Mais Dinheiro . (*ACEITAMOS APENAS R$1,00 / R$2,00 / R$ 5,00*)");
				
			} // Fim - If/Else 1
			
			
		if ( (dinInserido != 1) && (dinInserido != 2) && (dinInserido != 5)) { // If 2
			System.out.println("Insira um Valor Válido");
			
		} //Fim If 2
		
		}while((dinInserido != 1) && (dinInserido != 2) && (dinInserido != 5)); //Fim Do-While 1
			
			somaDin += dinInserido;
		
		if (somaDin > 3) { //If 3
			troco = somaDin - 3;
			
		} //Fim If 3
		
		} //Fim While 1
		
		System.out.println("*****COMPRA REALIZADA COM SUCESSO****");		
		System.out.println("*****TROCO -> R$" + troco + "****");	
		System.out.println();
		System.out.println("*****FIM DO PROGRAMA*****");
		
		
		
	}

}
