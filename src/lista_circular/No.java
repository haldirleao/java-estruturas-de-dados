package lista_circular;

public class No<T> {

    private T conteudo;
    private No<T> refProximoNo;

    // construtor
    public No(T conteudo) {
        this.refProximoNo = null;
        this.conteudo = conteudo;
    }

    // getters & setters
    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getRefProximoNo() {
        return refProximoNo;
    }

    public void setRefProximoNo(No<T> refProximoNo) {
        this.refProximoNo = refProximoNo;
    }

    @Override
    public String toString() {
        return "No [conteudo=" + conteudo + "]";
    }

}
