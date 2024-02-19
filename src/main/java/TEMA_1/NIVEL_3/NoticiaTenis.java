package TEMA_1.NIVEL_3;



public class NoticiaTenis extends Noticia {

    private String competicion;
    private String tenista;


    public NoticiaTenis(String titular, String competicion, String tenista) {
        super(titular);
        this.competicion = competicion;
        this.tenista = tenista;
    }

    public String getCompeticion() {
        return this.competicion;
    }

    public void setCompeticion(String competicion) {
        this.competicion = competicion;
    }

    public String getTenista() {
        return this.tenista;
    }

    public void setTenista(String tenista) {
        this.tenista = tenista;
    }

    public String toString() {
        return "Noticia de Tenis, el titular es " + super.getTitular() +
                " de la competicion " + this.competicion + " del tenista " + this.tenista;
    }

    public int calcularPrecioNoticia() {

        int precioTotal = 0;
        int precioInicial = 150;
        int precioPorTenista = 0;

        precioPorTenista = ((this.tenista.equalsIgnoreCase("Federer")) ||
                (this.tenista.equalsIgnoreCase("Nadal")) ||
                (this.tenista.equalsIgnoreCase("Djokovic")) ? 100 : 0);
        precioTotal = precioInicial + precioPorTenista;
        super.setPrecio(precioTotal);

        return precioTotal;
    }

    public int calcularPuntosNoticia() {

        int puntuacionTotal = 0;
        int puntuacionInicial = 4;
        int puntosPorTenista = 0;

        puntosPorTenista = ((this.tenista.equalsIgnoreCase("Federer")) ||
                (this.tenista.equalsIgnoreCase("Nadal")) ||
                (this.tenista.equalsIgnoreCase("Djokovic")) ? 3 : 0);

        puntuacionTotal = puntuacionInicial + puntosPorTenista;
        super.setPrecio(puntuacionTotal);

        return puntuacionTotal;
    }
}