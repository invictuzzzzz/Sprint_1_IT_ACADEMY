package TEMA_2.NIVEL_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Producto> productos = new ArrayList<Producto>();
    static ArrayList<Venta> ventas = new ArrayList<Venta>();

    public static void main(String[] args) {
        Venta nuevaVenta = new Venta();
        int opcion = 0;


        do {

            System.out.println("" +
                    "1. Crear producto.\n" +
                    "2. Añadirlo a la venta.\n" +
                    "3. Calcular total de la venta.\n" +
                    "4. Generar excepción ArrayIndexOutOfBoundsException.\n" +
                    "5. Salir de la aplicación.");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    crearProducto();
                    break;
                case 2:
                    introducirVenta(nuevaVenta);
                    break;
                case 3:
                    try {
                        nuevaVenta.calcularTotal();
                    } catch (ventaVaciaException e) {
                        System.out.println(e);
                    }
                    break;
                case 4:
                    try {
                        int[] numeros = new int[5];
                        int num2 = numeros[10];
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println(e);
                    }
                case 5:
                    System.out.println("Adios!");
            }
        } while (opcion != 5);
    }

    public static void crearProducto() {

        System.out.println("Como se llama el producto: ");
        String producto = entrada.nextLine();
        System.out.println("Cuanto cuesta el producto: ");
        double precio = entrada.nextDouble();
        Producto nuevoProducto = new Producto(producto, precio);
        productos.add(nuevoProducto);
    }

    public static void introducirVenta(Venta nuevaVenta) {
        Producto productoElegido = null;
        System.out.println("Que desea añadir a la venta?: ");

        if (productos.isEmpty()) {
            System.out.println("No hay productos que agregar.");
        } else {
            int contador = 1;
            for (Producto producto : productos) {
                System.out.println(contador + ". " + producto.getNombre());
            }
            int eleccionProducto = entrada.nextInt() - 1;
            entrada.nextLine();
            productoElegido = productos.get(eleccionProducto);
            nuevaVenta.agregarProducto(productoElegido);
        }
    }

}
