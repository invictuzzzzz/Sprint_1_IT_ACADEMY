package TEMA_3.NIVEL_2.ejercicio_2;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    static HashSet<Restaurante> restaurantes = new HashSet<Restaurante>();

    public static void main(String[] args) {


        Restaurante restaurante1 = new Restaurante("Bar Pepe", 8);
        Restaurante restaurante2 = new Restaurante("Bar Pepe", 8);
        Restaurante restaurante3 = new Restaurante("Bar Pepe", 7);
        Restaurante restaurante4 = new Restaurante("Bar Birra", 6);
        Restaurante restaurante5 = new Restaurante("Bar Lola", 7);
        Restaurante restaurante6 = new Restaurante("Bar Manu", 7);
        Restaurante restaurante7 = new Restaurante("Bar Manu", 10);
        Restaurante restaurante8 = new Restaurante("Bar Pipas", 4);
        Restaurante restaurante9 = new Restaurante("Bar Caña y tapa", 3);
        restaurantes.add(restaurante1);
        restaurantes.add(restaurante2); // no se añade
        restaurantes.add(restaurante3);
        restaurantes.add(restaurante4);
        restaurantes.add(restaurante5);
        restaurantes.add(restaurante6);
        restaurantes.add(restaurante7);
        restaurantes.add(restaurante8);
        restaurantes.add(restaurante9);

        TreeSet restaurantes2 = new TreeSet<>(restaurantes);
        //Convertimos el HashSet del ej anterior en un TreeSet.
        //Con el TreeSet lo añadido se muestra en orden Ascende o Descendiente según necesites
        System.out.println("El TreeSet tiene un total de : " + restaurantes2.size() +
                " objetos en total.");

        for (Object restaurante  : restaurantes2) {
            System.out.println(restaurante);
        }
    }
}