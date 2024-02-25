package TEMA_8.NIVEL_1.EJERCICIO_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> wordsList = new ArrayList<>(Arrays.asList("pepe", "paco",
                "jose", "luis", "maria", "Dani", "alberto", "mario"));

        List<String> listWithO = containsLetter(wordsList, "o", 5);
        listWithO.forEach((n) -> System.out.println(n));
    }

    public static List<String> containsLetter(List<String> list, String letter, int lenght) {
        return list.stream().filter(n -> n.contains(letter)
                && n.length() >= lenght).collect(Collectors.toList());
    }
}
