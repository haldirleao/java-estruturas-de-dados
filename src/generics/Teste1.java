// Why Use Generics?
// https://docs.oracle.com/javase/tutorial/java/generics/why.html
// https://www.programiz.com/java-programming/generics

package generics;

class Teste1 {
    public static void main(String[] args) {

        // initialize generic class
        // with Integer data
        GenericsClass<Integer> intObj = new GenericsClass<>(5);
        System.out.println("Generic Class returns: " + intObj.getData());

        // initialize generic class
        // with String data
        GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
        System.out.println("Generic Class returns: " + stringObj.getData());
    }
}

// create a generics class
class GenericsClass<T> {

    // variable of T type
    private T data;

    public GenericsClass(T data) {
        this.data = data;
    }

    // method that return T type variable
    public T getData() {
        return this.data;
    }
}

/*
 * NAMING CONVENTION
 * By convention, type parameter names are single, uppercase letters. This
 * stands in sharp contrast to the variable naming conventions that you already
 * know about, and with good reason: Without this convention, it would be
 * difficult to tell the difference between a type variable and an ordinary
 * class or interface name.
 * 
 * The most commonly used type parameter names are:
 * 
 * E - Element (used extensively by the Java Collections Framework)
 * K - Key
 * N - Number
 * T - Type
 * V - Value
 * S,U,V etc. - 2nd, 3rd, 4th types
 */