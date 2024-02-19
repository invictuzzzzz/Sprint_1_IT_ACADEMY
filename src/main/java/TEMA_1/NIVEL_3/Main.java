package TEMA_1.NIVEL_3;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Redactor> redactores = new ArrayList<Redactor>();

    public static void main(String[] args) {

        String mensaje = "";
        int opcion = 0;

        System.out.println("Bienvenido al programa de redaccion de noticias deportivas.");
        do {
            System.out.print(
                    "0. Salir del programa. \n" +
                    "1. Introducir redactor. \n" +
                    "2. Eliminar redactor. \n" +
                    "3. Introducir noticia a un redactor. \n" +
                    "4. Eliminar notica de un redactor. \n" +
                    "5. Mostrar todas las noticias de un redactor. \n" +
                    "6. Calcular puntuacion de la noticia. \n" +
                    "7. Calcular precio de noticia. \n" +
                    "\nIntroduzca la opcion deseada: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            try {
                switch (opcion) {
                    case 1:
                        mensaje = introducirRedactor();
                        break;
                    case 2:
                        mensaje = eliminarRedactor();
                        break;
                    case 3:
                        mensaje = introducirNoticia();
                        break;
                    case 4:
                        mensaje = eliminarNoticiaDelRedactor();
                        break;
                    case 5:
                        mensaje = mostrarNoticiasRedactor();
                        break;
                    case 6:
                        mensaje = calcularPuntosNoticia();
                        break;
                    case 7:
                        mensaje = calcularPrecioNoticia();
                        break;
                }
                System.out.println(mensaje);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while (opcion != 0);
        System.out.println("\n\n**Gracias por usar el programa.**");
    }

    public static String introducirRedactor() {
        boolean dniUnico = false;
        String resultado = "";
        String nombre = "";
        String dni = "";
        System.out.print("\nIntroduzca el nombre del redactor: ");
        nombre = entrada.nextLine().toUpperCase();
        while (!dniUnico) {
            System.out.print("\nIntroduzca el DNI del redactor: ");
            dni = entrada.nextLine().toUpperCase();
            if (busquedaRedactorPorDni(dni) != -1) {
                System.out.println("** Ya existe un redactor con ese DNI.** ");
            } else {
                dniUnico = true;
                // Creamos el redactor
                Redactor redactor = new Redactor(nombre, dni);
                // Añadimos el redactor al arraylist
                redactores.add(redactor);
                resultado = "\nSe ha creado e introducido en el sistema al redactor \n" + redactor.toString() + "\n";
            }
        }
            return resultado;
    }

    public static String eliminarRedactor() {

        String resultado = "";
        String dniBuscado = "";
        String redactorBuscado = "";
        int posArrayRedactor = 0;
        System.out.print("Introduzca el DNI del redactor a eliminar: ");
        dniBuscado = entrada.nextLine();
        posArrayRedactor = busquedaRedactorPorDni(dniBuscado);
        if (posArrayRedactor == -1) {
            resultado = "No se ha encontrado en el sistema, el redactor indicado.";
        } else {
            redactorBuscado = redactores.get(posArrayRedactor).getNombre();
            redactores.remove(posArrayRedactor);
            resultado = "Se ha eliminado al redactor " + redactorBuscado + ", con DNI " + dniBuscado + ", del sistema.";
        }
        return resultado;
    }

    public static String introducirNoticia() {

        String resultado = "";
        String dniBusc = "";
        String nombreRedactor = "";
        String tipo = "";
        String titular = "";
        String competicion = "";
        String club = "";
        String jugador = "";
        String tenista = "";
        String equipo = "";
        int posArrayRedac = 0;
        int opcion = 0;
        System.out.print("Introduzca el DNI del redactor al que añadir la noticia: ");
        dniBusc = entrada.nextLine();
        posArrayRedac = busquedaRedactorPorDni(dniBusc);
        if (posArrayRedac == -1) {
            resultado = "No se ha encontrado en el sistema, el redactor indicado.";
        } else {
            nombreRedactor = redactores.get(posArrayRedac).getNombre().toUpperCase();
            System.out.print("\nQue tipo de noticia quiere añadir al redactor " + nombreRedactor + "\n" +
                    "1. Futbol. \n" +
                    "2. Basquet. \n" +
                    "3. Tenis. \n" +
                    "4. F1. \n" +
                    "5. Moto\n" +
                    "Introduzca la opcion deseada: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Introduzca el titular de la noticia: ");
            titular = entrada.nextLine().toUpperCase();
            switch (opcion) {
                case 1:
                    System.out.print("Introduzca la competicion: ");
                    competicion = entrada.nextLine();
                    System.out.print("Introduzca el club: ");
                    club = entrada.nextLine();
                    System.out.print("Introduzca el jugador: ");
                    jugador = entrada.nextLine();
                    NoticiaFutbol noticiaFutbol = new NoticiaFutbol(titular, competicion, club, jugador);
                    redactores.get(posArrayRedac).getNoticias().add(noticiaFutbol);
                    tipo = "Futbol";
                    break;
                case 2:
                    System.out.print("Introduzca la competicion: ");
                    competicion = entrada.nextLine();
                    System.out.print("Introduzca el club: ");
                    club = entrada.nextLine();
                    NoticiaBasquet noticiaBasquet = new NoticiaBasquet(titular, competicion, club);
                    redactores.get(posArrayRedac).getNoticias().add(noticiaBasquet);
                    tipo = "Basquet";
                    break;
                case 3:
                    System.out.print("Introduzca la competicion: ");
                    competicion = entrada.nextLine();
                    System.out.print("Introduzca el tenista: ");
                    tenista = entrada.nextLine();
                    NoticiaTenis noticiaTenis = new NoticiaTenis(titular, competicion, tenista);
                    redactores.get(posArrayRedac).getNoticias().add(noticiaTenis);
                    tipo = "Tenis";
                    break;
                case 4:
                    System.out.print("Introduzca la escuderia: ");
                    equipo = entrada.nextLine();
                    NoticiaF1 noticiaF1 = new NoticiaF1(titular, equipo);
                    redactores.get(posArrayRedac).getNoticias().add(noticiaF1);
                    tipo = "Formula 1";
                    break;
                case 5:
                    System.out.print("Introduzca el equipo: ");
                    equipo = entrada.nextLine();
                    NoticiaMoto noticiaMoto = new NoticiaMoto(titular, equipo);
                    redactores.get(posArrayRedac).getNoticias().add(noticiaMoto);
                    tipo = "Motociclismo";
                    break;
                default:
                    System.out.println("\n**** ERROR. Esta opción no está disponible. **** \n");
                    break;
            }
            resultado = "Se ha introducido la noticia de " + tipo + " al redactor " +
                    nombreRedactor + " con DNI " + dniBusc + "\n";
        }
        return resultado;
    }

    public static String eliminarNoticiaDelRedactor() {
        String resultado = "";
        String dniBusc = "";
        String titularElegido = "";
        Redactor redactorEncontrado;
        int posArrayRedactor = 0;
        int posArrayNoticia = 0;
        System.out.print("Introduzca el DNI del redactor al que eliminar la noticia: ");
        dniBusc = entrada.nextLine();

        posArrayRedactor = busquedaRedactorPorDni(dniBusc);
        if (posArrayRedactor < 0) {
            resultado = "\nNo se ha encontrado en el sistema, el redactor indicado.\n";
            return resultado;
        }

        redactorEncontrado = redactores.get(posArrayRedactor);
        if (redactorEncontrado.getNoticias().isEmpty()) {
            resultado = "\nEl redactor indicado no tiene noticias introducidas.\n";
            return resultado;
        }

        for (Noticia noticia : redactorEncontrado.getNoticias()) {
            System.out.println(noticia.getTitular());
            System.out.print("De los siguientes titulares, indique el que quiere borrar: ");
        }

        titularElegido = entrada.nextLine();
        posArrayNoticia = redactorEncontrado.buscarNoticiasRedactor(titularElegido);
        if (posArrayNoticia == -1) {
            resultado = "Ese titular no figura entre las noticias del redactor " + redactorEncontrado;
            return resultado;
        }

        redactorEncontrado.getNoticias().remove(posArrayNoticia);
        resultado = "Se ha eliminado la noticia " + titularElegido + " del redactor " + redactorEncontrado;


        return resultado;
    }

    public static String mostrarNoticiasRedactor() {

        String resultado = "";
        String dniBusc = "";
        Redactor redactorElegido;

        System.out.print("Introduzca el DNI del redactor del que quiere ver las noticias: ");
        dniBusc = entrada.nextLine();
        redactorElegido = buscarRedactor(dniBusc);
        if (redactorElegido != null) {
            if (redactorElegido.getNoticias().isEmpty()) {
                resultado = "El redactor indicado no tiene noticias introducidas.";
            } else {
                for (Noticia noticia : redactorElegido.getNoticias()) {
                    resultado += noticia.toString();
                }
            }
        } else {
            resultado = "\n ** No se ha encontrado en el sistema, el redactor indicado. ** \n";
        }
        return resultado;
    }

    public static String calcularPuntosNoticia() {

        String resultado = "";
        String dniBusc = "";
        String titularElegido = "";
        Redactor redactorElegido;
        Noticia noticiaElegida;
        int posArrayRedactor = 0;
        int posArrayNoticia = 0;
        int puntos = 0;
        System.out.print("Introduzca el DNI del redactor del que quiere calcular la noticia: ");
        dniBusc = entrada.nextLine();
        posArrayRedactor = busquedaRedactorPorDni(dniBusc);
        if (posArrayRedactor == -1) {
            resultado = "No se ha encontrado en el sistema, el redactor indicado.";
        } else {
            redactorElegido = redactores.get(posArrayRedactor);
            if (redactorElegido.getNoticias().size() == 0) {
                resultado = "El redactor indicado no tiene noticias actualmente.";
            } else {
                for (Noticia noticia : redactorElegido.getNoticias()) {
                    System.out.println(noticia.getTitular());
                }
                System.out.print(
                        "De las siguientes noticias de " + redactorElegido.getNombre() + "." +
                                "\nIndique el titular de la que quiere saber la puntuación: ");
                titularElegido = entrada.nextLine().toUpperCase();
                posArrayNoticia = redactorElegido.buscarNoticiasRedactor(titularElegido);
                if (posArrayNoticia == -1) {
                    resultado = "Ese titular no figura entre las noticias del redactor " + redactorElegido;
                } else {
                    noticiaElegida = redactorElegido.getNoticias().get(posArrayNoticia);
                    puntos = noticiaElegida.calcularPuntosNoticia();
                    resultado = "La puntuación de la noticia " + titularElegido + " es " + puntos + " puntos.";
                }
            }
        }
        return resultado;
    }

    public static String calcularPrecioNoticia() {

        String resultado = "";
        String dniBusc = "";
        String titularElegido = "";
        Redactor redactorElegido;
        Noticia noticiaElegida;
        int posArrayRedactor = 0;
        int posArrayNoticia = 0;
        int precio = 0;
        System.out.print("Introduzca el DNI del redactor del que quiere calcular la noticia: ");
        dniBusc = entrada.nextLine();
        posArrayRedactor = busquedaRedactorPorDni(dniBusc);
        if (posArrayRedactor == -1) {
            resultado = "\n** No se ha encontrado en el sistema, el redactor indicado.** ";
        } else {
            redactorElegido = redactores.get(posArrayRedactor);
            if (redactorElegido.getNoticias().size() == 0) {
                resultado = "El redactor indicado no tiene noticias introducidas.";
            } else {
                for (Noticia noticia : redactorElegido.getNoticias()) {
                    System.out.println(noticia.getTitular());
                }
                System.out.print("De las siguientes noticias del redactor." +
                        "\nIndique el titular de la que quiere saber el precio: ");

                titularElegido = entrada.nextLine().toUpperCase();
                posArrayNoticia = redactorElegido.buscarNoticiasRedactor(titularElegido);
                if (posArrayNoticia == -1) {
                    resultado = "\n ** Ese titular no figura entre las noticias del redactor **" + redactorElegido;
                } else {
                    noticiaElegida = redactorElegido.getNoticias().get(posArrayNoticia);
                    precio = noticiaElegida.calcularPrecioNoticia();
                    resultado = "El precio de la noticia " + titularElegido + " es " + precio + " euros.";
                }
            }
        }
        return resultado;
    }

    public static int busquedaRedactorPorDni(String dni) {
        // Pasamos el dni y buscamos en el arraylist de redactores
        // Si lo encontramos, devolvemos la posicion en el arraylist
        int arrayPosicion = -1;
        if (!redactores.isEmpty()) {
            for (Redactor redactor : redactores) {
                if (dni.equalsIgnoreCase(redactor.getDni())) {
                    arrayPosicion = redactores.indexOf(redactor);
                }
            }
        }
        return arrayPosicion;
    }

    public static Redactor buscarRedactor(String dni) {
        // Pasamos el dni y buscamos en el arraylist de redactores
        // Si lo encontramos, lo devolvemos (el objeto redactor)

        Redactor RedactorEncontrado = null;
        if (!redactores.isEmpty()) {
            for (Redactor redactor : redactores) {
                if (dni.equalsIgnoreCase(redactor.getDni())) {
                    RedactorEncontrado = redactor;
                }
            }
        }
        return RedactorEncontrado;
    }
}