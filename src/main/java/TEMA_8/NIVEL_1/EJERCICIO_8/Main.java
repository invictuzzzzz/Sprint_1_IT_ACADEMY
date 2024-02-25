package TEMA_8.NIVEL_1.EJERCICIO_8;

public class Main {
    public static void main(String[] args) {


        StringReverse delReves = n -> (new StringBuilder(n)).reverse().toString();

        System.out.println(delReves.reverse("Daniel"));
    }
}
