package TEMA_7.NIVEL_1.EJERCICIO_1;

public class TrabajadorPresencial extends Trabajador{
    private static double gasolina;
    public TrabajadorPresencial(String nombre, String apellido, double precioHora, double gasolina) {
        super(nombre, apellido, precioHora);
        TrabajadorPresencial.gasolina = gasolina;
    }

    @Override
    public double calcularSueldo(int horasTrabajadas) {
        double sueldo = (horasTrabajadas * getPrecioHora()) + gasolina;
        return sueldo;
    }
}
