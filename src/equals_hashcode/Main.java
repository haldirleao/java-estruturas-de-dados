package equals_hashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        // criando instância de Carro com suas marcas
        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagen"));

        //
        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(listaCarros.contains(new Carro("Toyota")));

        System.out.println(new Carro("Ford").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chevrolet");
        System.out.println(carro1.equals(carro2));
        System.out.println(carro1.equals(listaCarros.get(0)));

    }
}
