package PruebaExamen;

public class Repartidor implements TransportMethod {

    private int id;
    private static int idPlus = 1;
    private String name;
    private Boolean busy;

    public Repartidor(String name) {
        this.id = idPlus++;
        this.name = name;
        this.busy = false;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Boolean getBusy() {
        return busy;
    }

    public void setBusy(Boolean busy) {
        this.busy = busy;
    }

    public void takeOrder() {
        setBusy(true);
    }

    public void orderDelivered() {
        setBusy(false);
    }

    @Override
    public double methodBike(double total) {
        double nuevoPrecio = total * 1.01;
        System.out.println("Repartidor en bici! Se añade un 1% al valor total. PRECIO: " + nuevoPrecio);
        //1%
        return nuevoPrecio;
    }

    @Override
    public double methodMotoBike(double total) {
        double nuevoPrecio = total * 1.02;
        System.out.println("Repartidor en moto! Se añade un 2% al valor total. PRECIO: " + nuevoPrecio);
        //1%
        return nuevoPrecio;
    }


    @Override
    public double methodWalk(double total) {
        System.out.println("Repartidor andando! Sin plus en el pedido");
        return total;
    }
}
