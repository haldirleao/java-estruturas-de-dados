package lista_circular;

public class Main {
    public static void main(String[] args) {

        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        // TESTES COM A LISTA CIRCULAR VAZIA
        System.out.println("--- TESTES COM A LISTA CIRCULAR VAZIA ---");
        System.out.println(minhaListaCircular);
        System.out.println(minhaListaCircular.size());
        System.out.println(minhaListaCircular.isEmpty());

        // TESTES MANIPULANDO A LISTA CIRCULAR
        System.out.println("--- TESTES MANIPULANDO A LISTA CIRCULAR ---");

        minhaListaCircular.add("c0");
        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("c1");
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");
        System.out.println(minhaListaCircular);

        System.out.print(minhaListaCircular.get(0) + " ");
        System.out.print(minhaListaCircular.get(1) + " ");
        System.out.print(minhaListaCircular.get(2) + " ");
        System.out.print(minhaListaCircular.get(3) + " "); // retorna para primeiro elemento da lista circular!
        System.out.println(minhaListaCircular.get(4) + " ");

        // percorrendo os elementos da lista circular n vezes.
        for (int i = 0; i < 20; i++) {
            System.out.print(minhaListaCircular.get(i) + " ");
        }

        System.out.println("\n" + minhaListaCircular);

        // esvaziando a lista
        while (!minhaListaCircular.isEmpty()) {
            minhaListaCircular.remove(0);
            System.out.println(minhaListaCircular);
        }

    }
}
