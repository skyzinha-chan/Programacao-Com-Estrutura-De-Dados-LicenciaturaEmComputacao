/*
Desenvolva um programa que declare uma matriz do tipo inteiro contendo 3 linhas por 3 colunas, na sequência preencha a matriz com valores que o usuário digitar e no final mostre somente os valores que forem maiores que a média dos valores de entrada da matriz.

Entrada de dados:

23 45 67 12 34 56 78 89 90

Saída de dados:

O valor 67 é maior que a media: 54.888889
O valor 56 é maior que a media: 54.888889
O valor 78 é maior que a media: 54.888889
O valor 89 é maior que a media: 54.888889
O valor 90 é maior que a media: 54.888889
*/

import java.util.Scanner;
public class L5_Ex5_ValoresMaioresQMediaMatriz {


	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in); 
		int[][] matriz = new int[3][3];
		int soma = 0;
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				matriz[linha][coluna] = teclado.nextInt();
				soma += matriz[linha][coluna];
			}
		}
		float media = soma / (float) (matriz.length * matriz[0].length);;
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
			   if(matriz[linha][coluna] > media) {
			        System.out.printf("O valor %d é maior que a media: %.6f%n", matriz[linha][coluna], media);
			    }
			    
			}
		}
	}
}