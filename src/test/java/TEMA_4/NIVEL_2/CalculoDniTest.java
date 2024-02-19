package TEMA_4.NIVEL_2;

import TEMA_4.NIVEL_1.EJERCICIO_2.CalculoDni;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoDniTest {

    //Parametrizada significa que se ejecutará con multiples conjuntos de datos
    @ParameterizedTest
    //proporciona los datos para la prueba, donde cada entrada " " está separada por una coma.
    //dando como dato el numero por un lado y la letra por el otro.
    @CsvSource({"12345678, Z", "23458646, A", "56732578, L", "98345636, M",
            "43256358, M", "47662410, Q", "43446623, Z"})

    public void dniCorrecto(int numDni, char letra) {
        char letraEsperada = CalculoDni.calculoLetraDni(numDni);
        assertEquals(letraEsperada, letra);
    }
}
