package TEMA_5.NIVEL_1;

import java.io.Serializable;

public class ObjectoSerializable implements Serializable {
    private String nombre;
    private int edad;


    public ObjectoSerializable(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    @Override
    public String toString() {
        return "Soy un objeto serializable con nombre " + getNombre() + " con " +
                "una edad de : " + getEdad();
    }
}
