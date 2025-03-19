package Aulas_Talia;

import util.Teclado;

public class CaixaEletronico { 
	

	public static void main(String[] args) {
		double saldo = 1000; // Saldo do Usuário
		int opcao = 0; // Opção Selecionada
		 
		
		do {
		opcao = Teclado.lerInt("Digite o valor para uma das Opções: 1- Sacar Dinheiro ; 2- Depositar Dinheiro ; 3- Verificar Saldo ; 4- Sair");
				
		if(opcao == 1) { //Se 1 é digitado
			
			double saque = Teclado.lerDouble("Digite o Valor que deseja Sacar"); 
			
			if (saldo < saque) { //se saldo for menor que o saque
				System.out.println("Saldo Insuficiente");
				
			} else { //Se Saldo não for Menor que o Saque, Realiza o Saque
				saldo -= saque;
			} 
			
			System.out.println("Saque de " + saque + " Concluído!!");//Conclusão do Saque
			
		} else if(opcao == 2){ //Se opção 2 for Selecionado
			
			double deposito = Teclado.lerDouble("Digite o Valor que deseja Depositar"); //Armazena Depósito
			saldo += deposito; //Realiza Depósito
			System.out.println("Depósito de " + deposito + " Concluído!!"); //Mensagem de Conclusão do Depósito
			
		} else if(opcao == 3) { //Se opção 3 for Selecionada
			System.out.println("Seu Saldo Atual é R$" + saldo); //Mostra Saldo
			
		} else if(opcao == 4) { //Se opção 4 for Selecionada
			System.out.println("Você Finalizou o Programa"); //Mensagem de Encerramento
			
		} else {//Se Opção Inválida for Digitada
			System.out.println("ERROR!!! Digite um Valor Válido!"); //Mensagem de ERROR
			
		}
		
		}while (opcao != 4);
		Teclado.fecharScanner();
		

	}

}
