package TEMA_8.NIVEL_1.EJERCICIO_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] monthYear = {"Enero","Febrero", "Marzo", "Abril", "Mayo",
                "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        Arrays.stream(monthYear).forEach(System.out::println);
    }
}
