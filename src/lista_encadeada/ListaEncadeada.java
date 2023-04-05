package lista_encadeada;

public class ListaEncadeada<T> {

    private No<T> referenciaEntrada;

    // construtores
    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public void add(T conteudo) {
        
        No<T> novoNo = new No(conteudo);
        
        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
            // sobre o uso do return em métodos void.
            // https://stackoverflow.com/questions/7937029/how-to-break-out-or-exit-a-method-in-java
        }

        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {

        validaIndice(index);

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;

    }

    public T remove(int index) {
        No<T> noAlvo = this.getNo(index);

        if (index == 0) {
            referenciaEntrada = noAlvo.getProximoNo();
            return noAlvo.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);

        noAnterior.setProximoNo(noAlvo.getProximoNo());
        return noAlvo.getConteudo();
    }

    // método: retorna o tamanho da lista
    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while (true) {
            if (referenciaAux != null) {
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();
                } else
                    break;
            } else
                break;
        }
        return tamanhoLista;
    }

    // método: a lista está vazia?
    public boolean isEmpty() {
        return referenciaEntrada == null ? true : false;
    }

    private void validaIndice(int index) {
        if (index >= this.size()) {
            int ultimoIndice = this.size() - 1;
            throw new IndexOutOfBoundsException("Não existe o índice " + index
                    + " nessa lista. O último índice dessa lista é " + ultimoIndice);
        }
    }

    @Override
    public String toString() {

        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No[" + i + "]{conteudo=" + noAuxiliar.getConteudo() + "}] --> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
