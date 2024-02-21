package TEMA_6.NIVEL_2.EJERCICIO_1;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Dani", "Diaz", 35);
        String ciudad = "Barcelona";
        int valor = 2311;


        GenericMethods.genericMethodMenosUno(persona, ciudad, valor);
    }
}
