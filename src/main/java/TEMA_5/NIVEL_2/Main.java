package TEMA_5.NIVEL_2;

import java.util.Properties;


public class Main {
    public static void main(String[] args) {

        Properties properties = Configuracion.crearConfigParam();

        Integer nivelProfundidad = Integer.valueOf(properties.getProperty("nivel"));
        String pathDirectorio = properties.getProperty("pathDirectorio");
        String pathFicheroTxt = properties.getProperty("pathFicheroTxt");
        String texto = GestorArchivos.listarAlfabeticamente(pathDirectorio, nivelProfundidad);
        String mensaje = GestorEscritura.guardarListadoEnTxt(pathFicheroTxt, texto);
        GestorLectura.leerFicheroTxt(pathFicheroTxt);

        System.out.println(mensaje);
    }
}
