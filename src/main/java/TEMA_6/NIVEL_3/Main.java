package TEMA_6.NIVEL_3;

public class Main {
    public static void main(String[] args) {

        Smartphone movil = new Smartphone("Apple", "15Pro");
        String numTel = "675 231 531";

        System.out.println("Metodos genericos de Smartphone: ");
        Generica.smartphoneGenerico(movil, numTel);
        System.out.println("\nMetodos genericos de telefono: ");
        Generica.telefonoGenerico(movil, numTel);
    }
}
