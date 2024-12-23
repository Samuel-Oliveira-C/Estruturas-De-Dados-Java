package LinkedList;

import java.util.ArrayList;

public class LinkedList {
    private int node;
    private LinkedList next;

    public LinkedList(int node) {
        this.node = node;
        this.next = null;
    }

    public void iterarLinkedList(LinkedList node){
        LinkedList atual = node;

        while(atual != null){
            System.out.println(atual.node + "");

            atual = atual.next;
        }
        System.out.println("Não tem nenhum Nó");
    }

    public boolean procurarElemento(LinkedList node, int elementoProcurado ){
        while(node != null){
            if(node.node == elementoProcurado){
                return true;
            }
            node = node.next;
        }
        return false;
    }
}
