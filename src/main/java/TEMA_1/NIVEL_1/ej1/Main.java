package TEMA_1.NIVEL_1.ej1;

public class Main {
    public static void main(String[] args) {



        InstrumentoViento flauta = new InstrumentoViento("Flauta", 230);
        InstrumentoViento guitarra = new InstrumentoViento("Guitarra", 540);
        InstrumentoViento tambor = new InstrumentoViento("Tambor", 90);

        //metodo abstracto
        System.out.println(flauta.tocar());
        System.out.println(guitarra.tocar());
        System.out.println(tambor.tocar());

        //metodo toString
        System.out.println(flauta);
        System.out.println(guitarra);
        System.out.println(tambor);

    }
}
