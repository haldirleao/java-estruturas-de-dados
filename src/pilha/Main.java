package pilha;

public class Main {
    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        // Incluindo elementos na pilha
        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));
        System.out.println(minhaPilha);

        // Excluindo elemento da pilha
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);

        // Incluindo elemento na pilha
        minhaPilha.push(new No(99));
        System.out.println(minhaPilha);
        
        // Visualizando elemento do topo da pilha, sem excluí-lo
        System.out.println(minhaPilha.top());
        System.out.println(minhaPilha);
        
        

    }

}
