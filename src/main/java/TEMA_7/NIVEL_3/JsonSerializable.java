package TEMA_7.NIVEL_3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface JsonSerializable {
    String path() default "src/main/java/TEMA_7/NIVEL_3/trabajador.json";
}
