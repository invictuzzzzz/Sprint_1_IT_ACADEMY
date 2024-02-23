package TEMA_7.NIVEL_3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Path.of;

public class Main {
    public static void main(String[] args) {

    serializarObjetoAJson();

    }



    public static void serializarObjetoAJson(){

        ObjectMapper mapper = new ObjectMapper();
        Trabajador trabajador = new Trabajador("Dani", "Diaz", 14);
        Trabajador trabajador2 = new Trabajador("Pepe", "Garcia", 14);
        Path path = of(trabajador.getClass().getAnnotation(JsonSerializable.class).path());
        Path path2 = of(trabajador2.getClass().getAnnotation(JsonSerializable.class).path());
        try {
            mapper.writeValue(new File(String.valueOf(path)),trabajador);
            System.out.println("Se ha creado el archivo trabajador.json correctamente.");
        } catch (IOException e) {
            System.out.println("ERROR!. " + e.getMessage());
        }
    }

}
