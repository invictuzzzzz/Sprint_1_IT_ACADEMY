package TEMA_3.NIVEL_2.ejercicio_1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static HashSet<Restaurante> restaurantes = new HashSet<Restaurante>();

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String respuesta = "";

        do {

            System.out.println("Dime el nombre del Restaurante");
            String nombreRes = entrada.nextLine();
            System.out.println("Dime la puntuación del Restaurante");
            int puntuacionRes = entrada.nextInt();
            entrada.nextLine();
            crearRestaurante(nombreRes, puntuacionRes);
            System.out.println("Quieres añadir otro? ");
            respuesta = entrada.nextLine();

        } while (respuesta.equalsIgnoreCase("Si"));

        Restaurante restaurante1 = new Restaurante("Bar Pepe", 8);
        Restaurante restaurante2 = new Restaurante("Bar Pepe", 8);
        Restaurante restaurante3 = new Restaurante("Bar Tapas", 5);
        Restaurante restaurante4 = new Restaurante("Bar Birra", 6);
        Restaurante restaurante5 = new Restaurante("Bar Tapas", 5);
        restaurantes.add(restaurante1);
        restaurantes.add(restaurante2);
        restaurantes.add(restaurante3);
        restaurantes.add(restaurante4);
        restaurantes.add(restaurante5);

        //No se añade el restaurante 2 al HashSet

        System.out.println("El HashSet tiene un total de : " + restaurantes.size() +
                " objetos en total.");

        for (Restaurante rest : restaurantes) {
            System.out.println(rest.toString());
        }
    }
    
    // Metodo crear restaurante y añadir al hashset restaurantes

    public static void crearRestaurante(String nombre, int puntuacion) {
        Restaurante restaurante = new Restaurante(nombre, puntuacion);
        restaurantes.add(restaurante);
    }

}