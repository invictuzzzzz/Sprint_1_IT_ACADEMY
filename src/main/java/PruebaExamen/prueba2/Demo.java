package PruebaExamen.prueba2;


import PruebaExamen.Products;

import java.util.ArrayList;
import java.util.List;

public class Demo implements Runnable {

    List<Repartidor> listaRepartidores = new ArrayList<>();

    ArrayList<Pedido> pedidosEntregados = new ArrayList<>();
    ArrayList<Pedido> pedidosPorEntregar = new ArrayList<>();

    @Override
    public void run() {
        addDeliverys();
        menu();

    }


    public void menu() {
        int opcion;
        do {
            System.out.println("1 para crear un nuevo pedido.");
            System.out.println("2 para marcar pedido como entregado");
            System.out.println("3 para ver todos los pedidos pendientes de entrega.");
            System.out.println("4 para ver todos los pedidos entregados.");
            System.out.println("0 para salir");
            opcion = Entrada.leerInt("");

            switch (opcion) {
                case 1:
                    try {
                        nuevoPedido();
                    } catch (RepartidoresOcupados e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    marcarPedidoEntregado();
                    break;
                case 3:
                    verPedidosPorEntregar();
                    break;
                case 4:
                    verPedidosEntregados();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion inválida.");
                    break;
            }
        } while (opcion != 0);
    }


    private void marcarPedidoEntregado() {
        verPedidosPorEntregar();
        int opcion = Entrada.leerInt("Escribe el ID del pedido.");
        for (Pedido pedido : pedidosPorEntregar) {
            if (opcion == pedido.getId()) {
                pedido.getRepartidor().orderDelivered();
                pedidosPorEntregar.remove(pedido);
                pedidosEntregados.add(pedido);
                break;
            }
        }
        System.out.println("Opcion invalida.");
    }

    private void verPedidosPorEntregar() {
        if (!(pedidosPorEntregar.isEmpty())) {
            for (Pedido pedido : pedidosPorEntregar) {
                System.out.println(pedido);
            }
        } else {
            System.out.println("No hay ningún pedido pendiente de entrega.");
        }
    }

    private void verPedidosEntregados() {
        if (!(pedidosEntregados.isEmpty())) {
            for (Pedido pedidosEntregado : pedidosEntregados) {
                System.out.println(pedidosEntregado);
            }
        } else {
            System.out.println("No hay ningun pedido entregado actualmente.");
        }
    }

    private List<Products2> addProducts() {

        List<Products2> listaPedido = new ArrayList<>();
        for (Products2 products2 : Products2.values()) {
            System.out.println((products2.ordinal() + 1) + ". " + products2.name() + " " + products2.getPrice() + "€.");
        }
        int opcion;
        while ((opcion = Entrada.leerInt("Elija los productos. 0 para salir: ")) != 0) {
            if (opcion < 1 || opcion > Products2.values().length) {
                System.out.println("Opcion inválida. Por favor, selecciona nuevamente");
                continue;
            }
            Products2 productoSeleccionado = Products2.values()[opcion - 1];
            listaPedido.add(productoSeleccionado);
            if (productoSeleccionado.getGift() != null) {
                System.out.println("Tienes un regalo! " + productoSeleccionado.getGift());
            }
        }
        return listaPedido;

    }

    private void nuevoPedido() throws RepartidoresOcupados {

        Cliente cliente = nuevoCliente();
        Repartidor repartidor = repartidorLibre();
        repartidor.takeOrder();
        List<Products2> list = addProducts();
        Pedido nuevoPedido = new Pedido(cliente, repartidor, list);
        pedidosPorEntregar.add(nuevoPedido);
        System.out.println("Pedido creado, Elija metodo de entraga.");
        double precio = precioTotal(list);
        metodoEntrega(repartidor, precio);

    }

    private double precioTotal(List<Products2> lista) {

        double precio = 0;
        for (Products2 productos : lista) {
            precio += productos.getPrice();
        }
        return precio;
    }


    private void metodoEntrega(Repartidor repartidor, double precio) {
        int opcion;
        do {
            opcion = Entrada.leerByte("Seleccione el método de entrega:\n1 para Bici.\n2 para Moto.\n3 para A pie.\n");
        } while (opcion < 1 || opcion > 3);

        switch (opcion) {
            case 1:
                repartidor.enBici(precio);
                break;
            case 2:
                repartidor.enMoto(precio);
                break;
            case 3:
                repartidor.aPie();
        }
    }

    private Cliente nuevoCliente() {
        String nombre = Entrada.leerString("Indique su nombre: ");
        String direccion = Entrada.leerString("Indique su dirección: ");
        Cliente nuevoCliente = new Cliente(nombre, direccion);
        return nuevoCliente;
    }

    private Repartidor repartidorLibre() throws RepartidoresOcupados {
        Repartidor repartidorLibre = null;
        for (Repartidor repartidor : listaRepartidores) {
            if (!repartidor.getBusy()) {
                repartidorLibre = repartidor;
                break;
            }
        }
        if (repartidorLibre == null) {
            throw new RepartidoresOcupados();
        }
        return repartidorLibre;
    }



    private void addDeliverys() {
        Repartidor repartidor1 = new Repartidor("Alberto");
        Repartidor repartidor2 = new Repartidor("Luis");
        Repartidor repartidor3 = new Repartidor("Antonio");
        Repartidor repartidor4 = new Repartidor("Juan");
        Repartidor repartidor5 = new Repartidor("Pepe");
        listaRepartidores.addAll(List.of(repartidor1, repartidor2, repartidor3, repartidor4, repartidor5));
    }
}
