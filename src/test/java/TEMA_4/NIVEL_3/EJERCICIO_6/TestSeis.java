package TEMA_4.NIVEL_3.EJERCICIO_6;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.Test;

public class TestSeis {

    int[] lista = {6,2,5,86}; //Array de 4 posiciones de 0 a 3;

    @Test
    public void ExceptionTest() {
        assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class).isThrownBy(new ThrowingCallable() {
            @Override
            public void call() throws Throwable {
                lista[4] = 52;
                //lanza la excepcion al intentar darle valor a un indice del array que no existe.
            }
        }
        );
    }

}
