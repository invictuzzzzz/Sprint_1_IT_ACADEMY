package TEMA_7.NIVEL_1.EJERCICIO_2;

public class Main {
    public static void main(String[] args) {

        TrabajadorPresencial trabajadorPresencial = new TrabajadorPresencial
                ("Pepe", "Gomez", 11.50, 65.94);

        TrabajadorOnline trabajadorOnline1 = new TrabajadorOnline
                ("Luis", "Garcia", 10.50);

        double sueldoPresencial = trabajadorPresencial.calcularSueldo(65);
        double sueldoOnline = trabajadorOnline1.calcularSueldo(70);

        System.out.println("El sueldo del trabajador presencial es de: " + sueldoPresencial +"€");
        System.out.println("El sueldo del trabajador online es de : " + sueldoOnline + "€");

        //Metodos @Deprecated creado directamente en la clase Hija.
        trabajadorPresencial.metodoObsoleto();

        //Metodo @Deprecated en la Clase padre Trabajador. Hace un @override a la clase hija.
        double plusDietas = trabajadorPresencial.dietasTrabajador(22, 12.50);
        System.out.println("El plus del trabajador presencial por las dietas es de : " + plusDietas);


    }


}
