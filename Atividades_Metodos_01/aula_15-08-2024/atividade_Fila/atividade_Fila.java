/*
Estrutura de dados linear.
Segue o princípio FIFO (First In, First Out).

enqueue: Adicionar elemento no final.
dequeue: Remover elemento do in´ıcio.
front: Obter o elemento do in´ıcio sem removˆe-lo.
isEmpty: Verificar se a fila est´a vazia.

*/

public class Fila {
    public Integer[] itens = new Integer[5];
    public Integer primeiro=-1, ultimo=-1;

    public void enqueue(int item) {
        if(ultimo < 5) {
        	ultimo = ultimo + 1;
        	itens[ultimo] = item;
        }
    }

    public int dequeue() {
    	if(isEmpty()) {
    		System.out.println("Fila Vazia !");
    		return -1;
    	}else {
    		primeiro = primeiro + 1;
    		return itens[primeiro];
    	}
    }

    public boolean isEmpty() {
    	if(primeiro == ultimo && primeiro != -1) {
    		return true;
    	}else {
    		return false;
    	}
    }

    public static void main(String[] args) {
    	Fila queue = new Fila();
    	
    	queue.enqueue(1);
    	queue.enqueue(2);
    	queue.enqueue(3);
    	
    	Integer value = queue.dequeue();
    	System.out.printf("Valor retirado da fila %d \n", value);
    }
  
}

