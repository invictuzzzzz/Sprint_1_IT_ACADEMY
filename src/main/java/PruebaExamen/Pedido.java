package PruebaExamen;

import java.util.ArrayList;

public class Pedido {

    private int id;
    private static int idPlus = 1;
    Cliente cliente;
    ArrayList<Products> listaPedido;
    Repartidor repartidor;

    public Pedido(Cliente cliente,Repartidor repartidor, ArrayList<Products> listaPedido) {
        this.id = idPlus++;
        this.cliente = cliente;
        this.repartidor = repartidor;
        this.listaPedido = listaPedido;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Products> getListaPedido() {
        return listaPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    @Override
    public String toString() {
        return "ID PEDIDO: " + this.id + " con Cliente: " + this.cliente.getName()
                + " y repartidor " + repartidor.getName() + ". Entrega en "
                + this.cliente.getDirection();
    }
}
