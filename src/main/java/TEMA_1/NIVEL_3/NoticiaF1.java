package TEMA_1.NIVEL_3;



public class NoticiaF1 extends Noticia {

    private String equipo;

    public NoticiaF1(String titular, String equipo) {
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
        return "Noticia de tenis, el titular es " + super.getTitular() + " del equipo " + this.equipo;
    }

    public int calcularPrecioNoticia() {

        int precioTotal = 0;
        int precioInicial = 100;
        int precioPorEquipo = 0;

        precioPorEquipo = ((this.equipo.equalsIgnoreCase("Ferrari")) ||
                (this.equipo.equalsIgnoreCase("Mercedes")) ? 50 : 0);

        precioTotal = precioInicial + precioPorEquipo;
        super.setPrecio(precioTotal);

        return precioTotal;
    }

    public int calcularPuntosNoticia() {

        int puntuacionTotal = 0;
        int puntuacionInicial = 4;
        int puntosPorEquipo = 0;

        puntosPorEquipo = ((this.equipo.equalsIgnoreCase("Ferrari")) ||
                (this.equipo.equalsIgnoreCase("Mercedes")) ? 2 : 0);

        puntuacionTotal = puntuacionInicial + puntosPorEquipo;
        super.setPuntuacion(puntuacionTotal);

        return puntuacionTotal;
    }
}