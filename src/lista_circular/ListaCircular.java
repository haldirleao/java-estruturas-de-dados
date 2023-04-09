package lista_circular;

public class ListaCircular<T> {

    private No<T> cauda;
    private No<T> cabeca;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo) {

        No<T> novoNo = new No<>(conteudo);

        if (this.isEmpty()) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setRefProximoNo(cauda);
        } else {
            novoNo.setRefProximoNo(this.cauda);
            this.cabeca.setRefProximoNo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    public void remove(int index) {
        if (index >= this.tamanhoLista) {
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista.");
        }

        No<T> noAuxiliar = this.cauda;
        if (index == 0) {
            this.cauda = this.cauda.getRefProximoNo();
            this.cabeca.setRefProximoNo(this.cauda);
        } else if (index == 1) {
            this.cauda.setRefProximoNo(this.cauda.getRefProximoNo().getRefProximoNo());
        } else {
            for (int i = 0; i < (index - 1); i++) {
                noAuxiliar = noAuxiliar.getRefProximoNo();
            }
            noAuxiliar.setRefProximoNo(noAuxiliar.getRefProximoNo().getRefProximoNo());
        }
        this.tamanhoLista--;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("A lista está vazia!");
        }

        if (index == 0) {
            return this.cauda;
        }

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getRefProximoNo();
        }
        return noAuxiliar;
    }

    public boolean isEmpty() {
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size() {
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No" + i + " {conteudo=" + noAuxiliar.getConteudo() + "}] ---> ";
            noAuxiliar = noAuxiliar.getRefProximoNo();
        }
        strRetorno += this.isEmpty() ? "[]" : "(Retorna ao início)";

        return strRetorno;
    }

}
