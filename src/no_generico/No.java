
// Nós genéricos (O tipo de dado é definido ao instanciar os objetos).

package no_generico;

public class No<T> {

    private T conteudo;
    private No<T> proximoNo;

    // construtor
    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    // getters & setters - https://www.w3schools.com/java/java_encapsulation.asp
    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No [conteudo = " + conteudo + "]";
    }

}
