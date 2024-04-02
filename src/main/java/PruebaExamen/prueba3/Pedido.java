package PruebaExamen.prueba3;

import java.util.List;

public class Pedido {
    private int id;
    private static int idPlus = 1;
    private Cliente cliente;
    private Repartidor repartidor;
    private List<Producto> listaPedido;


    public Pedido(Cliente cliente, Repartidor repartidor, List<Producto> listaPedido) {
        this.id = idPlus++;
        this.cliente = cliente;
        this.repartidor = repartidor;
        this.listaPedido = listaPedido;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public List<Producto> getListaPedido() {
        return listaPedido;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + " con cliente + " + this.cliente.getNombre() + " con direccion en " + this.cliente.getDireccion();
    }
}
