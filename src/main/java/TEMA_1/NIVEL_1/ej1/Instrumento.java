package TEMA_1.NIVEL_1.ej1;

public abstract class Instrumento {
    private String nombre;
    private int precio;

    public Instrumento(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Soy un/a " + this.nombre + " y tengo un precio de " + this.precio + "€.";
    }

    public abstract String tocar();
}
