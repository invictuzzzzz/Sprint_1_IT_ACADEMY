package TEMA_3.NIVEL_3;

import java.util.Comparator;

public class ComparadorNombreAZ implements Comparator<Persona> {
    @Override
    public int compare(Persona persona1, Persona persona2) {
        return persona1.getNombre().compareTo(persona2.getNombre());
    }
}
