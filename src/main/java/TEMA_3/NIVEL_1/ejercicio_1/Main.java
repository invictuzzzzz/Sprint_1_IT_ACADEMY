package TEMA_3.NIVEL_1.ejercicio_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class Main {
    static ArrayList<Month> meses = new ArrayList<Month>();

    public static void main(String[] args) {


        creacionMesesIntroArray("Enero");
        creacionMesesIntroArray("Febrero");
        creacionMesesIntroArray("Marzo");
        creacionMesesIntroArray("Abril");
        creacionMesesIntroArray("Mayo");
        creacionMesesIntroArray("Junio");
        creacionMesesIntroArray("Julio");
        creacionMesesIntroArray("Septiembre");
        creacionMesesIntroArray("Octubre");
        creacionMesesIntroArray("Noviembre");
        creacionMesesIntroArray("Diciembre");

        int contador = 1;
        for (Month month : meses) {
            System.out.println(contador + ". " + month.getName());
            contador++;
        }
        System.out.println("\nImpresión de 11 meses a falta de Agosto. " +
                "Lo insertamos en la posición 7 del ArrayList\n");

        Month agosto = new Month("Agosto");
        meses.add(7, agosto); // Insertar en la posición 7

        //Demostramos que mes Agosto se ha insertado en la posición 7
        contador = 1;
        for (Month month : meses) {
            System.out.println(contador + ". " + month.getName());
            contador++;
        }
        System.out.println("\nQueda añadido en la posición correcta.\n");

        //Convertimos el arraylist a un HashSet
        //Se imprimirá desordenado.

        HashSet<Month> monthsSet = new HashSet<Month>(meses);
        System.out.println("Convertimos el Arraylist a un HashSet y mostramos.:");
        contador = 1;
        for (Month mes : monthsSet) {
            System.out.println(contador + ". " + mes.getName());
            contador++;
        }

        System.out.println("HashSet antes de añadir 3 elementos duplicados: " +
                monthsSet.size());
        monthsSet.add(agosto); // Añadir Agosto de nuevo
        monthsSet.add(agosto);
        monthsSet.add(agosto);
        System.out.println("HashSet después de añadir 3 elementos duplicados: " +
                monthsSet.size());

        contador = 1;
        for (Month month : monthsSet) {
            System.out.println(contador + ". " + month.getName());
            contador++;
        }
        System.out.println("\n** HashSet de los meses, queda desordenado" +
                " y no permite duplicados **\n");

        Month nuevoMesInventado = new Month("Agosto");
        monthsSet.add(nuevoMesInventado);
        System.out.println("Creamos un nuevo mes inventado " +
                "pero con el mismo nombre que Agosto.");

        contador = 1;
        for (Month month : monthsSet) {
            System.out.println(contador + ". " +  month.getName());
            contador++;
        }
        System.out.println("Admite el duplicado por el nombre.");


        System.out.println("\n***** Impresión con Iterador ****\n");
        Iterator<Month> mesesIterador = monthsSet.iterator();

        contador = 1;
        while (mesesIterador.hasNext()) {
            Month month = mesesIterador.next();
            System.out.println(contador + ". " + month.getName());
            contador++;
        }
        monthsSet.remove(agosto);
        mesesIterador = monthsSet.iterator();

        System.out.println("\n ** Volvemos a imprimir con Iterador habiendo" +
                " borrado el mes inventado.");
        contador = 1;
        while (mesesIterador.hasNext()) {
            System.out.println(contador + ". " + mesesIterador.next().getName());
            contador++;
        }
    }
    public static void creacionMesesIntroArray(String nombre) {
        Month mes = new Month(nombre);
        meses.add(mes);
    }


 }