package TEMA_2.NIVEL_2;

public class Main {
    public static void main(String[] args) {



        byte edad = Entrada.leerByte("Introduce tu edad: ");
        System.out.println("Edad: " + edad + " (rango del byte es de -128 a 127)");

        int numero = Entrada.leerInt("Introduce un numero: ");
        System.out.println("Numero: " + numero );

        float decimal = Entrada.leerFloat("Introduce un numero decimal: ");
        System.out.println("Decimal: " + decimal);

        double otroDecimal = Entrada.leerDouble("Introduce otro numero decimal: ");
        System.out.println("Otro decimal: " + otroDecimal);

        char letra = Entrada.leerChar("Introduce una letra: ");
        System.out.println("Letra: " + letra);

        String nombre = Entrada.leerString("Introduce una cadena de texto: ");
        System.out.println("Texto introducido: " + nombre);

        boolean respuesta = Entrada.leerBoolean("Estás de acuerdo? ('s' para sí, 'n' para no)");
        System.out.println("Respuesta: " + respuesta);

    }
}
