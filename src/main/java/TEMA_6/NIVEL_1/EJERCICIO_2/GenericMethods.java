package TEMA_6.NIVEL_1.EJERCICIO_2;

public class GenericMethods {


    public static <T> void genericMethod(T argumento1, T argumento2, T argumento3) {
        System.out.println("Argumento1: " + argumento1 +
                "\nArgumento2: " + argumento2 +
                "\nArgumento3: " + argumento3);
    }
}