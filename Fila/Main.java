package Fila;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.enfileiramento(1);
        fila.enfileiramento(5);
        fila.enfileiramento(10);
        fila.enfileiramento(19302);

        System.out.printf("A lista está vazia: %b",fila.isEmpty());

        System.out.printf("O ultimo elemento agora é: %s",fila.rear());

        System.out.printf("o primeiro elemento agora é: %d",fila.front());
        System.out.println("----------------------------------------------");
        fila.desenfileiramento();
        fila.desenfileiramento();

        System.out.printf("O ultimo elemento agora é: %s",fila.rear());

        System.out.printf("o primeiro elemento agora é: %d",fila.front());

    }
}
