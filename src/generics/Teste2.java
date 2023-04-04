// https://www.programiz.com/java-programming/generics

package generics;

public class Teste2 {
    public static void main(String[] args) {

        // initialize the class with Integer data
        DemoClass demo = new DemoClass();

        // generics method working with String
        demo.<String>genericsMethod("Java Programming");

        // generics method working with integer
        demo.<Integer>genericsMethod(25);

        // Note: We can call the generics method without including the type parameter.
        // In this case, the compiler can match the type parameter based on the value
        // passed to the method.
        demo.genericsMethod("Java Programming");
        demo.genericsMethod(25);
        demo.genericsMethod(12.3D);

    }
}

class DemoClass {

    // create a generics method
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }
}