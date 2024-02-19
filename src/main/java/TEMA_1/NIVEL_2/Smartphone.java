package TEMA_1.NIVEL_2;

public class Smartphone extends Telefono implements Reloj, Camara {

    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public String fotografiar() {
        return "Se está haciendo una foto.";
    }

    @Override
    public String alarma() {
        return "Está sonando la alarma";
    }
}
