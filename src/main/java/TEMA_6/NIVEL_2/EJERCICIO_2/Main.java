package TEMA_6.NIVEL_2.EJERCICIO_2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Dani", "Diaz", 35);
        String ciudad = "Barcelona";
        Integer valor = 2311;
        Integer valor2 = 123131;
        Persona persona1 = new Persona("Pepe", "Garcia", 21);
        String palabra1 = "Camiseta";

        List<Object> lista = Arrays.asList(persona,ciudad,valor, persona1, valor2, palabra1, ciudad);
        GenericMethods.listaVariablesIndefinida(lista);
    }
}
