package TEMA_4.NIVEL_1.EJERCICIO_3;

import org.junit.Test;

public class ClasePruebaTest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    //indicamos expected para indicarle que se espera que lance la excepción ArrayIndexOutOfBoundsException
    public void testThrowsArrayIndexOut() {
        ClasePrueba.arrayIndexException();
    }
}
