// Refatoração da classe Main
// Usar generics para garantir consistência na entrada dos dados.
// https://www.programiz.com/java-programming/generics

package fila_generics;

public class Main {
    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();

        // testes com fila vazia
        System.out.println("--- TESTES COM FILA VAZIA ---");
        System.out.println(minhaFila.isEmpty());
        System.out.println(minhaFila.first());
        System.out.println(minhaFila.toString());
        System.out.println(minhaFila.dequeue());

        System.out.println("--- TESTES MANIPULANDO A FILA ---");

        // Enfileirando
        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");
        System.out.println(minhaFila);

        // Saindo da fila
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);

        // chegando mais um na fila
        minhaFila.enqueue("último");
        System.out.println(minhaFila);

        // primeiro da fila
        System.out.println(minhaFila.first());
        System.out.println(minhaFila);

    }
}
