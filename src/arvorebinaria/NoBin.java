package arvorebinaria;

public class NoBin<T extends Comparable<T>> {

    private T conteudo;
    private NoBin<T> noRefEsq;
    private NoBin<T> noRefDir;

    // construtores
    public NoBin() {
    }

    public NoBin(T conteudo) {
        this.conteudo = conteudo;
        noRefEsq = noRefDir = null;
    }

    // getters & setters
    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoBin<T> getNoRefEsq() {
        return noRefEsq;
    }

    public void setNoRefEsq(NoBin<T> noRefEsq) {
        this.noRefEsq = noRefEsq;
    }

    public NoBin<T> getNoRefDir() {
        return noRefDir;
    }

    public void setNoRefDir(NoBin<T> noRefDir) {
        this.noRefDir = noRefDir;
    }

    @Override
    public String toString() {
        return "NoBin [conteudo=" + conteudo + "]";
    }

}