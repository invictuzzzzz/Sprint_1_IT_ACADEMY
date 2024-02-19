package TEMA_1.NIVEL_3;



public class NoticiaMoto extends Noticia {

    private String equipo;

    public NoticiaMoto(String titular, String equipo) {
        super(titular);
        this.equipo = equipo;
    }


    public String getEquipo() {
        return this.equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }


    public String toString() {
        return "Noticia de motociclismo, el titular es " + super.getTitular().toUpperCase() + " del equipo " + this.equipo;
    }

    public int calcularPrecioNoticia() {

        int precioTotal = 0;
        int precioInicial = 100;
        int precioPorEquipo = 0;

        precioPorEquipo = ((this.equipo.equalsIgnoreCase("Honda")) ||
                (this.equipo.equalsIgnoreCase("Yamaha")) ? 50 : 0);
        precioTotal = precioInicial + precioPorEquipo;
        super.setPrecio(precioTotal);

        return precioTotal;
    }

    public int calcularPuntosNoticia() {

        int puntuacionTotal = 0;
        int puntuacionInicial = 3;
        int puntosPorEquipo = 0;

        puntosPorEquipo = ((this.equipo.equalsIgnoreCase("Honda")) ||
                (this.equipo.equalsIgnoreCase("Yamaha")) ? 3 : 0);

        puntuacionTotal = puntuacionInicial + puntosPorEquipo;
        super.setPuntuacion(puntuacionTotal);

        return puntuacionTotal;
    }

}