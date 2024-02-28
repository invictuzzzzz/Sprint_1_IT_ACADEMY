package TEMA_6.NIVEL_3;

public class Smartphone implements Telefono {
    private String marca;
    private String modelo;

    public Smartphone(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void hacerFotos() {
        System.out.println("Se está haciendo una foto!");
    }

    @Override
    public void llamar(String numeroTelefono) {
        System.out.println("Se está llamando al numero de telefono.." + numeroTelefono);
    }

}
