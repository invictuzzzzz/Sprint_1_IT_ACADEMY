package TEMA_4.NIVEL_3;

import java.util.ArrayList;

public class ArrayListTest {


    public ArrayList<Object> generarArrayList() {
        ArrayList<Object> pruebaArrayList = new ArrayList<Object>();
        Object objeto1 = new Persona("Pepe", 23);
        Object objeto2 = new Coche("Ford", 1200);
        Object objeto4 = objeto2;
        Object objeto3 = "Luis";
        Object objeto5 = "Luis";
        pruebaArrayList.add(objeto1);
        pruebaArrayList.add(objeto2);
        pruebaArrayList.add(objeto3);
        pruebaArrayList.add(objeto4);
        pruebaArrayList.add(objeto5);


        return pruebaArrayList;
    }
}
