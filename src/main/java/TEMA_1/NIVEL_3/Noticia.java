package TEMA_1.NIVEL_3;

public abstract class Noticia {

    private String titular;
    private String texto;
    private int puntuacion;
    private int precio;

    public Noticia(String titular) {
        this.titular = titular;
        this.texto = "";
        this.puntuacion = 0;
        this.precio = 0;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getPuntuacion() {
        return this.puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    // Generals

    public abstract int calcularPrecioNoticia();

    public abstract int calcularPuntosNoticia();

    public String toString() {
        return " La noticia tiene el titular " + this.titular;
    }
}