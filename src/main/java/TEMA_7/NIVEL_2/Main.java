package TEMA_7.NIVEL_2;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

    serializarObjetoAJson();

    }



    public static void serializarObjetoAJson(){

        ObjectMapper mapper = new ObjectMapper();
        Trabajador trabajador = new Trabajador("Dani", "Diaz", 14);
        try {
            mapper.writeValue(new File("trabajador.json"),trabajador);
            System.out.println("Se ha creado el archivo trabajador.json correctamente.");
        } catch (IOException e) {
            System.out.println("ERROR!. " + e.getMessage());
        }
    }

}
