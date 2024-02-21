package TEMA_5.NIVEL_2;

import java.io.*;

public class GestorEscritura {


    public static String guardarListadoEnTxt(String path, String texto) {
        String mensaje = "";
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileWriter writer = new FileWriter(file);
                 BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
                bufferedWriter.write(texto);
            } catch (IOException e) {
                e.printStackTrace();
                mensaje = "Error al escribir la linea.";
            }
            mensaje = "Listado guardado en el archivo: " + file.getName();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return mensaje;
    }
}
