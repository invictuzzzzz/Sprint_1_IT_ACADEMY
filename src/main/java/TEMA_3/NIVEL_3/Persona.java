package TEMA_3.NIVEL_3;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private String apellidos;
    private String dni;


    public Persona(){

    }
    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getDni() {
        return this.dni;
    }

    @Override
    public String toString() {
        return getNombre() + " " + getApellidos()
                + " con DNI: " + getDni();
    }

    @Override
    public int compareTo(Persona persona) {
        int comparacionDNI = this.getDni().compareTo(persona.getDni());
        return comparacionDNI;
    }

}
