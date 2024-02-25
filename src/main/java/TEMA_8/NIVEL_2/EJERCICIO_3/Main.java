package TEMA_8.NIVEL_2.EJERCICIO_3;

public class Main {
    public static void main(String[] args) {


        Operator suma = (a, b) -> a + b;
        Operator resta = (a, b) -> a - b;
        Operator multiplicacion = (a, b) -> a * b;
        Operator division = (a, b) -> a / b;

        System.out.println("Operación suma de 12 + 8 es : " + suma.operacio(12,8));
        System.out.println("Operación resta de 12 - 8 es : " + resta.operacio(12,8));
        System.out.println("Operación multiplicación de 12 * 8 es : " + multiplicacion.operacio(12,8));
        System.out.println("Operación división de 12 / 8 es : " + division.operacio(12,8));
    }
}
