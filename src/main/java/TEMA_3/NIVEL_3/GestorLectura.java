package TEMA_3.NIVEL_3;
import java.io.*;
import java.util.TreeSet;

public class GestorLectura {

    // Attributes

    // Constructor

    public GestorLectura() {
    };

    // Metodos generales
    // Metodo LECTURA de archivo csv y escritura en TreeSet<Persona>

    public TreeSet<Persona> fileToTreeSet(String inputFilePath) {
        TreeSet<Persona> listaPersonasDNIasc = new TreeSet<>();

        try (BufferedReader bufferR = new BufferedReader(new FileReader(new File(inputFilePath)))) {
            String line;
            while ((line = bufferR.readLine()) != null) {
                String[] partes = line.split(",");
                String nombre = partes[0].trim();
                String apellidos = partes[1].trim();
                String dni = partes[2].trim();
                Persona persona = new Persona(nombre, apellidos, dni);
                listaPersonasDNIasc.add(persona);
            }
        } catch (IOException e) {
            System.out.println("Error al leer o procesar el archivo: " + e.getMessage());
        }

        return listaPersonasDNIasc;
    }
}