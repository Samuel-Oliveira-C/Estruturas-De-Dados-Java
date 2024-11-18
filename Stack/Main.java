package Stack;

public class Main {
    public static void main(String[] args) {
        StackStructure stack = new StackStructure();

        stack.push(213);
        stack.push(14);
        stack.push(2168);

        System.out.println("Tamanho da stack: " + stack.sizeStack());

        System.out.println("A Stack está vazia? " + stack.isEmpty());

        System.out.println("Ultimo elemento: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Agora não deve ter mais elementos: " + stack.sizeStack());
        
        System.out.println("A stack deve estar vazia(true): " +  stack.isEmpty());
        
        System.out.println("nÃO DEVE ter elementos: " + stack.peek());  //deve lançar uma exception, pois está sem elementos
        
    }
}