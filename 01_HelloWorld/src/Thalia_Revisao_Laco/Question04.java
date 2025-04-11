package Thalia_Revisao_Laco;

import util.Teclado;

public class Question04 {
	/*
	 * (WHILE) Degustação de sucos
	 * Em um evento, visitantes podem degustar sucos. Cada pessoa pode provar no máximo 3 sucos 
	 * diferentes. O sistema deve perguntar o nome da pessoa e registrar qual suco ela escolheu. A cada 
	 * escolha, perguntar se ela quer provar outro. Ao atingir o limite ou dizer “não”, encerrar o 
	 * atendimento.
	 */

	public static void main(String[] args) {
		System.out.println("*****DEGUSTAÇÃO DE SUCOOOS*****");
		System.out.println();
		
		int quantSuco = 0;
		String nome = Teclado.lerTexto("Digite Seu Nome:");
		String suco[] = new String[3];
		String opcao = "Sim";
		int restSuco = 3;
		
		while ((quantSuco < suco.length) && (opcao.equalsIgnoreCase("Sim"))) {
			
			suco[quantSuco] = Teclado.lerTexto("Digite o Suco que Você Provou");
			if(quantSuco == 2) {
		do {
			
			
			if (suco[quantSuco].equalsIgnoreCase(suco[quantSuco - 1]) || suco[quantSuco].equalsIgnoreCase(suco[quantSuco - 2])) {
				
				suco[quantSuco] = Teclado.lerTexto("Você Não Pode Degustar o Mesmo Sabor de Suco! Digite Outro Sabor");
				
			}
		}while(suco[quantSuco].equalsIgnoreCase(suco[quantSuco - 1]) || suco[quantSuco].equalsIgnoreCase(suco[quantSuco - 2]));
			} else if (quantSuco == 1) {
				
					do {
						
						
						if (suco[quantSuco].equalsIgnoreCase(suco[quantSuco - 1])) {
							
							suco[quantSuco] = Teclado.lerTexto("Você Não Pode Degustar o Mesmo Sabor de Suco! Digite Outro Sabor");
							
						}
					}while(suco[quantSuco].equalsIgnoreCase(suco[quantSuco - 1]));
						
			} 
			quantSuco++;
		
			restSuco = suco.length - quantSuco;
			
			
			if (quantSuco != 3) {
			System.out.println("Você Ainda Pode Provar " + restSuco + " Suco(s)!");
			System.out.println("Gostaria de Provar Mais Algum Suco?");
			 opcao = Teclado.lerTexto("Digite Sim/Não");
			
			}
			else {
				System.out.println("Acabou Suas Degustações! Favor Não Prove Mais Nenhum Suco!!");
				System.out.println();
			}
			
		}
		System.out.println(nome);
		System.out.println("Provou -> " + quantSuco + " Sucos");
		System.out.println("Sendo dos Seguintes Sabores:");
		System.out.println("1 - " + suco[0]);
		System.out.println("2 - " + suco[1]);
		System.out.println("3 - " + suco[2]);
		System.out.println("Sobrou -> " + restSuco + " Degustações de Suco!");
		System.out.println();
		System.out.println("*****FIM DO PROGRAMA*****");
		

	}

}
