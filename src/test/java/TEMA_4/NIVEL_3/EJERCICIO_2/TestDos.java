package TEMA_4.NIVEL_3.EJERCICIO_2;

import TEMA_4.NIVEL_3.Persona;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestDos {
    Persona persona1 = new Persona("Pepe", 23);
    Persona persona2 = new Persona("Pepe", 23);
    Persona persona3 = new Persona("Jose", 41);


    @Test
    public void mismaReferencia() {
        assertThat(persona1).isSameAs(persona1);
    }
    @Test
    public void referenciaDistinta() {
        assertThat(persona1).isNotSameAs(persona2);
    }

}
