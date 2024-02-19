package TEMA_4.NIVEL_1.EJERCICIO_1;

public class Meses implements Comparable<Meses> {
    private String nombreMes;
    private int numeroMes;


    public Meses(String nombreMes, int numeroMes) {
        this.nombreMes = nombreMes;
        this.numeroMes = numeroMes;
    }


    public String getNombreMes() {
        return this.nombreMes;
    }

    public int getNumeroMes() {
        return this.numeroMes;
    }


    @Override
    public int compareTo(Meses mes) {
        return Integer.compare(this.numeroMes, mes.getNumeroMes());
    }
}
