package TEMA_3.NIVEL_1.ejercicio_3;

import java.util.Scanner;

public class Jugador {
    private String nombre;
    private int puntuacion;

    public Jugador () {
        pedirNombre();
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPuntuacion() {
        return this.puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dime tu nombre: ");
        this.nombre = entrada.nextLine().toUpperCase();

    }

    public void sumarPuntos() {
        setPuntuacion(getPuntuacion() + 1);
    }


}

