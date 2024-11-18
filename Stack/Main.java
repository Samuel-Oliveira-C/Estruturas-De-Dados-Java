package Stack;

public class Main {
    public static void main(String[] args) {
        StackStructure stack = new StackStructure();

        stack.push(213);
        stack.push(14);
        stack.push(2168);

        stack.sizeStack();
        
        stack.isEmpty();

        stack.peek();

        stack.pop();
        stack.pop();
        stack.pop();

        stack.sizeStack();
        
        stack.isEmpty();

        stack.peek();
    }
}