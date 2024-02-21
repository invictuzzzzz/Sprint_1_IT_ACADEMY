package TEMA_6.NIVEL_1.EJERCICIO_1;

public class Main {
    public static void main(String[] args) {

        Coche coche1 = new Coche("Nissan", "Juke", 1200);
        Coche coche2 = new Coche("Ford", "Mustang", 2200);
        Coche coche3 = new Coche("Renault", "Megane", 1400);

        NoGenericMethods guardado1 = new NoGenericMethods(coche1, coche2, coche3);
        System.out.println(guardado1);
        NoGenericMethods guardado2 = new NoGenericMethods(coche3, coche2, coche1);
        System.out.println(guardado2);
        NoGenericMethods guardado3 = new NoGenericMethods(coche2, coche1, coche3);
        System.out.println(guardado3);
    }
}
