package PruebaExamen.prueba3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    private static Scanner scanner = new Scanner(System.in);

    private static void inputMismatchException(Exception e) {
        System.out.println("Error de formato.");
        scanner.nextLine();
    }
    private static void exception(Exception e) {
        System.out.println("Error de formato.");
        scanner.nextLine();
    }

    public static byte leerByte(String mensaje) {

        while (true) {
            System.out.println(mensaje);
            //Lanza el mensaje de introducir numero/frase/decimal, etc en bucle
            //hasta que se ingrese el dato necesario. (Escapa con el return)
            try {
                return scanner.nextByte();
            } catch (InputMismatchException e) {
                inputMismatchException(e);
            }
        }
    }

    public static int leerInt(String mensaje) {
        while(true){
            System.out.println(mensaje);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                inputMismatchException(e);
            } finally {
                scanner.nextLine();
            }
        }
    }
    public static int leerIntConRango(String mensaje, int rango) {
        int numero;
        while (true) {
            System.out.println(mensaje);
            try {
                numero = scanner.nextInt();
                if (numero <= rango) {
                    return numero;
                } else {
                    System.out.println("Porfavor, ingresa un numero del 1 al " + rango + ".");
                }
            } catch (InputMismatchException e) {
                inputMismatchException(e);
            } finally {
                scanner.nextLine();
            }
        }
    }
    public static float leerFloat(String mensaje) {

        while (true) {
            System.out.println(mensaje);
            try {
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                inputMismatchException(e);
            } finally {
                scanner.nextLine();
            }
        }
    }
    public static double leerDouble(String mensaje) {

        while (true) {
            System.out.println(mensaje);
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                inputMismatchException(e);
            } finally {
                scanner.nextLine();
            }
        }
    }
    public static char leerChar(String mensaje) {

        while (true) {
            System.out.println(mensaje);
            try {
                return scanner.next().charAt(0);
            } catch (Exception e) {
              exception(e);
            }
        }
    }
    public static String leerString(String mensaje) {

        while (true) {
            System.out.println(mensaje);
            try {
                return scanner.nextLine();
            } catch (Exception e) {
                exception(e);
            }
        }
    }
    public static String leerStringSinNumeros(String mensaje) {
        while (true) {
            System.out.println(mensaje);
            try {
                String input = scanner.nextLine();
                if (input.matches(".*\\d.*")) {
                    System.out.println("Error: no se permiten números. Intente de nuevo.");
                } else {
                    return input;
                }
            } catch (Exception e) {
                exception(e);
            }
        }
    }

    public static boolean leerBoolean(String mensaje) {
        boolean resultado = false;
        boolean datoValido = false;
        String respuesta = "";

        do {
            try {
                System.out.println(mensaje);
                respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("s")) {
                    datoValido = true;
                    resultado = true;
                } else if (respuesta.equalsIgnoreCase("n")) {
                    datoValido = true;
                }
            } catch (Exception e) {
                System.out.println("Error de formato. Introduce una 's' o una 'n'");
            }
        } while (!datoValido);
        return resultado;
    }
}
