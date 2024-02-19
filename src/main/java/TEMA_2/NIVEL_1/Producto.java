package TEMA_2.NIVEL_1;

public class Producto {
    private String nombre;
    private double precio;

    public Producto(){

    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " con un precio de : " + this.precio + "€.";
    }
}
