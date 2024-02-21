package TEMA_6.NIVEL_1.EJERCICIO_2;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Dani", "Diaz", 35);
        String ciudad = "Barcelona";
        int valor = 2311;


        GenericMethods.genericMethod(persona, ciudad, valor);
    }
}
