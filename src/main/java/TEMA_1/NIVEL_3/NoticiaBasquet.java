package TEMA_1.NIVEL_3;

public class NoticiaBasquet extends Noticia {

    private String competicion;
    private String club;

    public NoticiaBasquet(String titular, String competicion, String club) {
        super(titular);
        this.competicion = competicion;
        this.club = club;
    }

    public String getCompeticion() {
        return this.competicion;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }

    public String getClub() {
        return this.club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String toString() {
        return "Noticia es de basquet, el titular es " +
                super.getTitular() + " de la competicion " +
                this.competicion + " del club " + this.club;
    }

    public int calcularPrecioNoticia() {

        int precioTotal = 0;
        int precioInicial = 250;
        int precioPorCompeticion = 0;
        int precioPorClub = 0;

        precioPorCompeticion = ((this.competicion.equalsIgnoreCase("Euroleague")) ? 75 : 0);
        precioPorClub = ((this.club.equalsIgnoreCase("Barça")) ||
                (this.club.equalsIgnoreCase("Madrid")) ? 75 : 0);

        precioTotal = precioInicial + precioPorCompeticion + precioPorClub;
        super.setPrecio(precioTotal);

        return precioTotal;
    }

    public int calcularPuntosNoticia() {

        int puntuacionTotal = 0;
        int puntuacionInicial = 4;
        int puntosPorCompeticion = 0;
        int puntosPorClub = 0;

        if (this.competicion.equalsIgnoreCase("Euroleague")) {
            puntosPorCompeticion = 3;
        } else if (this.competicion.equalsIgnoreCase("ACB")) {
            puntosPorCompeticion = 2;
        }

        puntosPorClub = ((this.club.equalsIgnoreCase("Barça")) ||
                (this.club.equalsIgnoreCase("Madrid")) ? 1 : 0);

        puntuacionTotal = puntuacionInicial + puntosPorCompeticion + puntosPorClub;
        super.setPuntuacion(puntuacionTotal);

        return puntuacionTotal;
    }
}