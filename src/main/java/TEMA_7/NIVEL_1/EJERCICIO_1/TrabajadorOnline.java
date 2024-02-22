package TEMA_7.NIVEL_1.EJERCICIO_1;

public class TrabajadorOnline extends Trabajador{
    private final int TARIFA_INTERNET = 50;
    public TrabajadorOnline(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);
    }

    @Override
    public double calcularSueldo(int horasTrabajadas) {
       double sueldo = (horasTrabajadas * getPrecioHora()) + TARIFA_INTERNET;

        return sueldo;
    }
}
