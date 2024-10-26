/*
Desenvolva um programa que declare uma matriz do tipo inteiro contendo 3 linhas por 3 colunas, na sequência preencha a matriz com valores que o usuário digitar e no final mostre o valor do índice da coluna e da linha em que possui o maior valor.

Entrada de dados:

23 45 67 12 34 56 78 89 90

Saída de dados:

O maior valor e 90 e esta na linha [2] e coluna [2]
*/

import java.util.Scanner;
public class L5_Ex3_IndiceEColunaMaior {


	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in); 
		int[][] matriz = new int[3][3];
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				matriz[linha][coluna] = teclado.nextInt();
			}
		}
		
		int[] maiorPosicao  = encontrarMaiorPosicao(matriz);
	    System.out.println("O maior valor e " + matriz[maiorPosicao[0]][maiorPosicao[1]] + " e esta na linha [" + maiorPosicao[0] + "] e coluna [" +  maiorPosicao[1] + "]");

		
	}
	

	
	   public static int[] encontrarMaiorPosicao(int[][] matriz) {
        int[] indice = { 0, 0 };
        int maiorValor = matriz[0][0];
        for (int linha  = 0; linha  < matriz.length; linha ++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha ][coluna] > maiorValor) {
                    maiorValor = matriz[linha ][coluna];
                    indice[0] = linha;
                    indice[1] = coluna; ;
                }
            }
        }
        return indice;
    }
}
