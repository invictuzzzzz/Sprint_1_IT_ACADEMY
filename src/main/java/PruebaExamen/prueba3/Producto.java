package PruebaExamen.prueba3;

public enum Producto {

    BURRITO(6.5 , "Pin"),
    HAMBURGUESA(8.9, "Gorra"),
    KEBAB(4.5, null),
    PIZZA(7.9, null);


    private double precio;
    private String regalo;
    Producto(double precio, String regalo) {
        this.precio = precio;
        this.regalo = regalo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getRegalo() {
        return regalo;
    }

    @Override
    public String toString() {
        return name() + " con un precio de " + getPrecio();
    }
}
