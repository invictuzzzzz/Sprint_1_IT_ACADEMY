package TEMA_3.NIVEL_1.ejercicio_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GestorEscritura {

    private String path;

    public GestorEscritura(String path) {
        this.path = path;
    }

    public void escribirArchivo(Jugador jugador) {
        String clasificacionFile = this.path;

        try (BufferedWriter br = new BufferedWriter
                (new FileWriter(clasificacionFile, true))) {

            br.write("Nombre jugador: " + jugador.getNombre() +
                    " con una puntuación de " + jugador.getPuntuacion() +
                    " puntos en total.\n");
            System.out.println("Datos del jugador agregados correctamente al archivo.");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}
