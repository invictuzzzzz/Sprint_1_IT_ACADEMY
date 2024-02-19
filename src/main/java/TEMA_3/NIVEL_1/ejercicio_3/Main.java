package TEMA_3.NIVEL_1.ejercicio_3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Donat el fitxer countrties.txt (revisa l'apartat recursos)
 * que conté països i capitals. El programa ha de llegir el fitxer
 * i guardar les dades en un HashMap<String, String>.
 * El programa demana el nom de l’usuari/ària, i després ha de mostrar
 * un país de forma aleatòria, guardat en el HashMap.
 * Es tracta de què l’usuari/ària ha d’escriure el nom de la capital del país en qüestió.
 * Si l’encerta se li suma un punt. Aquesta acció es repeteix 10 vegades.
 * Un cop demanades les capitals de 10 països de forma aleatòria,
 * llavors s’ha de guardar en un fitxer anomenat classificacio.txt,
 * el nom de l’usuari/ària i la seva puntuació.
 */

public class Main {
    public static void main(String[] args) {

        String rutaArchivoCountries = "Sprint1_S3/src/NIVEL_1/ejercicio_3/countries.txt";
        String rutaArchivoClasificacion = "Sprint1_S3/src/NIVEL_1/ejercicio_3/clasificacion.txt";
        GestorLectura gestorLectura = new GestorLectura(rutaArchivoCountries);
        GestorEscritura gestorEscritura = new GestorEscritura(rutaArchivoClasificacion);
        Scanner entrada = new Scanner(System.in);
        Jugador nuevoJugador = new Jugador();

        int contador = 0;
        final int INTENTOS = 10;


        do {

            try {
                gestorLectura.leerArchivo();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            String paisAPreguntar = gestorLectura.generarPaisRandom();
            System.out.print(contador + 1 + ". Capital de " + paisAPreguntar + ": ");
            String capitalRespuesta = entrada.nextLine();
            String capitalCorrecta = gestorLectura.getPaisesCapitalMapa().get(paisAPreguntar);
            if (capitalRespuesta.equalsIgnoreCase(capitalCorrecta)) {
                nuevoJugador.sumarPuntos();
            }
            contador++;

        } while (contador < INTENTOS);

        try {
            gestorEscritura.escribirArchivo(nuevoJugador);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

