package TEMA_1.NIVEL_1.ej1;

public class InstrumentoViento extends Instrumento {
    public InstrumentoViento(String nombre, int precio) {
        super(nombre, precio);
    }

    @Override
    public String tocar() {
        return "Se está tocando un instrumento de viento. ";
    }
}
