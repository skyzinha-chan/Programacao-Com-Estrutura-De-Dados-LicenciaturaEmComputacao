/* 
Em Java, uma classe pode ser usada para agrupar variáveis e métodos.
Classes permitem encapsulamento, herança e polimorfismo.
Para simular uma ‘struct‘, usamos classes simples com variáveis públicas.

Em linguagens como C/C++, uma ‘struct‘ é usada para agrupar variáveis sob um mesmo nome.
Util para representar objetos simples com múltiplos atributos. 

Em Java, não há ‘structs‘, mas usamos classes para obter funcionalidade similar.
Permite que dados relacionados sejam armazenado no mesmo espaço.
Criação de estruturas heterogênias.
*/

/* Exercícios:
Mude o código para armazenar 20 pessoas;
Mostre todos os dados armazenados; */
import java.util.Scanner;
public class Pessoa {
    public String nome;
    public Integer idade;
    

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[20];
        
        for(int i=0; i < 20; i++) {
        	pessoas[i] = new Pessoa();
        }
        
        for(int i=0; i < 20; i++) {
        	pessoas[i].nome = teclado.next();
        	pessoas[i].idade = teclado.nextInt();
        }

        pessoas[0].nome  = "Ana";
        pessoas[0].idade = 20;

        pessoas[1].nome = "Joao";
        pessoas[1].idade = 20;
        
        for(int i=0; i < 20; i++) {
        	System.out.print("\t\n Nome: \t"+pessoas[i].nome+"\t\n");
        	System.out.print("Idade: \t"+pessoas[i].idade+"\t\n");
        }        
    }
}
