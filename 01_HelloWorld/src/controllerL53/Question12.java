package controllerL53;

public class Question12 {
	/*
	 * Agora faça uma alteração para que sejam apresentados somente os itens acima da diagonal principal da matriz anterior
	 * . No lugar que não é para exibir a triangulação, deverá aparecer x-x.  
	 * Deverá aparecer como resposta algo assim na tela: 
	 */

	public static void main(String[] args) {
		for(int x = 1; x <=10; x++) {
			for(int y = 1; y <=10; y++) {
				if(x < y) {
					System.out.print(x + "-" + y + "\t");
					
				} else {
					System.out.print("x-x" + "\t");
					
				}
				
				
			}
			System.out.println("");
			System.out.println("");
			
		}
		System.out.println("*********************FIM DO PROGRAMA**********************");
	}

}
