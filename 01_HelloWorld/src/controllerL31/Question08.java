
package controllerL31;

import util.Teclado;

public class Question08 {
	/*
	 * Fazer um programa que calcule e apresente a quantidade de litros que um automóvel gastará em uma viagem. 
	 * O programa deve coletar as seguintes informações: 
	 * Distância a percorrer na viagem, em quilômetros; 
	 * qual é o valor do consumo médio do automóvel, em quilômetros por litro. 

 
	 */

	public static void main(String[] args) {
		double dist, gasto, litro;
	
		System.out.println("Vamos calcular quantos litros você vai gastar em sua viagem");
		
		dist = Teclado.lerDouble("Primeiro digite qual a distância do percurso em Km");
		
		gasto = Teclado.lerDouble("Agora quantos Km seu automóvel percorre a cada  1 Litro");
		
		litro = dist/gasto;
		
		System.out.println("Você irá gastar " + litro + "L");
		

	}

}
