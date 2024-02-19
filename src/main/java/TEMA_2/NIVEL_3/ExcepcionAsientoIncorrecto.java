package TEMA_2.NIVEL_3;

public class ExcepcionAsientoIncorrecto extends Exception{
    public ExcepcionAsientoIncorrecto() {
        super("\nEl asiento introducido no es correcto\n");
    }
}
