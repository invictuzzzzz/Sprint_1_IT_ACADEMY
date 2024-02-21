package TEMA_5.NIVEL_1;

import TEMA_3.NIVEL_3.Persona;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String pathDirectorio = "src/main/java";
        String pathFicheroTxt = "src/main/java/TEMA_5/NIVEL_1/listadoDirectorio.txt";
        String directorioNivel = "src/main/java/TEMA_5/NIVEL_1";
        int nivelProfundidad = 0;


        String listadoAGuardar = GestorArchivos.listarAlfabeticamente(pathDirectorio, nivelProfundidad);
        String mensaje = GestorEscritura.guardarListadoEnTxt(pathFicheroTxt, listadoAGuardar);
        String mensajeLectura = GestorLectura.leerFicheroTxt(pathFicheroTxt);

        System.out.println(mensaje);
        // System.out.println(mensajeLectura);A partir del ejercicio 3. Ya no se imprime en pantalla.

        ///Ejercicio 5
          // Serializar un Objeto y luego Desserializarlo.

        ObjectoSerializable persona = new ObjectoSerializable("Dani", 35);
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(directorioNivel + "/persona.ser"))) {
            out.writeObject(persona);
            System.out.println("Objeto serializado con exíto.");
        } catch (IOException e) {
            System.out.println("Error en la serialización. " + e.getMessage());
        }

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(directorioNivel + "/persona.ser"))) {
            persona = (ObjectoSerializable) in.readObject();
            System.out.println("Objeto desserializado con exito.");
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
