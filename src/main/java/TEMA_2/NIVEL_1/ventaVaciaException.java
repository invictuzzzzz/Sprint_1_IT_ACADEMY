package TEMA_2.NIVEL_1;

public class ventaVaciaException extends Exception{
    public ventaVaciaException() {
        super("Para hacer una venta primero debes agregar productos");
    }
}
