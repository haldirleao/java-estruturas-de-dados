// Refatoração da classe Fila
// Usar generics para garantir consistência na entrada dos dados.
// https://www.programiz.com/java-programming/generics

package fila_generics;

public class Fila<T> {

    private No<T> refNoEntradaFila;

    // construtor
    public Fila() {
        this.refNoEntradaFila = null;
    }

    // Método. Enfileirar
    public void enqueue(T object) {
        No<T> novoNo = new No<T>(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            No<T> noAuxiliar = refNoEntradaFila;
            
            if (refNoEntradaFila.getRefNo() == null)
                refNoEntradaFila = null;

            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }

            return (T) primeiroNo.getObject(); 
            // Sobre o aviso: Type safety: Unchecked cast from Object to T
            // https://stackoverflow.com/questions/2592642/type-safety-unchecked-cast-from-object
        }
        return null;
    }
    
    public T first() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
            // Sobre o aviso: Type safety: Unchecked cast from Object to T
            // https://stackoverflow.com/questions/2592642/type-safety-unchecked-cast-from-object
        }
        return null;
    }

    // Método: a fila está vazia?
    public boolean isEmpty() {
        return (refNoEntradaFila == null) ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No<T> noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null) {
            while (true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}] ---> ";
                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
