package TEMA_4.NIVEL_3.EJERCICIO_4;

import TEMA_4.NIVEL_3.ArrayListTest;
import TEMA_4.NIVEL_3.Persona;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class TestCuatro {

    ArrayListTest listTest = new ArrayListTest();
    ArrayList<Object> listaTest2 = listTest.generarArrayList();

    Object object1 = listaTest2.get(0);
    Object object2 = listaTest2.get(1);
    Object object3 = listaTest2.get(2);
    Object object4 = "Luisito";
    Object object5 = listaTest2.get(3);
    Object object6 = listaTest2.get(4);

    @Test
    public void testOrder() {
        assertThat(listaTest2).containsExactly(object1, object2, object3);
    }

    @Test
    public void testAnyOrder() {
        assertThat(listaTest2).containsExactlyInAnyOrder(object3, object1, object2);
    }

    @Test
    public void testUnaVez() {
        assertThat(listaTest2).containsOnlyOnce(object1);
    }

    @Test
    public void noIncluido() {
        assertThat(listaTest2).doesNotContain(object4);
    }
}
