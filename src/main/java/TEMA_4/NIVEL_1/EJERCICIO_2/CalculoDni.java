package TEMA_4.NIVEL_1.EJERCICIO_2;

public class CalculoDni {
    public static void main(String[] args) {

        int numDniUno = 12345678;
        int numDniDos = 23458646;
        int numDniTres = 56732578;
        int numDniCuatro = 98345636;
        int numDniCinco = 43256358;
        int numDniSeis = 47662410;
        System.out.println("La letra para el num: " + numDniUno + " es " + calculoLetraDni(numDniUno));
        System.out.println("La letra para el num: " + numDniDos + " es " + calculoLetraDni(numDniDos));
        System.out.println("La letra para el num: " + numDniTres + " es " + calculoLetraDni(numDniTres));
        System.out.println("La letra para el num: " + numDniCuatro + " es " + calculoLetraDni(numDniCuatro));
        System.out.println("La letra para el num: " + numDniCinco + " es " + calculoLetraDni(numDniCinco));
        System.out.println("La letra para el num: " + numDniSeis + " es " + calculoLetraDni(numDniSeis));


    }

    public static char calculoLetraDni(int numDni) {


        char letraCorrecta = ' ';
        char[] letrasDni = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
                'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int posicionLetraCorrecta = numDni % 23;
        letraCorrecta = letrasDni[posicionLetraCorrecta];
        return letraCorrecta;
    }
}
