package TEMA_4.NIVEL_3;

public class Coche {
    private String marca;
    private int potencia;

    public Coche(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getPotencia() {
        return this.potencia;
    }
}
