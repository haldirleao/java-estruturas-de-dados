package atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {

        // Ao atribuir um tipo primitivo a outro (no caso int --> int), é copiado o
        // valor de uma variável à outra. Logo, mudar o valor de uma variável não
        // alterará o valor da outra.
        // LEMBRE-SE: Atribuições de primitivos sempre copiam o valor para a variável.
        int intA = 1;
        int intB = intA;
        System.out.println("IntA = " + intA + " IntB = " + intB);

        intA = 2;
        System.out.println("IntA = " + intA + " IntB = " + intB);

        // Atribuindo valores a objetos do tipo Integer
        // Ao atribuir um objeto a outra, ambos ficam com o endereço da posição de
        // memória.
        // Logo, mudar o valor de um objeto, também alterará o valor do outro.
        // LEMBRE-SE: Atribuição entre objetos apontam para o mesmo endereço de memória,
        // sem duplicar o objeto.
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;
        System.out.println("\nobjA = " + objA + " objB = " + objB);

        objA.setNum(2);
        System.out.println("objA = " + objA + " objB = " + objB);

        // Ambos os objetos compartilham o mesmo hashcode.
        System.out.println("objA hashcode: " + objA.hashCode());
        System.out.println("objB hashcode: " + objB.hashCode());
    }
}
