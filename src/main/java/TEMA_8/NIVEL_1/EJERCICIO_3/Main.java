package TEMA_8.NIVEL_1.EJERCICIO_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] monthYear = {"Enero","Febrero", "Marzo", "Abril", "Mayo",
                "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        Arrays.stream(monthYear).forEach((n) -> System.out.println(n));
    }
}
