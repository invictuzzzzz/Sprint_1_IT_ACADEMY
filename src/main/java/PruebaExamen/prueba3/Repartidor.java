package PruebaExamen.prueba3;

public class Repartidor implements MetodoTransporte{

    private String name;
    private boolean ocupado;

    public Repartidor(String name) {
        this.name = name;
        this.ocupado = false;
    }

    public String getName() {
        return name;
    }
    public boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void pedidoAsignado() {
        setOcupado(true);
    }

    public void pedidoEntregado() {
        setOcupado(false);
    }
    @Override
    public double metodoBici(double precio) {
        double nuevoPrecio = precio * 1.01;
        System.out.println("Repartidor en bici! Precio aumentado un 1%. Precio actual: " + nuevoPrecio);
        return nuevoPrecio;
    }

    @Override
    public double metodoMoto(double precio) {
        double nuevoPrecio = precio * 1.02;
        System.out.println("Repartidor en moto! Precio aumentado un 2%. Precio actual: " + nuevoPrecio);
        return nuevoPrecio;
    }

    @Override
    public void metodoAPie() {
        System.out.println("Repartidor andando! Precio sin modificar, pero llegará 15minutos más tarde.");
    }
}
