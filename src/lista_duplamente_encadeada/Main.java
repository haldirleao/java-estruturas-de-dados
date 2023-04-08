package lista_duplamente_encadeada;

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();

        // --- TESTES COM A LISTA VAZIA ---
        System.out.println("--- TESTES COM A LISTA VAZIA ---");
        System.out.println(minhaListaEncadeada.size());
        System.out.println(minhaListaEncadeada);

        // --- TESTES MANIPULANDO A LISTA ---
        System.out.println("--- TESTES MANIPULANDO A LISTA ---");

        // Adicionando elementos à lista
        minhaListaEncadeada.add("c1");
        minhaListaEncadeada.add("c2");
        minhaListaEncadeada.add("c3");
        minhaListaEncadeada.add("c4");
        minhaListaEncadeada.add("c5");
        minhaListaEncadeada.add("c6");
        minhaListaEncadeada.add("c7");
        System.out.println(minhaListaEncadeada);

        // removendo elemento da lista
        minhaListaEncadeada.remove(3);
        System.out.println(minhaListaEncadeada);

        // adicionando elemento em uma posição específica
        minhaListaEncadeada.add(3, "99");
        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.get(3));

        // removendo todos os elementos da lista
        while (minhaListaEncadeada.size() > 0) {
            minhaListaEncadeada.remove(0);
        }
        System.out.println(minhaListaEncadeada);
    }
}
