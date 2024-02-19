package TEMA_3.NIVEL_1.ejercicio_2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Listas {

    public static void main(String[] args) {

        List<Integer> listaUno = new ArrayList<>();

        listaUno.add(1);
        listaUno.add(2);
        listaUno.add(3);
        listaUno.add(4);
        listaUno.add(5);

        List<Integer> listaDos = new ArrayList<>();

        for (int i = listaUno.size() -1; i > 0; i--) {
            listaDos.add(listaUno.get(i));
        }

       ListIterator<Integer> iterator = listaUno.listIterator(listaUno.size());
       while (iterator.hasPrevious()){
            listaDos.add(iterator.previous());
        }

        ListIterator<Integer> iterador2 = listaDos.listIterator();
        while (iterador2.hasNext()) {
            System.out.println(iterador2.next());
        }

    }

}
