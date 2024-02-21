package TEMA_6.NIVEL_2.EJERCICIO_2;

import java.util.List;

public class GenericMethods {


    //Lista de argumentos variables indefinidas
    public static void listaVariablesIndefinida(List<?> list) {
        for (Object object : list) {
            System.out.println(object);
        }

    }
}