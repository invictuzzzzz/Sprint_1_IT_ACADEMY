package PruebaExamen.prueba2;

public class Repartidor implements MetodoTransporte {

    private int id;
    private static int idPlus = 1;
    private String nombre;
    private boolean busy;

    public Repartidor(String nombre) {
        this.id = idPlus++;
        this.nombre = nombre;
        this.busy = false;
    }

    public int getId() {
        return id;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Boolean getBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public void takeOrder() {
        setBusy(true);
    }
    public void orderDelivered() {
        setBusy(false);
    }


    @Override
    public Double enBici(double price) {
        double newPrice = price * 1.01;
        System.out.println("Pedido en bici! Se añade un 1% al total. Ahora són " + newPrice);
        return newPrice;
    }

    @Override
    public Double enMoto(double price) {
        double newPrice = price * 1.02;
        System.out.println("Pedido en moto! Se añade un 2% al total. Ahora són " + newPrice);
        return newPrice;
    }

    @Override
    public void aPie() {
        System.out.println("Pedio a pie! Tardará más pero no tiene coste.");
    }


}
