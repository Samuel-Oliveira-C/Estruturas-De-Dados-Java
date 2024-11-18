package Stack;

import java.util.ArrayList; 

/*** A estrutura de dados Stack ela é LIFO(Last in first Out), ou seja o ultimo elemento a entrar é o primeiro a sair. 
 * O tipo que vou fazer é numérico
 * ela vai ter os seguintes metodos padrões:
 * @push: método que adiciona um novo item no stack
 * @pop: método que remove o ultimo elemento no stack
 * @peek: método que vai me dizer o ultimo elemento da stack
 * @isEmpty: método que vai me dizer se a stack está vazia ou não
 * @sizeStack: método que retorna a quantidade de elemento no stack.
 */

public class StackStructure {
    private ArrayList<Integer> element = new ArrayList<Integer>();

    void push(int elemento){
        this.element.add(elemento);
    }
    void pop(){
        this.element.removeLast();
    }
    int peek(){
        return this.element.getLast();
    }
    boolean isEmpty(){
        int isEmpty = this.element.size();
        if(isEmpty > 0){
            return false;
        }
        else{
            return true;
        }
    }
    int sizeStack(){
        return this.element.size();
    }
}
