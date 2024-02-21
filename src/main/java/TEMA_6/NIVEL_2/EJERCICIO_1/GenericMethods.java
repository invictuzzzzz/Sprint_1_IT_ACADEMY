package TEMA_6.NIVEL_2.EJERCICIO_1;

public class GenericMethods {


    //Argumento 2 ahora no es generico. es solo de clase String
    public static <T> void genericMethodMenosUno(T argumento1, String argumento2, T argumento3) {
        System.out.println("Argumento1: " + argumento1 +
                "\nArgumento2: " + argumento2 +
                "\nArgumento3: " + argumento3);
    }
}