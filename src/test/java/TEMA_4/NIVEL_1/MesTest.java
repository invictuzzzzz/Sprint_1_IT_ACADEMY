package TEMA_4.NIVEL_1;

import TEMA_4.NIVEL_1.EJERCICIO_1.MesManager;
import TEMA_4.NIVEL_1.EJERCICIO_1.Meses;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MesTest {
    static ArrayList<Meses> listaMesesTest = new ArrayList<>();

    //comprobacion que la lista tiene 12 meses
    @Test
    public void testCapacidadLista(){
        listaMesesTest = MesManager.crearMeses();
        int resultado = listaMesesTest.size();
        int resultadoEsperado = 12;
        assertEquals(resultadoEsperado, resultado, "Deben haber 12 meses");
    }

    //comprobacion de que la lista no es nula
    @Test
    public void testListaNoNula() {
        listaMesesTest = MesManager.crearMeses();
        assertEquals(false, listaMesesTest.isEmpty());
    }

    @Test
    public void testMesPosicionCorrecta() {
        listaMesesTest = MesManager.crearMeses();
        String nombreObtenido = listaMesesTest.get(7).getNombreMes();
        String nombreEsperado = "Agosto";
        assertEquals(nombreEsperado, nombreObtenido, "El mes debe ser Agosto");
    }
}
