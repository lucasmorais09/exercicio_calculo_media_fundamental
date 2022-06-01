package exercicios_prof_ohata;

import java.util.Scanner;

public class matrizes_imagem {

	public static void main(String[] args) {
		
		//Declarar variaveis 
		int matriz [][] = new int [16][16];//Inicia matriz e atribui o tamanho dela
		
		int result;//Resultado da entrada de dados
		
		Scanner input = new Scanner(System.in);//Declara scanner para a entrada de dados
		
		//For para atribuir valores para a matriz
		for (int  c = 0; c < matriz.length; c++) {
			
			for (int l =0; l < matriz.length; l++) {
				
				//Entrada de dados da matriz
				System.out.print("Digite um valor de 0 a 3: ");
				result  = input.nextInt();
				
				//Confere se o resultado digitado foi os valores pedidos
				if (result == 0 || result == 1 || result == 2 || result == 3) {
					//Atribui valor a matriz
					matriz[c][l] = result;
				}
				else {
					//Exibi mensagem e pedi para inserir somente os valores solicitados
					System.out.println("Por favor insira somente os valores solicitados.");
					l--;//Subtrai valor do contador pois valor inserido nao esta correto
				}
			}
		}
		//Percorre matriz e exibi seus valores
		for (int  c = 0; c < matriz.length; c++) {
			
			//Quebra linha para formar a tabela
			System.out.printf("\n");
			
			for (int l = 0; l < matriz.length; l++) {
				
				//Exibir valor da matriz
				System.out.printf("%d", matriz[c][l]);
			}
			
		}
	}

}
