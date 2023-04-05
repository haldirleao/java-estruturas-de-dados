package lista_encadeada;

public class Main {
    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        // testes com a lista vazia
        System.out.println("--- TESTES COM A LISTA VAZIA ---");
        System.out.println(minhaListaEncadeada);
        System.out.println(minhaListaEncadeada.isEmpty());
        System.out.println(minhaListaEncadeada.size());

        //

        System.out.println("--- TESTES MANIPULANDO A LISTA ---");

        // Adicionando elementos na lista
        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");
        minhaListaEncadeada.add("teste4");
        minhaListaEncadeada.add("teste5");
        minhaListaEncadeada.add("teste6");
        System.out.println(minhaListaEncadeada);

        // imprimindo os conteúdos dos elementos da lista.
        for (int i = 0; i < minhaListaEncadeada.size(); i++) {
            System.out.println(minhaListaEncadeada.get(i));
        }

        // imprimindo toda a lista.
        System.out.println(minhaListaEncadeada);

        // removendo elemento da lista
        System.out.println(minhaListaEncadeada.remove(0));
        System.out.println(minhaListaEncadeada);

        // removendo todos os elementos da lista
        System.out.println("Removendo todos os elementos da lista");
        while (!minhaListaEncadeada.isEmpty()) {
            System.out.println(minhaListaEncadeada.remove(0));
        }
        System.out.println(minhaListaEncadeada);

    }
}
