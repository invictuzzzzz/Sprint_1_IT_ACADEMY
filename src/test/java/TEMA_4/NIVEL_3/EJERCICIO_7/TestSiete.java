package TEMA_4.NIVEL_3.EJERCICIO_7;

import TEMA_4.NIVEL_3.ArrayListTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

public class TestSiete {

    Optional<Integer> objetoTest = Optional.empty();

    @Test
    public void objetoOpcionalVacio() {
        assertThat(objetoTest).isEmpty();
    }
}
