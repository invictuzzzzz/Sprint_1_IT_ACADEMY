package PruebaExamen.prueba3;

public class RepartidorNoDisponible extends Exception {
    public RepartidorNoDisponible(){
        super("No hay repartidores disponibles en este momento.");
    }
}
