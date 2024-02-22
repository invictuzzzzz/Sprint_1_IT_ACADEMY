package TEMA_7.NIVEL_1.EJERCICIO_2;


public class TrabajadorPresencial extends Trabajador {
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

    @Deprecated
    public void metodoObsoleto() {
        System.out.println("Esto es un metodo obsoleto.");
    }

    @Override @Deprecated
    public double dietasTrabajador(int diasTrabajados, double precioMenu) {
        double plusDietas = diasTrabajados * precioMenu;
        return plusDietas;
    }

}
