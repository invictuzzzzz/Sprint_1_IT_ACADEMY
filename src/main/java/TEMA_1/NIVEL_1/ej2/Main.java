package TEMA_1.NIVEL_1.ej2;

public class Main {
    public static void main(String[] args) {

        Coche nuevoCoche = new Coche("Megane", 1400);


        //metodo de la clase, porque es estatico
        System.out.println(Coche.frenar());

        //metodo del objeto
        System.out.println(nuevoCoche.acelerar());

        System.out.println(Coche.getMarca()); //invocando la clase
        System.out.println(Coche.getModelo());
        System.out.println(nuevoCoche.getPotencia()); //invocando el objeto

    }
}
