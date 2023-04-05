package lista_duplamente_encadeada;

public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> refProximoNo;
    private NoDuplo<T> refAnteriorNo;
    
    // construtor
    public NoDuplo(T conteudo) {
        this.conteudo = conteudo;
    }
    
    //getters & setters
    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getRefProximoNo() {
        return refProximoNo;
    }

    public void setRefProximoNo(NoDuplo<T> refProximoNo) {
        this.refProximoNo = refProximoNo;
    }

    public NoDuplo<T> getRefAnteriorNo() {
        return refAnteriorNo;
    }

    public void setRefAnteriorNo(NoDuplo<T> refAnteriorNo) {
        this.refAnteriorNo = refAnteriorNo;
    }

    @Override
    public String toString() {
        return "NoDuplo{conteudo=" + conteudo + "}";
    }

    

}
