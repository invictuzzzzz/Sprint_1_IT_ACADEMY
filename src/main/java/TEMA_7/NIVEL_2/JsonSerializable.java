package TEMA_7.NIVEL_2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME) //Esta linea es para que sea registrada
// por la Virtual Machine en tiempo de ejecución (NIVEL 3) pero sin esta anotación
// no reconoce la ruta de la interface personalizada.
public @interface JsonSerializable {
    String path() default "src/main/java/TEMA_7/NIVEL_2/trabajador.json";
}
