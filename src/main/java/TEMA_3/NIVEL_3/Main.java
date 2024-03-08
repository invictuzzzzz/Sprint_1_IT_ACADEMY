package TEMA_3.NIVEL_3;

import java.io.IOException;
import java.util.*;

public class Main {

    static Scanner entrada = new Scanner(System.in);
    static TreeSet<Persona> ListaPersonasTS = new TreeSet<Persona>();
    static GestorLectura gestorLectura = new GestorLectura();
    static GestorEscritura gestorEscritura = new GestorEscritura();

    public static void main(String[] args) {


        int opcion = 0;
        String mensaje = "";

        // Lectura de fichero CSV y conversion a TreeSet
        String inputFilePath = "src/main/java/TEMA_3/NIVEL_3/personas.csv";

        guardarEnTreeSet(inputFilePath);
        ArrayList<Persona> ListaPersonasAL = new ArrayList<Persona>(ListaPersonasTS);


        do {
            System.out.println("Bienvenido al gestor de personal. \n"
                    + "Indique la opcion que quiere realizar: \n"
                    + "0. Salir de la aplicacion. \n"
                    + "1. Introducir persona \n"
                    + "2. Mostrar personas ordenadas por nombre (A-Z) \n"
                    + "3. Mostrar personas ordenadas por nombre (Z-A) \n"
                    + "4. Mostrar personas ordenadas por apellido (A-Z) \n"
                    + "5. Mostrar personas ordenadas por apellido (Z-A) \n"
                    + "6. Mostrar personas ordenadas por DNI (1-9) \n"
                    + "7. Mostrar personas ordenadas por DNI (9-1)");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 0:
                    mensaje = "Adios";
                    break;
                case 1:
                    mensaje = introducirPersona(ListaPersonasTS);
                    ListaPersonasAL = new ArrayList<Persona>(ListaPersonasTS);
                    break;
                case 2:
                    mensaje = mostrarPorNombreAZ(ListaPersonasAL);
                    break;
                case 3:
                    mensaje = mostrarPorNombreZA(ListaPersonasAL);
                    break;
                case 4:
                    mensaje = mostrarPorApellidoAZ(ListaPersonasAL);
                    break;
                case 5:
                    mensaje = mostrarPorApellidoZA(ListaPersonasAL);
                    break;
                case 6:
                    mensaje = mostrarPorDniAscendete(ListaPersonasTS);
                    break;
                case 7:
                    mensaje = mostrarPorDniDescendiente(ListaPersonasTS);
                    break;
                default:
                    mensaje = "Esta opcion no esta disponible";
            }
            System.out.println(mensaje);
        } while (opcion != 0);

        // Escritura de TreeSet a archivo CSV
        String outputFilePath = "src/main/java/TEMA_3/NIVEL_3/personas.csv";
        mensaje = gestorEscritura.TreeSetToCSV(outputFilePath, ListaPersonasTS);
        System.out.println(mensaje);
    }

    // Methods
    public static String introducirPersona(TreeSet<Persona> ListaPersonasTS) {
        String resultado = "", nombre = "", apellidos = "", dni = "";

        System.out.println("Indique el nombre de la persona");
        nombre = entrada.nextLine();
        System.out.println("Indique los apellidos de la persona");
        apellidos = entrada.nextLine();
        System.out.println("Indique el DNI de la persona");
        dni = entrada.nextLine().toUpperCase();
        Persona persona = new Persona(nombre, apellidos, dni);
        if (ListaPersonasTS.contains(persona)) {
            resultado = "No se puede introducir la persona. Este DNI ya figura en el listado de la aplicación.";
        } else {
            ListaPersonasTS.add(persona); // La TreeSet no anadira las personas con DNI iguales
            resultado = persona.toString() + " ha sido introducida en el listado de la aplicacion";
        }
        return resultado;
    }

    public static String mostrarPorNombreAZ(ArrayList<Persona> ListaPersonasAL) {
        String resultado = "";
        Collections.sort(ListaPersonasAL, new ComparadorNombreAZ());
        for (Persona persona : ListaPersonasAL)
            resultado += persona.toString() + "\n";
        return resultado;
    }

    public static String mostrarPorNombreZA(ArrayList<Persona> ListaPersonasAL) {
        String resultado = "";
        Collections.sort(ListaPersonasAL, new ComparadorNombreZA());
        for (Persona persona : ListaPersonasAL)
            resultado += persona.toString() + "\n";
        return resultado;
    }

    public static String mostrarPorApellidoAZ(ArrayList<Persona> ListaPersonasAL) {
        String resultado = "";
        Collections.sort(ListaPersonasAL, new ComparadorApellidoAZ());
        for (Persona persona : ListaPersonasAL)
            resultado += persona.toString() + "\n";
        return resultado;
    }

    public static String mostrarPorApellidoZA(ArrayList<Persona> ListaPersonasAL) {
        String resultado = "";
        Collections.sort(ListaPersonasAL, new ComparadorApellidoZA());
        for (Persona persona : ListaPersonasAL)
            resultado += persona.toString() + "\n";
        return resultado;
    }

    public static String mostrarPorDniAscendete(TreeSet<Persona> ListaPersonas) {
        String resultado = "";
        for (Persona persona : ListaPersonas)
            resultado += persona.toString() + "\n";
        return resultado;
    }

    public static String mostrarPorDniDescendiente(TreeSet<Persona> ListaPersonas) {
        String resultado = "";
        Iterator<Persona> iteradorDescendiente = ListaPersonas.descendingIterator();
        while (iteradorDescendiente.hasNext()) {
            resultado += iteradorDescendiente.next().toString() + "\n";
        }
        return resultado;
    }

    public static void guardarEnTreeSet(String inputFilePath) {

        ListaPersonasTS = gestorLectura.fileToTreeSet(inputFilePath);
    }
}
