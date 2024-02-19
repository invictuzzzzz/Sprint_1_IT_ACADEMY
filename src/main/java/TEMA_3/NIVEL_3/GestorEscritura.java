package TEMA_3.NIVEL_3;

import java.io.*;
import java.util.TreeSet;

public class GestorEscritura {

    public GestorEscritura() {}

    public String TreeSetToCSV(String outputFilePath, TreeSet<Persona> listaPersonas)
            throws IOException, FileNotFoundException {

        String mensaje = "";

        try {
            File file = new File(outputFilePath);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferW = new BufferedWriter(writer);
            for (Persona persona : listaPersonas) {
                try {
                    bufferW.write(persona.getNombre() + "," + persona.getApellidos() + "," + persona.getDni() + "\n");
                } catch (IOException e) {
                    System.out.println("Error al escribir la linea");
                }
                mensaje = "Lista de personas guardada en archivo CSV " + file.getName();
            }
            bufferW.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return mensaje;
    }
}