package TEMA_2.NIVEL_3;

public class Butaca {
    private int fila;
    private int asiento;
    private String persona;

    public Butaca(int fila, int numero, String persona) {
        this.fila = fila;
        this.asiento = numero;
        this.persona = persona;
    }


    public int getFila() {
        return this.fila;
    }

    public int getAsiento() {
        return this.asiento;
    }

    public String getPersona() {
        return this.persona;
    }

 /**
    @Override
    public boolean equals(Object otra) {
        Butaca segundaButaca = (Butaca) otra;
        return fila == segundaButaca.fila && asiento == segundaButaca.asiento;
        this.asiento.equals(segundaButaca.asiento);
    }
*/




    @Override
    public String toString() {
        return "Fila: " + fila + " Asiento: " + asiento + " Persona: " +
                persona + "\n";
    }
}
