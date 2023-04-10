package stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Carro> pilhaCarros = new Stack<>();
        
        pilhaCarros.push(new Carro("Ford"));
        pilhaCarros.push(new Carro("Chevrolet"));
        pilhaCarros.push(new Carro("Fiat"));

        System.out.println(pilhaCarros);
        System.out.println(pilhaCarros.pop());
        System.out.println(pilhaCarros);
        
        System.out.println(pilhaCarros.peek());
        System.out.println(pilhaCarros);
        
        System.out.println(pilhaCarros.empty());
    }
}
