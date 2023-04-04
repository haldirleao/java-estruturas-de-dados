package no;

public class Main {
    public static void main(String[] args) {

        // no1 --> no2 --> no3 --> no4 --> null
        No no1 = new No("Conteúdo no1");
        No no2 = new No("Conteúdo no2");

        no1.setProximoNo(no2);

        No no3 = new No("Conteúdo no3");

        no2.setProximoNo(no3);

        No no4 = new No("Conteúdo no4");

        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);

        System.out.println("--- IMPRIMINDO ENCADEAMENTO DE NÓS ---");
        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }
}