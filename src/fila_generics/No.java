// Refatoração da classe No
// Usar generics para garantir consistência na entrada dos dados.
// https://www.programiz.com/java-programming/generics

package fila_generics;

public class No<T> {

    private T object;
    private No<T> refNo;

    // construtores
    public No() {
    }

    public No(T object) {
        this.refNo = null;
        this.object = object;
    }

    // getters & setters
    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No<T> getRefNo() {
        return refNo;
    }

    public void setRefNo(No<T> refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "[No{object=" + object + "}]";
    }
}
