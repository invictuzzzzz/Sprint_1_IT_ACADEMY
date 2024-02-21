package TEMA_3.NIVEL_1.ejercicio_3;

import TEMA_3.NIVEL_3.Persona;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class GestorLectura {
    private String path;
    private HashMap<String, String> paisesCapitalMapa;

    public GestorLectura(String path) {
        this.path = path;
        this.paisesCapitalMapa = new HashMap<>();
    }

    public HashMap<String, String> getPaisesCapitalMapa() {
        return this.paisesCapitalMapa;
    }

    public HashMap<String, String> leerArchivo() throws FileNotFoundException {
        File paisesFile = new File(this.path);
        Scanner myReader = new Scanner(paisesFile);
        while (myReader.hasNextLine()) {
            String linea = myReader.nextLine();
            rellenarHashMap(linea);
        }
        myReader.close();
        return paisesCapitalMapa;
    }

    public void rellenarHashMap(String linea) {
        String[] partes = linea.split(" ");
        if (partes.length < 2) {
            return;
        }
        String pais = partes[0];
        String capital = partes[1];
        paisesCapitalMapa.put(pais, capital);
    }

    public List<String> obtenerPaises() {
        List<String> paises = new ArrayList<>();
        for (String pais : paisesCapitalMapa.keySet()) {
            paises.add(pais);
        }
        return paises;
    }

    public String generarPaisRandom() {
        List<String> paises = obtenerPaises();
        Random r = new Random();
        int numRandom = r.nextInt(paises.size());
        return paises.get(numRandom);
    }

}
