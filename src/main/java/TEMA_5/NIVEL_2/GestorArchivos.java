package TEMA_5.NIVEL_2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class GestorArchivos {

    public static String listarAlfabeticamente(String pathFile, int nivel) {
        File file = new File(pathFile);
        String mensaje = "";

        if (!(file.exists())) {
            return "Ruta del directorio no encontrada. ";
        }

        File[] archivos = file.listFiles();
        Arrays.sort(archivos, new Comparator<File>() {
            @Override
            public int compare(File file1, File file2) {
                return file1.getName().compareTo(file2.getName());
            }
        });

        String indexaccion = "";
        for (int i = 0; i < nivel; i++) {
            indexaccion += " ";
        }

        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

        for (File archivo : archivos) {
            String tipo = archivo.isDirectory() ? "(D)" : "(F):";

            String fechaModificacion = "Ultima modificación: "
                    + fecha.format(new Date(archivo.lastModified()));

            if (archivo.isDirectory()) {
                //cada vez que encuentra un directorio, llama de nuevo a la función
                //sumando 1 nivel de profundidad y recorre las subcarpetas o archivos.
                if (nivel == 0) {
                    mensaje += "\n*" + tipo + archivo.getName() + ":\n";
                } else {
                    mensaje += "__"+ tipo + indexaccion + archivo.getName() + ":\n";
                }
                mensaje += listarAlfabeticamente(archivo.getPath(), nivel + 1);

            } else {
                mensaje += indexaccion + tipo + indexaccion + archivo.getName() +
                        " \t " + fechaModificacion + "\n";
            }
        }
        return mensaje;
    }
}

