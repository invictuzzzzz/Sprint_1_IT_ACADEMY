package TEMA_5.NIVEL_1;

import java.io.*;

public class GestorLectura {

    public static String leerFicheroTxt(String path) {
        String mensaje = "";
        FileReader reader = null;
        BufferedReader bufferedReader = null;


        try {
            reader = new FileReader(path);
            bufferedReader = new BufferedReader(reader);
            String linea;

            //mientras la linea leida no sea null..
            while ((linea = bufferedReader.readLine()) != null) {
                mensaje += linea + ("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return mensaje;
    }
}
