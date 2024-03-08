package TEMA_3.NIVEL_3;

import java.io.*;
import java.util.TreeSet;

public class GestorEscritura {

    public GestorEscritura() {
    }

    public String TreeSetToCSV(String outputFilePath, TreeSet<Persona> listaPersonas) {
        String mensaje = "";

        File file = new File(outputFilePath);
        try (FileWriter writer = new FileWriter(file);
             BufferedWriter bufferW = new BufferedWriter(writer)) {

            for (Persona persona : listaPersonas) {
                bufferW.write(persona.getNombre() + "," + persona.getApellidos()
                        + "," + persona.getDni() + "\n");
            }

            mensaje = "Lista de personas guardada en archivo CSV " + file.getName();

        } catch (IOException e) {
            e.printStackTrace();
            mensaje = "Error al guardar el archivo CSV";
        }

        return mensaje;
    }
}