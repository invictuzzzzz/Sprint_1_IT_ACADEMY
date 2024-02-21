package TEMA_2.NIVEL_1;

import TEMA_2.NIVEL_1.Exceptions.ventaVaciaException;

import java.util.ArrayList;

public class Venta {
    private ArrayList<Producto> productos;
    private double total = 0; //Por defecto al crear la venta el total es 0

    public Venta() {
        this.productos = new ArrayList<Producto>();
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<Producto> getProductos() {
        return this.productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);

    }
    public double calcularTotal() throws ventaVaciaException {

        if (productos.isEmpty()) {
            throw new ventaVaciaException();
        } else {
            for (Producto producto : productos) {
                setTotal(getTotal() + producto.getPrecio());
            }
        }
        return this.total;

    }
}
