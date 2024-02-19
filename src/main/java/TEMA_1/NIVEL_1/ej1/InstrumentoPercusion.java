package TEMA_1.NIVEL_1.ej1;

public class InstrumentoPercusion extends Instrumento {
    public InstrumentoPercusion(String nombre, int precio) {
        super(nombre, precio);
    }

    @Override
    public String tocar() {
        return "Se está tocando un instrumento de Percusion";
    }
}
