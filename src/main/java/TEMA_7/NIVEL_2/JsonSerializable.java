package TEMA_7.NIVEL_2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface JsonSerializable {
    String path() default "src/main/java/TEMA_7/NIVEL_2/trabajador.json";
}
