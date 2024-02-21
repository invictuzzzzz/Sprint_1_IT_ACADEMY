package TEMA_6.NIVEL_1.EJERCICIO_1;

public class Coche {
    private String marca;
    private String modelo;
    private int potencia;

    public Coche(String marca, String modelo, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getPotencia() {
        return this.potencia;
    }

}
