package TEMA_1.NIVEL_3;

public class NoticiaFutbol extends Noticia {

    private String competicion;
    private String club;
    private String jugador;


    public NoticiaFutbol(String titular, String competicion, String club, String jugador) {
        super(titular);
        this.competicion = competicion;
        this.club = club;
        this.jugador = jugador;
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

    public String getJugador() {
        return this.jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    // Generals
    public String toString() {
        return "Noticia de futbol, el titular es " + super.getTitular() +
                " de la competicion " + this.competicion + " del club " +
                this.club + " del jugador " + this.jugador;
    }

    public int calcularPrecioNoticia() {

        int precioTotal = 0;
        int precioInicial = 300;
        int precioPorCompeticion = 0;
        int precioPorClub = 0;
        int precioPorJugador = 0;

        precioPorCompeticion = ((this.competicion.equalsIgnoreCase("champions league")) ? 100 : 0);
        precioPorClub = ((this.club.equalsIgnoreCase("Barça")) ||
                (this.club.equalsIgnoreCase("Madrid")) ? 100 : 0);
        precioPorJugador = ((this.jugador.equalsIgnoreCase("Ferran Torres")) ||
                (this.jugador.equalsIgnoreCase("Benzema")) ? 50 : 0);
        precioTotal = precioInicial + precioPorCompeticion + precioPorClub + precioPorJugador;
        super.setPrecio(precioTotal);

        return precioTotal;
    }

    public int calcularPuntosNoticia() {

        int puntuacionTotal = 0;
        int puntuacionInicial = 5;
        int puntosPorCompeticion = 0;
        int puntosPorClub = 0;
        int puntosPorJugador = 0;

        if (this.competicion.equalsIgnoreCase("champions league")) {
            puntosPorCompeticion = 3;
        } else if (this.competicion.equalsIgnoreCase("la liga")) {
            puntosPorCompeticion = 2;
        }
        puntosPorClub = ((this.club.equalsIgnoreCase("Barça")) ||
                (this.club.equalsIgnoreCase("Madrid")) ? 1 : 0);
        puntosPorJugador = ((this.jugador.equalsIgnoreCase("Ferran Torres")) ||
                (this.jugador.equalsIgnoreCase("Benzema")) ? 1 : 0);

        puntuacionTotal = puntuacionInicial + puntosPorCompeticion + puntosPorClub + puntosPorJugador;
        super.setPuntuacion(puntuacionTotal);

        return puntuacionTotal;
    }
}