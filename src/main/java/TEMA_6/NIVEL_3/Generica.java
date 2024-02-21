package TEMA_6.NIVEL_3;

public class Generica {
    public static <T extends Telefono> void telefonoGenerico(T argumentoGenerico, String mensaje) {
        argumentoGenerico.llamar(mensaje);
        // argumentoGenerico.hacerfoto() no se puede invocar desde Telefono
    }

    public static <T extends Smartphone> void smartphoneGenerico(T argumentoGenerico, String mensaje) {
        argumentoGenerico.llamar(mensaje);
        argumentoGenerico.hacerFotos();
    }
}
