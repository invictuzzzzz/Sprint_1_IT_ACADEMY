package TEMA_8.NIVEL_2.EJERCICIO_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> variedList = List.of("Alberto", 213, "Juanito", "Ernesto",
                592, "Ana", "Alba", 92, "Elias", "234", "65", "12");

        System.out.println("Ordenado alfabeticamente por su primer caracter");
        variedList.stream()
                .sorted(Comparator.comparing(n -> n.toString().charAt(0)))
                .forEach(n -> System.out.println(n));

        System.out.println();
        System.out.println("Solo Strings. Primero las que empiecen con E. Luego el resto");

        variedList.stream()
                .filter(n -> n.toString().startsWith("E"))
                .forEach(n -> System.out.println(n));
        variedList.stream()
                .filter(n -> !n.toString().startsWith("E"))
                .forEach(n -> System.out.println(n));

        System.out.println();
        System.out.println("Modifica todos los elementos de la lista que tengan una A por un 4");

        variedList.stream()
                .map(n -> n.toString().replace('a', '4'))
                .map(n -> n.toString().replace('A', '4'))
                .forEach(n -> System.out.println(n));

        System.out.println();
        System.out.println("Muestra solo los números.");

        variedList.stream()
                .filter(n -> n.toString().chars().allMatch(Character :: isDigit))
                .forEach(n -> System.out.println(n));




    }

}
