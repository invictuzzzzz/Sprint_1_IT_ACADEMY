package TEMA_4.NIVEL_3.EJERCICIO_5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class TestCinco {
    @Test
    public void verificarMap() {

        Map<Integer, String> mapaTest = new HashMap<>();
        mapaTest.put(1,"Jose");
        mapaTest.put(2,"Pepe");
        mapaTest.put(3,"Maria");
        mapaTest.put(4,"Luis");
        assertThat(mapaTest).containsKeys(1);
    }


}
