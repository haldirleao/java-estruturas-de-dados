package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> filaCarros = new LinkedList<>();

        filaCarros.add(new Carro("Ford"));
        filaCarros.add(new Carro("Chevrolet"));
        filaCarros.add(new Carro("Fiat"));

        // add(): Inserts the specified element into this queue if it is possible to do
        // so immediately without violating capacity restrictions, returning true upon
        // success and throwing an IllegalStateException if no space is currently
        // available.
        System.out.println(filaCarros.add(new Carro("Peugeot")));
        System.out.println(filaCarros);

        // offer(): Inserts the specified element into this queue if it is possible to
        // do so immediately without violating capacity restrictions.
        System.out.println(filaCarros.offer(new Carro("Renault")));
        System.out.println(filaCarros);

        // peek(): Retrieves, but does not remove, the head of this queue, or returns
        // null if this queue is empty.
        System.out.println(filaCarros.peek());
        System.out.println(filaCarros);

        // poll(): Retrieves and removes the head of this queue, or returns null if this
        // queue is empty.
        System.out.println(filaCarros.poll());
        System.out.println(filaCarros);

        System.out.println(filaCarros.isEmpty());
        System.out.println(filaCarros.size());

    }
}
