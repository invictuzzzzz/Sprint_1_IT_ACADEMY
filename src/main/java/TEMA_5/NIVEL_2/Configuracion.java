package TEMA_5.NIVEL_2;

import java.io.*;
import java.util.Properties;

public class Configuracion {
    static final String RUTA = "src/main/java/TEMA_5/NIVEL_2/config.properties";

    public static Properties crearConfigParam() {
        Properties properties = new Properties();

        try (OutputStream salida = new FileOutputStream(RUTA)) {

            properties.setProperty("pathDirectorio", "src/main/java");
            properties.setProperty("pathFicheroTxt", "src/main/java/TEMA_5/NIVEL_2/listadoDirectorio.txt");
            properties.setProperty("nivel", "0");
            properties.store(salida, "Properties: ");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error. " + e.getMessage() );
        }


        try (InputStream lectura = new FileInputStream(RUTA)) {
            properties.load(lectura);
        } catch (IOException e) {
            System.out.println("Error." + e.getMessage());
        }
        return properties;
    }
}
