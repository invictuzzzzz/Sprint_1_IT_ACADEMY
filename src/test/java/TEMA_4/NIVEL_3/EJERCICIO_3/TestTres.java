package TEMA_4.NIVEL_3.EJERCICIO_3;

import TEMA_4.NIVEL_3.Persona;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestTres {


    @Test
    public void testArray() {
        int[] numeros1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] numeros2 = new int[]{1, 2, 3, 4, 5, 6};
        assertThat(numeros1).isEqualTo(numeros2);
    }


}
