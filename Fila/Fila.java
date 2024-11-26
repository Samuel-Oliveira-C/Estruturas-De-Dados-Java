package Fila;

import java.util.ArrayList;

/*** a Estrutura de dados Fila funciona com a ordem de acesso FIFO (First in, First out),
 * ou seja o primeiro elementro a entrar na fila é o primeiro elemento a sair dela.
 * metodo opcional : @isFull: Verifica se a fila está cheia (se houver um limite de elementos).
 * metodos que vou criar:
 * @Enfileiramento: vai adicionar um novo elemento no final da fila
 * @Desenfileiramento: vai remover o elemento do inicio 
 * @Front: vai retorna o elemento no início da fila (sem removê-lo).
 * @Rear: Retorna o elemento no final da fila (sem removê-lo).
 * @isEmpty: Verifica se a fila está vazia.
 */
public class Fila {
    private ArrayList<Integer> fila = new ArrayList<Integer>(); //podia ser de outro tipo, mas para simplificar vou utilizar esse

    void enfileiramento(int element){
        fila.add(element);
    }
    void desenfileiramento (){
        fila.remove(0);
    }
    int front(){
        return  fila.get(0);
    }
    int rear(){
        int lastElement = fila.size();
        return fila.get(lastElement - 1);
    }
    boolean isEmpty(){
        return fila.isEmpty();
    }
}
