package PruebaExamen.prueba3;

import java.util.ArrayList;
import java.util.List;

public class Demo implements Runnable {


    List<Producto> pedidoCliente = new ArrayList<>();
    List<Repartidor> listaRepartidores = new ArrayList<>();
    ArrayList<Pedido> pedidosEntregados = new ArrayList<>();
    ArrayList<Pedido> pedidosPorEntregar = new ArrayList<>();

    @Override
    public void run() {
        addRepartidores();
        showMenu();
    }

    private void showMenu() {
        int opcion = 0;
        do {
            opcion = Entrada.leerIntConRango("" +
                    "1. Crear nuevo pedido.\n" +
                    "2. Marcar pedido como entregado.\n" +
                    "3. Ver todos los pedidos por entregar.\n" +
                    "4. Ver todos los pedidos entregados.\n" +
                    "0. Salir de la aplicacion.", 4);

            switch (opcion) {
                case 1:
                    try {
                        nuevoPedido();
                    } catch (RepartidorNoDisponible e) {
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
                    System.out.println("Hasta luego!");
            }
        } while (opcion != 0);


    }
    private void marcarPedidoEntregado() {
        if (pedidosPorEntregar.isEmpty()) {
            System.out.println("No se puede marcar ningun pedido porque no hay ningun pendiente.");
        } else {
            verPedidosPorEntregar();
            int opcion = Entrada.leerInt("Escriba el ID del pedido.");
            for (Pedido pedido : pedidosPorEntregar) {
                if (opcion == pedido.getId()) {
                    pedidosEntregados.add(pedido);
                    pedidosPorEntregar.remove(pedido);
                    pedido.getRepartidor().pedidoEntregado();
                } else {
                    System.out.println("No se han encontrado coincidencias.");
                }
            }
        }
    }

    private void verPedidosPorEntregar() {
        if (!(pedidosPorEntregar.isEmpty())) {
            for (Pedido pedido : pedidosPorEntregar) {
                System.out.println(pedido);
            }
        }
    }
    private void verPedidosEntregados() {
        if (!(pedidosEntregados.isEmpty())) {
            for (Pedido pedidosEntregado : pedidosEntregados) {
                System.out.println(pedidosEntregado);
            }
        } else {
            System.out.println("No hay pedidos entregados actualmente.");
        }
    }


    private void nuevoPedido() throws RepartidorNoDisponible {
        Cliente cliente = nuevoCliente();
        Repartidor repartidor = repartidorDisponible();
        List<Producto> listaCliente = listaPedidoCliente();
        Pedido nuevoPedido = new Pedido(cliente, repartidor, listaCliente);
        System.out.println("Pedido creado con exíto");
        repartidor.pedidoAsignado();
        pedidosPorEntregar.add(nuevoPedido);
        double pago = pagoPedido(listaCliente);
        metodoTransporte(pago, repartidor);
    }

    private double pagoPedido(List<Producto> listaCliente) {
        double precioTotal = 0;
        for (Producto producto : listaCliente) {
            precioTotal += producto.getPrecio();
        }
        return precioTotal;
    }

    private void metodoTransporte(double precio, Repartidor repartidor) {
        int opcion = Entrada.leerIntConRango("Indique del 1 al 3 metodo de transporte.\n" +
                "1. Bici.\n" +
                "2. Moto.\n" +
                "3. A pie.", 3);
        switch (opcion) {
            case 1:
                repartidor.metodoBici(precio);
                break;
            case 2:
                repartidor.metodoMoto(precio);
                break;
            case 3:
                repartidor.metodoAPie();
                break;
        }
    }

    private List<Producto> listaPedidoCliente() {
        List<Producto> listaPedidoCliente = new ArrayList<>();
        for (Producto producto : Producto.values()) {
            System.out.println((producto.ordinal() + 1) + " ." + producto.name() + "  " + producto.getPrecio() + "€.");
        }
        int opcion;
        while ((opcion = Entrada.leerIntConRango("Elija los productos. 0 para salir: ", Producto.values().length)) != 0) {
            Producto productoSeleccionado = Producto.values()[opcion - 1];
            listaPedidoCliente.add(productoSeleccionado);
            if (productoSeleccionado.getRegalo() != null) {
                System.out.println("Tienes un regalo con la compra de " + productoSeleccionado.name() + ", " + productoSeleccionado.getRegalo());
            }
        }
        return listaPedidoCliente;
    }

    private Cliente nuevoCliente() {
        String nombre = Entrada.leerStringSinNumeros("Por favor, indique su nombre");
        String direccion = Entrada.leerString("Por favor, indique su dirección.");
        Cliente nuevoCliente = new Cliente(nombre, direccion);
        return nuevoCliente;
    }


    private Repartidor repartidorDisponible() throws RepartidorNoDisponible {
        for (Repartidor repartidor : listaRepartidores) {
            if (!repartidor.getOcupado()) {
                return repartidor;
            }
        }
        throw new RepartidorNoDisponible();
    }

    private void addRepartidores() {
        Repartidor repartidor1 = new Repartidor("Alberto");
        Repartidor repartidor2 = new Repartidor("Pepe");
        Repartidor repartidor3 = new Repartidor("Jose");

        listaRepartidores.addAll(List.of(repartidor1, repartidor2, repartidor3));
    }
}
