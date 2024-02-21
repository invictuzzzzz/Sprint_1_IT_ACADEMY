package TEMA_4.NIVEL_1.EJERCICIO_1;

import java.util.ArrayList;

public class MesManager {

    public static ArrayList<Meses> crearMeses() {
        ArrayList<Meses> listaMeses = new ArrayList<Meses>();


        Meses enero = new Meses("Enero", 1);
        listaMeses.add(enero);
        Meses febrero = new Meses("Febrero", 2);
        listaMeses.add(febrero);
        Meses marzo = new Meses("Marzo", 3);
        listaMeses.add(marzo);
        Meses abril = new Meses("Abril", 4);
        listaMeses.add(abril);
        Meses mayo = new Meses("Mayo", 5);
        listaMeses.add(mayo);
        Meses junio = new Meses("Junio", 6);
        listaMeses.add(junio);
        Meses julio = new Meses("Julio", 7);
        listaMeses.add(julio);
        Meses agosto = new Meses("Agosto", 8);
        listaMeses.add(agosto);
        Meses septiembre = new Meses("Septiembre", 9);
        listaMeses.add(septiembre);
        Meses octubre = new Meses("Octubre", 10);
        listaMeses.add(octubre);
        Meses noviembre = new Meses("Noviembre", 11);
        listaMeses.add(noviembre);
        Meses diciembre = new Meses("Diciembre", 12);
        listaMeses.add(diciembre);

        for (Meses mes : listaMeses) {
            System.out.println(mes.getNombreMes());
        }
        return listaMeses;
    }
}

