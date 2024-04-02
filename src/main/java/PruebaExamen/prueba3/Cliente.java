package PruebaExamen.prueba3;

public class Cliente {

    private String nombre;
    private String direccion;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }


    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Cliente: " + getNombre() + " con direccion en : " + getDireccion();
    }
}
