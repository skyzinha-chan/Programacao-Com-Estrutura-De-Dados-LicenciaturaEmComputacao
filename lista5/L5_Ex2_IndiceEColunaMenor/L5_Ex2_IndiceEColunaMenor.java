/*
Desenvolva um programa que declare uma matriz do tipo inteiro contendo 3 linhas por 3 colunas,
na sequência preencha a matriz com valores que o usuário digitar e no final mostre o valor do
índice da coluna e da linha em que possui o menor valor.

Entrada de dados:

23 45 67 12 34 56 78 89 90

Saída de dados:

O menor valor e 12 e esta na linha [1] e coluna [0]
*/
import java.util.Scanner;
public class L5_Ex2_IndiceEColunaMenor {


	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in); 
		int[][] matriz = new int[3][3];
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				matriz[linha][coluna] = teclado.nextInt();
			}
		}
		
		int[] menorPosicao  = encontrarMenorPosicao(matriz);
	    System.out.println("O menor valor e " + matriz[menorPosicao[0]][menorPosicao[1]] + " e esta na linha [" + menorPosicao[0] + "] e coluna [" +  menorPosicao[1] + "]");

		
	}
	

	
	   public static int[] encontrarMenorPosicao(int[][] matriz) {
        int[] indice = { 0, 0 };
        int menorValor = matriz[0][0];
        for (int linha  = 0; linha  < matriz.length; linha ++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha ][coluna] < menorValor) {
                    menorValor = matriz[linha ][coluna];
                    indice[0] = linha;
                    indice[1] = coluna; ;
                }
            }
        }
        return indice;
    }
}
