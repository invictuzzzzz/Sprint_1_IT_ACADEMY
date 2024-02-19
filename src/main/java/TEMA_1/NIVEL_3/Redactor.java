package TEMA_1.NIVEL_3;

import java.util.ArrayList;


public class Redactor {

    private String nombre;
    private final String dni;
    private static int sueldo;
    private ArrayList<Noticia> noticias;


    public Redactor(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        sueldo = 1500;
        this.noticias = new ArrayList<Noticia>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getSueldo() {
        return  sueldo;
    }

    public static void setSueldo(int sueldo) {
        Redactor.sueldo = sueldo;
    }

    public ArrayList<Noticia> getNoticias() {
        return this.noticias;
    }

    public void setNoticias(ArrayList<Noticia> noticias) {
        this.noticias = noticias;
    }

    public String getDni() {
        return this.dni;
    }

    public int buscarNoticiasRedactor(String titular) {

        int posicionArray = -1;
        boolean stop = false;
        if (!this.getNoticias().isEmpty()) {
            for (int i = 0; i < this.getNoticias().size() && !stop; i++) {
                if (this.getNoticias().get(i).getTitular().equalsIgnoreCase(titular)) {
                    stop = true;
                    posicionArray = i;
                }
            }
        }
        return posicionArray;
    }

    @Override
    public String toString() {
        return "Redactor " + nombre + " con dni: " + dni + "\n" +
                "Tiene un sueldo de: " + sueldo + ".\n" +
                "Noticias = " + noticias;
    }
}