package TEMA_1.NIVEL_2;

public class Main {
    public static void main(String[] args) {

    Smartphone smartphone = new Smartphone("Apple", "15PRO");
    System.out.println(smartphone.llamar("94-652-53-76"));
    System.out.println(smartphone.alarma());
    System.out.println(smartphone.fotografiar());

    }
}
