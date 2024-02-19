package TEMA_4.NIVEL_3.EJERCICIO_1;

import TEMA_4.NIVEL_3.Persona;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


import java.util.Collections;

public class TestUno {

    Persona persona1 = new Persona("Pepe", 23);
    Persona persona2 = new Persona("Pepe", 23);
    Persona persona3 = new Persona("Jose", 41);
    private Object Persona;

    @Test
    public void mismoObjeto() {
        assertThat(persona1).isEqualTo(persona2);
    }

    @Test
    public void objetoDiferente() {
        assertThat(persona1).isNotEqualTo(persona3);


    }
}
