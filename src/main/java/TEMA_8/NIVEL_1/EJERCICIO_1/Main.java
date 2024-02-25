package TEMA_8.NIVEL_1.EJERCICIO_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> wordsList = new ArrayList<>(Arrays.asList("pepe", "paco",
                "jose", "luis", "maria","Dani", "alberto"));

        List<String> listWithO = containsLetter(wordsList, "o");
        listWithO.forEach((n) -> System.out.println(n));
    }

    public static List<String> containsLetter(List<String> list, String letter) {
        return list.stream().filter(n -> n.contains(letter)).collect(Collectors.toList());
    }
}
