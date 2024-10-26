/* 
Estrutura de dados linear.
Segue o princípio LIFO (Last In, First Out).

push: Adicionar elemento no topo.
pop: Remover elemento do topo.
isEmpty: Verificar se a pilha est´a vazia.

*/

/*
    Exercicio: aumente o tamanho da pilha e mude o tipo de dados a serem armazenados
*/
public class Pilha {
	
	
    public Integer[]  itens = new Integer[10];
    public Integer      top = 0;

    public void push(int item) {
        if(top <= 10) {
        	itens[top] = item;
        	top        = top + 1;
        }else {
        	System.out.println("A pilha está cheia !");
        }
    }

    public int pop() {
    	if(isEmpty() == true) {
    		System.out.println("A pilha está vazia !");
    		return -1;
    	}else {
    		top = top -1;
    		Integer valor = itens[top];
    		return valor;
    	}
    }

   
    public boolean isEmpty() {
    	if(top == 0) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public static void main(String[] args) {
    	Pilha stack = new Pilha();
    	
    	System.out.println(" Vamos inserir os seguintes elementos [1,2,3,4,5] na pilha");
    	stack.push(1);
    	stack.push(2);
    	stack.push(3);
    	stack.push(4);
    	stack.push(5);
    	
    	System.out.printf(" Retirando o elemento %d da pilha\n", stack.pop());
    }
}