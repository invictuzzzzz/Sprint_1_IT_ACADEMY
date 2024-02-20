package TEMA_2.NIVEL_3;


import TEMA_2.NIVEL_3.Exceptions.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Cine {
    private int numFilasButacas;
    private int numButacasPorFila;
    private GestionButacas gestionButacas;

    public Cine() { // Constructor que pide los datos iniciales al crear el objeto
        this.gestionButacas = new GestionButacas();
        pedirDatosIniciales();

    }

    public void iniciar() {
        int opcion;

        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    mostrarButacas();
                    break;
                case 2:
                    mostrarButacasPersona();
                    break;
                case 3:
                    reservarButaca();
                    break;
                case 4:
                    anularButaca();
                    break;
                case 5:
                    anularReservaPersona();
                    break;
                case 0:
                    salir();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 0);

    }

    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" +
                "1. Mostrar todas las butacas reservadas.\n" +
                "2. Mostrar todas las butacas reservadas por una persona.\n" +
                "3. Reservar butaca\n" +
                "4. Anular la reserva de una butaca.\n" +
                "5. Anular todas las reservas de una persona.\n" +
                "0. Salir.\n");
        System.out.print("Introduce una opción: ");
        return scanner.nextInt();

    }

    public void mostrarButacas() { // Recorre la lista de butacas y las muestra
        ArrayList<Butaca> butacas = gestionButacas.getButacas();
        if (butacas.isEmpty()) {
            System.out.println("   *** No hay butacas reservadas ***");
        } else {
            System.out.println("Butacas Ocupadas:");
            for (Butaca butaca : butacas) {
                System.out.println(butaca);
            }
        }
        mapaButacas();
    }

    public void mapaButacas() {
        System.out.println("\nMapa de butacas:");

        for (int i = 1; i <= this.numFilasButacas; i++) {
            System.out.println();
            for (int j = 1; j <= this.numButacasPorFila; j++) {
                Butaca butaca = this.gestionButacas.buscarButaca2(i, j);

                if (butaca != null) {
                    System.out.print("[X]"); // Si la butaca está ocupada
                } else {
                    System.out.print("[ ]"); // Si la butaca está libre
                }
            }
        }
        System.out.println();
    }

    public void mapaButacasNombre(String nombrePersona) {

        System.out.println("\nMapa de butacas:\n" +
                "X : Butaca ocupada por " + nombrePersona.toUpperCase() + "\n");

        for (int i = 1; i <= this.numFilasButacas; i++) {
            System.out.println();
            for (int j = 1; j <= this.numButacasPorFila; j++) {
                Butaca butaca = this.gestionButacas.buscarButaca2(i, j);

                if (butaca != null && butaca.getPersona().equalsIgnoreCase(nombrePersona)) {
                    System.out.print("[X]"); // Si la butaca está ocupada por la persona
                } else if (butaca != null) {
                    System.out.print("[·]"); // Si la butaca está ocupada por otra persona
                } else {
                    System.out.print("[ ]"); // Si la butaca está libre
                }
            }
        }
        System.out.println();
    }

    public void mostrarButacasPersona() {
        boolean encontrado;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre de la persona: ");
        String nombre = scanner.nextLine().toUpperCase();
        ArrayList<Butaca> butacas = this.gestionButacas.getButacas();
        encontrado = false;
        for (Butaca butaca : butacas) {
            if (butaca.getPersona().equalsIgnoreCase(nombre)) {
                System.out.println(butaca);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("   *** No hay butacas reservadas a nombre de " + nombre + " ***");
        } else {
            mapaButacasNombre(nombre);
        }
    }

    public void reservarButaca() { // Pide los datos de la butaca y la reserva
        int fila = introducirFila();
        int asiento = introducirAsiento();
        String persona = introducirPersona();
        this.gestionButacas.agregarButaca(new Butaca(fila, asiento, persona));
        System.out.println(" ** Butaca reservada correctamente **");
    }

    public void anularButaca() {

        int fila = introducirFila();
        int asiento = introducirAsiento();
        gestionButacas.eliminarButaca(fila, asiento);
        System.out.println(" ** Butaca anulada correctamente **");
    }

    public void anularReservaPersona() {

        String persona = introducirPersona();
        ArrayList<Butaca> butacas = this.gestionButacas.getButacas();
        boolean personaEliminada = false;

        for (int i = 0; i < butacas.size(); i++) {
            // Recorremos la lista de butacas sin for each buscando la persona
            // para poder eliminar elementos de la lista sin que salte error
            if (butacas.get(i).getPersona().equalsIgnoreCase(persona)) {
                butacas.remove(i);
                i--;
                personaEliminada = true;
            }
        }

        if (personaEliminada) {
            System.out.println(" ** Reservas de " + persona + " anuladas correctamente **");
        } else {
            System.out.println(" ** No hay reservas a nombre de " + persona + " **");
        }
    }

    public String introducirPersona() {

        String nombre;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Introduce el nombre de la persona: ");
            nombre = scanner.nextLine().toUpperCase();
            try {
                if (!nombre.matches(".*[0-9].*")) { // Si el nombre no contiene ningún número
                    System.out.println(" ** Persona introducida correctamente **");
                } else {
                    throw new ExcepcionNombrePersonaIncorrecto();
                }
            } catch (ExcepcionNombrePersonaIncorrecto e) {
                System.out.println(e.getMessage());
            }
        } while (nombre.matches(".*[0-9].*"));
        return nombre;
    }

    public void pedirDatosIniciales() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n ---Bienvenido a la aplicacíon de asientos del cine---\n");
        System.out.print("\nIntroduce el número de filas: ");
        this.numFilasButacas = scanner.nextInt();
        System.out.print("Introduce el número de butacas por fila: ");
        this.numButacasPorFila = scanner.nextInt();
        scanner.nextLine();
    }

    public int introducirFila() {

        int fila = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Introduce el número de fila: ");
            try {
                fila = scanner.nextInt();
                scanner.nextLine();
                // Si el número de fila es menor o igual al número de filas de butacas y mayor o igual que 1
                if (fila <= numFilasButacas && fila >= 1) {
                    System.out.println(" ** Número de fila correcto **");
                } else {
                    throw new ExcepcionFilaIncorrecta();
                }
            } catch (ExcepcionFilaIncorrecta e) {
                System.out.println(e.getMessage());
            }
        } while (fila > numFilasButacas || fila < 1);

        return fila;
    }

    public int introducirAsiento() {

        int asiento = 0;
        boolean asientoCorrecto = false;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Introduce el número de asiento: ");
            try {
                asiento = scanner.nextInt();
                scanner.nextLine();
                // Si el número de asiento es menor o igual al número de butacas por fila y mayor que 1
                if (asiento <= numButacasPorFila && asiento >= 1) {
                    System.out.println(" ** Número de asiento correcto **");
                    asientoCorrecto = true;
                } else {
                    throw new ExcepcionAsientoIncorrecto();
                }
            } catch (ExcepcionAsientoIncorrecto e) {
                System.out.println(e.getMessage());
            }
        } while (!asientoCorrecto);
        return asiento;
    }

    public void salir() {
        System.out.println("Gracias por usar la aplicación");
    }
}
