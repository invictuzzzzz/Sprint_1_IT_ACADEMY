package TEMA_6.NIVEL_2.EJERCICIO_2;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }
    public String getFullName() {
        return this.nombre + " " + this.apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    @Override
    public String toString() {
        return "Me llamo " + getFullName() + " y tengo " + getEdad() + " años.";
    }
}
