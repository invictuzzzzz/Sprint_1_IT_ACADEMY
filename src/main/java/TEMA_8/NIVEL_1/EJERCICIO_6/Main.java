package TEMA_8.NIVEL_1.EJERCICIO_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Object> newList = Arrays.asList("pepe", 213, "alabama", 912, "gustavo",
                342, "maria", 43, "edificio", "murcielago", 543);

        newList.stream()
                .filter(n -> n instanceof String || n instanceof Integer) // filtra tanto cadenas como ints
                .map(n -> n instanceof Integer ? String.valueOf(n) : (String) n)
                // si es un int lo convierte a string con valueOf, si es string ya ta.
                .sorted(Comparator.comparingInt((String s) -> s.length()))
                .forEach(System.out::println);
    }
}