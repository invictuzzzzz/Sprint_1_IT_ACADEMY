package TEMA_6.NIVEL_2.EJERCICIO_2;

import java.util.List;

public class GenericMethods {

    public static <T> void cantidadVariableArgs(T... t) {

        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
    }
}