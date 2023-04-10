package arvorebinaria;

import arvorebinaria.model.Obj;

public class Main {
    public static void main(String[] args) {

        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();

        // TESTES COM A ÁRVORE VAZIA
        System.out.println("--- TESTES COM A ÁRVORE VAZIA ---");
        System.out.println(minhaArvore);
        System.out.println(minhaArvore.hashCode());
        System.out.println(minhaArvore.getClass());
        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();

        // TESTES MANIPULANDO A ÁRVORE
        System.out.println("--- TESTES MANIPULANDO A ÁRVORE ---");

        // Adicionando objetos à árvore
        minhaArvore.inserir(new Obj(13));
        minhaArvore.inserir(new Obj(10));
        minhaArvore.inserir(new Obj(25));
        minhaArvore.inserir(new Obj(2));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(20));
        minhaArvore.inserir(new Obj(31));
        minhaArvore.inserir(new Obj(29));

        // Exibindo a árvore
        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();

        // Inserindo novo objeto e exibindo
        System.out.println("\n------------------");
        minhaArvore.inserir(new Obj(32));
        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();

        // Removendo objeto e exibindo
        System.out.println("\n------------------");
        minhaArvore.remover(new Obj(13));
        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();
    }
}
