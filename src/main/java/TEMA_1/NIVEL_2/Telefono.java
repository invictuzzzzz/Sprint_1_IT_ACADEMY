package TEMA_1.NIVEL_2;

public abstract class Telefono {
    private String marca;
    private String modelo;

    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getMarca() {
        return this.marca;
    }
    public String llamar(String numTelefono) {
        return "Se está llamando por telefono al número " + numTelefono;
    }
}
