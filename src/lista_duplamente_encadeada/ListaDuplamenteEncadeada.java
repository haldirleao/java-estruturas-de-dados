package lista_duplamente_encadeada;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    // construtor
    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setRefProximoNo(null);
        novoNo.setRefAnteriorNo(ultimoNo);
        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if (ultimoNo != null) {
            ultimoNo.setRefProximoNo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento) {
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setRefProximoNo(noAuxiliar);

        if (novoNo.getRefProximoNo() != null) {
            novoNo.setRefAnteriorNo(noAuxiliar.getRefAnteriorNo());
            novoNo.getRefProximoNo().setRefAnteriorNo(novoNo);

        } else {
            novoNo.setRefAnteriorNo(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getRefAnteriorNo().setRefProximoNo(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index) {
        if (index == 0) {
            primeiroNo = primeiroNo.getRefProximoNo();
            if (primeiroNo != null) {
                primeiroNo.setRefAnteriorNo(null);
            }
        } else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getRefAnteriorNo().setRefProximoNo(noAuxiliar.getRefProximoNo());
            if (noAuxiliar != ultimoNo) {
                noAuxiliar.getRefProximoNo().setRefAnteriorNo(noAuxiliar.getRefAnteriorNo());
            } else {
                ultimoNo = noAuxiliar;
            }
        }
        this.tamanhoLista--;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getRefProximoNo();
        }
        return noAuxiliar;
    }

    public int size() {
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        NoDuplo<T> noAuxiliar = primeiroNo;

        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No" + i + " {conteudo=" + noAuxiliar.getConteudo() + "}] ---> ";
            noAuxiliar = noAuxiliar.getRefProximoNo();
        }
        strRetorno += "null";

        return strRetorno;
    }
}
