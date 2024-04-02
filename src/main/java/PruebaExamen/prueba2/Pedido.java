package PruebaExamen.prueba2;

import PruebaExamen.Products;

import java.util.List;

public class Pedido {

    private int id;
    private static int idPlus = 1;
    private Cliente cliente;
    private List<Products2> products2List;
    Repartidor repartidor;

    public Pedido(Cliente cliente, Repartidor repartidor, List<Products2> products2List) {

        this.id = idPlus++;
        this.cliente = cliente;
        this.repartidor = repartidor;
        this.products2List = products2List;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Products2> getProducts2List() {
        return products2List;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " Cliente: " + this.cliente + " con direccion en: " + this.cliente.getDireccion();
    }
}

