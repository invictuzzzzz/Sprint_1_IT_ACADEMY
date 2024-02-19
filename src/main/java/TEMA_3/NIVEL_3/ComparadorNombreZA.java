package TEMA_3.NIVEL_3;

import java.util.Comparator;

public class ComparadorNombreZA implements Comparator<Persona> {
    @Override
    public int compare(Persona persona1, Persona persona2) {
        int resultado = 0;
        int compDelReves = persona1.getNombre().compareTo(persona2.getNombre());
        if (compDelReves < 0) {
            resultado = 1;
        } else if (compDelReves > 0) {
            resultado = -1;
        }
        return resultado;
    }
}
