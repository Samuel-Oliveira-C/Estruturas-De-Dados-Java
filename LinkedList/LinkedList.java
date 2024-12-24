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
    public int tamanhoLista(LinkedList node){
        int length = 0;
        LinkedList atual = node;

        while (atual != null) {
            length++;
            atual = atual.next;
        }
        return length;
    }
    public LinkedList inserirNoInicio(LinkedList node, int elementoQueVaiInserir){
        LinkedList novoValor = new LinkedList(elementoQueVaiInserir);
        novoValor.next = node;

        node = novoValor;

        return node;
    }
    public LinkedList inserirNoFinal (LinkedList node, int elementoQueVaiInserir){
        LinkedList nodes = new LinkedList(elementoQueVaiInserir);

        if(node == null){
            return nodes;
        }
        LinkedList atual = node;

        while (atual.next != null) {
            atual = atual.next;
        }
        atual.next= nodes;

        return node;
    }
}
