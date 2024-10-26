/*
Desenvolva um programa que declare uma matriz inteira de 3 linhas por 3 colunas e preencha todos os valores da matriz e na sequência mostre todos os valores da matriz.

Entrada de dados:

23 45 67 12 34 56 78 89 90

Saída de dados:

 23  45  67
 12  34  56
 78  89  90

*/
import java.util.Scanner;
public class L5_Ex4_PreenchaEImprimaMatriz {


	public static void main(String[] args) {
	    Scanner teclado = new Scanner(System.in); 
		int[][] matriz = new int[3][3];
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				matriz[linha][coluna] = teclado.nextInt();
			}
		}
		
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
			    System.out.printf(" %d ",matriz[linha][coluna]);
    		}
    		System.out.println();	
		}
	}
}

	


