package TEMA_8.NIVEL_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Pepe", 21, "Java", 9);
        Alumno alumno2 = new Alumno("Luis", 11, "PHP", 3);
        Alumno alumno3 = new Alumno("Maria", 26, "Java", 5);
        Alumno alumno4 = new Alumno("Alba", 15, "Java", 6);
        Alumno alumno5 = new Alumno("Ana", 27, "KOBOL", 4);

        List<Alumno> listaAlumnos = new ArrayList<>(Arrays.asList(alumno1, alumno2, alumno3, alumno4, alumno5));

        listaAlumnos.forEach(n -> System.out.println("Nombre: " + n.getName()  + "\tEdad: " + n.getNote()));

        System.out.println("\nHaz una nueva lista solo con los Alumnos que empiecen con A");
        List<Alumno> listaAlumnosA = new ArrayList<>();
        listaAlumnosA = listaAlumnos.stream().filter(n -> n.getName().startsWith("A")).collect(Collectors.toList());
        listaAlumnosA.forEach(n -> System.out.println(n.toString()));

        System.out.println("\nFiltra y muestra solo los alumnos con una nota superior o igual a 5.");
        listaAlumnos.stream().filter(n -> n.getNote() >= 5).forEach(n -> System.out.println(n));

        System.out.println("\nFiltra y muestra solo alumnos mayores de edad y que estudian JAVA");
        listaAlumnos.stream().filter(n -> n.getAge() >= 18 && n.getCourse().equalsIgnoreCase("JAVA"))
                .forEach(n -> System.out.println(n));




    }
}
