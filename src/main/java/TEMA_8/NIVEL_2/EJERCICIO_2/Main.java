package TEMA_8.NIVEL_2.EJERCICIO_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Integer> integerList = List.of(123, 32, 94, 53, 32, 324, 435, 3243, 36);
        System.out.println(mapInt(integerList));

    }

    public static String pairOrImpair(Integer i) {
        return (i % 2 == 0) ? "e" : "o";
    }

    public static String mapInt(List<Integer> integerList) {
        return integerList.stream()
                .map(n -> pairOrImpair(n)
                + n.toString()).collect(Collectors.joining(","));
    }
}
