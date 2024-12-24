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
    public LinkedList inserirPosicao (LinkedList node, int posicao , int elementoQueVaiInserir){
        if(posicao < 1){
            System.out.println("Posicão invalida");
            return node;
        }
        if(posicao ==1 ){
            LinkedList temp = new LinkedList(elementoQueVaiInserir);
            temp.next = node;
            return temp;
        }
        LinkedList anteriorElemento = node;
        int count = 1;

        while (count < posicao- 1 && anteriorElemento != null) {
            anteriorElemento = anteriorElemento.next;
            count ++;
        }

        if(anteriorElemento == null){
            System.out.println("Posicão Invalida");
            return node;
        }
        LinkedList temp = new LinkedList(elementoQueVaiInserir);
        temp.next = anteriorElemento.next;
        anteriorElemento.next = temp;

        return node;
    }
}
