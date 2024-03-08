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

        if (!file.exists()) {
            return "Ruta del directorio no encontrada. ";
        }

        File[] archivos = obtenerArchivosOrdenados(file);

        String indexaccion = obtenerIndexaccion(nivel);
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

        for (File archivo : archivos) {
            String tipo = obtenerTipo(archivo);
            String fechaModificacion = obtenerFechaModificacion(archivo, fecha);

            if (archivo.isDirectory()) {
                mensaje += obtenerMensajeDirectorio(archivo, nivel, tipo, indexaccion);
                mensaje += listarAlfabeticamente(archivo.getPath(), nivel + 1);
            } else {
                mensaje += obtenerMensajeArchivo(archivo.getName(), tipo, indexaccion, fechaModificacion);
            }
        }
        return mensaje;
    }

    private static File[] obtenerArchivosOrdenados(File directorio) {
        File[] archivos = directorio.listFiles();
        Arrays.sort(archivos, new Comparator<File>() {
            @Override
            public int compare(File file1, File file2) {
                return file1.getName().compareTo(file2.getName());
            }
        });
        return archivos;
    }

    private static String obtenerIndexaccion(int nivel) {
        String indexaccion = "";
        for (int i = 0; i < nivel; i++) {
            indexaccion += " ";
        }
        return indexaccion;
    }

    private static String obtenerTipo(File archivo) {
        return archivo.isDirectory() ? "(D)" : "(F)";
    }

    private static String obtenerFechaModificacion(File archivo, SimpleDateFormat formatoFecha) {
        return " \t " + formatoFecha.format(new Date(archivo.lastModified()));
    }

    private static String obtenerMensajeDirectorio(File archivo, int nivel, String tipo, String indexaccion) {
        return nivel == 0 ? "\n*" + tipo + archivo.getName() + ":\n" :
                "__" + tipo + indexaccion + archivo.getName() + ":\n";
    }

    private static String obtenerMensajeArchivo(String nombreArchivo, String tipo, String indexaccion, String fechaModificacion) {
        return indexaccion + tipo + indexaccion + nombreArchivo + fechaModificacion + "\n";
    }
}
