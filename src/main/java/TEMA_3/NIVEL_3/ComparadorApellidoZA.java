package TEMA_3.NIVEL_3;

import java.util.Comparator;

public class ComparadorApellidoZA implements Comparator<Persona> {

    @Override
    public int compare(Persona persona1, Persona persona2) {

        int resultado = 0;
        int compAlReves = persona1.getApellidos().compareTo(persona2.getApellidos());
        if (compAlReves < 0) {
            resultado = 1;
        } else if (compAlReves > 0) {
            resultado = -1;
        }
        return resultado;
    }
}
