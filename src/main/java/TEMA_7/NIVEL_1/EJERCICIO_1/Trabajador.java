package TEMA_7.NIVEL_1.EJERCICIO_1;

public abstract class Trabajador {
    private String nombre;
    private String apellido;
    private double precioHora;

    public Trabajador(String nombre, String apellido, double precioHora) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.precioHora = precioHora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getPrecioHora() {
        return precioHora;
    }


    public abstract double calcularSueldo(int horasTrabajadas);
}
