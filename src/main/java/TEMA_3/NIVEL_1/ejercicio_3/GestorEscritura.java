package TEMA_3.NIVEL_1.ejercicio_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GestorEscritura {

    private String path;

    public GestorEscritura(String path) {
        this.path = path;
    }

  public void escribirArchivo(Jugador jugador) throws IOException {
      String clasificacionFile = this.path;
      BufferedWriter br = new BufferedWriter(new FileWriter(clasificacionFile));


      try {
          Files.write(Paths.get(clasificacionFile), ("Nombre jugador: " + jugador.getNombre() +
                  " con una puntuación de " + jugador.getPuntuacion() +
                  " puntos en total.\n").getBytes(), StandardOpenOption.APPEND);
          System.out.println("Archivo clasificacion escrito correctamente.");
      } catch (
              IOException e) {
          System.out.println("Ha ocurrido un error.");
      }
  }

}
