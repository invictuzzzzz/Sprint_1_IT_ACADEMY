package TEMA_2.NIVEL_3;

import TEMA_2.NIVEL_3.Exceptions.ExcepcionButacaLibre;
import TEMA_2.NIVEL_3.Exceptions.ExcepcionButacaOcupada;

import java.util.ArrayList;

public class GestionButacas {

    private ArrayList<Butaca> butacas;

    public GestionButacas() {
        this.butacas = new ArrayList<Butaca>();
    }

    public ArrayList<Butaca> getButacas() {
        return this.butacas;
    }

    public void agregarButaca(Butaca butaca) {

        try {
            // -1 significa que no se ha encontrado la butaca
            if (buscarButaca(butaca.getFila(), butaca.getAsiento()) == -1) {
                this.butacas.add(butaca);
            } else {
                throw new ExcepcionButacaOcupada();
            }
        } catch (ExcepcionButacaOcupada e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarButaca(int numFila, int numAsiento) {
        Butaca butaca = buscarButaca2(numFila, numAsiento);
        if (butaca != null) {
            this.butacas.remove(butaca);
        } else {
            try {
                throw new ExcepcionButacaLibre();
            } catch (ExcepcionButacaLibre e) {
                throw new RuntimeException(e);
            }
        }
    }

    public int buscarButaca(int numFila, int numAsiento) {

        int posicion = -1;
        for (Butaca butaca : butacas) {
            if (butaca.getFila() == numFila && butaca.getAsiento() == numAsiento) {
                posicion = butacas.indexOf(butaca);
            }
        }
        return posicion;
    }

    public Butaca buscarButaca2(int numFila, int numAsiento) {

        for (Butaca butaca : butacas) {
            if (butaca.getFila() == numFila && butaca.getAsiento() == numAsiento) {
                return butaca;
            }
        }
        return null;
    }
}