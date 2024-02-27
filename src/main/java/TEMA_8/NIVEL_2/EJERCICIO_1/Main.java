package TEMA_8.NIVEL_2.EJERCICIO_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<String> stringList = Arrays.asList("Teresa", "Maria", "Anibal",
                "Alabama", "Ana", "Fernando", "Alt");

        listFilter(stringList, "A", 3).forEach(n -> System.out.println(n));
    }


    public static List<String> listFilter(List<String> words, String word, int lenght) {
        return words.stream()
                .filter(n -> n.startsWith(word) && n.length() == lenght)
                .collect(Collectors.toList());
    }

}
