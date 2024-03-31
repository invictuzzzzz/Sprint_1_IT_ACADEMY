package PruebaExamen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo implements Runnable {
    Map<String, Cliente> clienteMap = new HashMap<>();
    Map<Integer, Repartidor> repartidorMap = new HashMap<>();
    ArrayList<Pedido> pedidosEnEspera = new ArrayList<>();
    ArrayList<Pedido> pedidosEntregados = new ArrayList<>();


    @Override
    public void run() {
        crearPersonas();
        menu();
    }


    public void menu() {
        int opcion = 0;

        do {

            opcion = Entrada.leerInt(
                    "1) Crear pedido.\n" +
                            "2) Marcar pedido como entregado. \n" +
                            "3) Listar pedidos pendientes. \n" +
                            "4) Listar pedidos entregados.\n" +
                            "0) Salir.\n" +
                            "Elija una opcion del 1 al  4 o 0 para salir");


            switch (opcion) {
                case 1:
                    crearPedido();
                    break;
                case 2:
                    entregarPedido();
                    break;
                case 3:
                    mostrarPedidosEnEspera();
                    break;
                case 4:
                    mostrarPedidosEntregados();
                    break;
                case 0:
                    System.out.println("Adios!");
                default:
                    System.out.println("Invalid option.");
            }

        } while (opcion != 0);
    }

    private void crearPedido() {

        Cliente newCliente = getCliente();
        Repartidor newRepartidor = getRepartidor();
        ArrayList<Products> lista = listaProductos();
        Pedido newPedido = null;
        double total = totalLista(lista);
        try {
            if (newRepartidor != null) {
                System.out.println("Total pedido: " + total + "€.");
                plusTransporte(newRepartidor, total);
                newPedido = new Pedido(newCliente, newRepartidor, lista);
                newRepartidor.takeOrder();
            } else {
                System.out.println("No hay repartidores disponibles. Por favor, inténtelo nuevamente más tarde.");
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }


        if (newPedido != null) {
            pedidosEnEspera.add(newPedido);
            System.out.println("Pedido preparado para entregar!");
        }

    }

    private void mostrarPedidosEntregados() {
        for (Pedido pedidosEntregado : pedidosEntregados) {
            System.out.println(pedidosEntregado);
        }
    }

    private void mostrarPedidosEnEspera() {

        for (Pedido pedido : pedidosEnEspera) {
            System.out.println(pedido);
        }
    }

    private void entregarPedido() {
        if (pedidosEnEspera.isEmpty()) {
            System.out.println("No hay pedidos en espera.");
        } else {
            for (int i = 0; i < pedidosEnEspera.size(); i++) {
                System.out.println(i + 1 + ") " + pedidosEnEspera.get(i));
            }
        }

        int opcion = Entrada.leerInt("Que pedido ha sido entregado?") - 1;
        Pedido pedido = pedidosEnEspera.get(opcion);
        pedidosEntregados.add(pedido);
        pedidosEnEspera.remove(pedido);
        pedido.getRepartidor().orderDelivered();
        System.out.println(pedido + " Marcado como entregado, "
                + pedido.getRepartidor().getName() + " disponible para nueva entrega.");
    }

    private double plusTransporte(Repartidor repartidor, double pago) {

        double pagoExtra = pago;

        int opcion = Entrada.leerInt("Elige el metodo de transporte.\n" +
                "1. En bici.\n" +
                "2. En moto.\n" +
                "3. A pie.");
        switch (opcion) {
            case 1:
                pagoExtra = repartidor.methodBike(pagoExtra);
                break;
            case 2:
                pagoExtra = repartidor.methodMotoBike(pagoExtra);
                break;
            case 3:
                pagoExtra = repartidor.methodWalk(pagoExtra);
                break;
            default:
                System.out.println("Invalid option");
        }
        return pagoExtra;
    }

    private double totalLista(ArrayList<Products> listaProductos) {
        double totalPago = 0;
        for (Products listaProducto : listaProductos) {
            totalPago += listaProducto.getPrice();
        }
        return totalPago;
    }

    private ArrayList<Products> listaProductos() {
        ArrayList<Products> productosSeleccionados = new ArrayList<>();
        for (Products product : Products.values()) {
            System.out.println((product.ordinal() + 1) + ". " + product.name() + " " + product.getPrice() + "€");
        }

        int opcion;
        while ((opcion = Entrada.leerInt("Elija los productos (ingrese el número, 0 para terminar):")) != 0) {
            if (opcion < 1 || opcion > Products.values().length) {
                System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
                continue;
            }
            Products selectedProduct = Products.values()[opcion - 1];
            productosSeleccionados.add(selectedProduct);
            if (selectedProduct.getGift() != null) {
                System.out.println("YOU HAVE A GIFT! " + selectedProduct.getGift());
            }
            System.out.println(selectedProduct.name() + " añadido a la lista.");
        }

        return productosSeleccionados;
    }


    private Cliente getCliente() {

        clienteMap.forEach((nombreCliente, cliente) -> {
            System.out.println("Cliente : " + cliente.getName() + "  " + cliente.getDirection());
        });
        String cliente = Entrada.leerString("\nNombre de cliente que hace el pedido?").toLowerCase();
        return clienteMap.get(cliente);
    }

    private Repartidor getRepartidor() {

        Repartidor repartidor = null;
        boolean todosOcupados = true;
        for (Repartidor rep : repartidorMap.values()) {

            if (!rep.getBusy()) {
                repartidor = rep;
                todosOcupados = false;
                break;
            }
        }

        if (todosOcupados) {
            System.out.println("Todos los repartidores están ocupados ahora mismo.");
        }

        return repartidor;
    }

    private void crearPersonas() {

        Cliente cliente1 = new Cliente("Pepe", "C/Varsovia 73. 3o 3a");
        Cliente cliente2 = new Cliente("Luis", "C/Barcelona 21. 4o C");
        Cliente cliente3 = new Cliente("Maria", "Av. Tividabo 313");
        Cliente cliente4 = new Cliente("Susana", "Debajo del puente ");
        clienteMap.put("pepe", cliente1);
        clienteMap.put("luis", cliente2);
        clienteMap.put("maria", cliente3);
        clienteMap.put("susana", cliente4);

        Repartidor repartidor1 = new Repartidor("Alberto");
        Repartidor repartidor2 = new Repartidor("Antonio");
        Repartidor repartidor3 = new Repartidor("Pablo");
        Repartidor repartidor4 = new Repartidor("Bisbal");

        repartidorMap.put(repartidor1.getId(), repartidor1);
        repartidorMap.put(repartidor2.getId(), repartidor2);
        repartidorMap.put(repartidor3.getId(), repartidor3);
        repartidorMap.put(repartidor4.getId(), repartidor4);
    }
}




