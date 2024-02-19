package TEMA_1.NIVEL_1.ej2;

public class Coche {
    private static final String marca = "Renault"; //No puede ser añadido al constructor
    private static String modelo; //Puede ser añadido a través de la clase.
    private final int potencia; //Se añade normal pero no puede ser modificado.

    public Coche(String modelo,int potencia) {
        this.potencia = potencia;
        Coche.modelo = modelo;
    }
    public static String getMarca() {
        return marca;
    }


    public static String getModelo() {
        return modelo;
    }
    public int getPotencia() {
        return this.potencia;
    }

    public static String  frenar() {
        return "El coche está frenando";
    }
    public String acelerar() {
        return "El coche está acelerando";
    }

}
