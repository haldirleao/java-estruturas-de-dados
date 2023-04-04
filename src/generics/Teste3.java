// https://www.programiz.com/java-programming/generics
// https://www.w3schools.com/java/java_arraylist.asp

package generics;

import java.util.ArrayList;

public class Teste3 {
    public static void main(String[] args) {

        // In this example, we have used the same ArrayList class to work with different
        // types of data.
        // Note: <null> is always accepted, no matter the data type.
        ArrayList<String> strList = new ArrayList<>();

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(null);
        System.out.println(intList.size());
        System.out.println(intList);

        strList.add("Um");
        strList.add("Dois");
        strList.add("Três");
        strList.add(null);
        System.out.println(strList.size());
        System.out.println(strList);

    }

}
