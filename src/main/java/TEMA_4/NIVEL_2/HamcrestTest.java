package TEMA_4.NIVEL_2;

import org.hamcrest.*;
import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.is;

public class HamcrestTest {

    // ? super Integer. (Acepta cualquier matcher, que compare Integers)
    public static FeatureMatcher<String, Integer> longitudString(Matcher<? super Integer> matcher) {
        return new FeatureMatcher<String, Integer>
                (matcher, "La longitud esperada del String",
                        "La longitud del String recibida") {
            @Override
            protected Integer featureValueOf(String palabra) {
                return palabra.length();
            }
        };
    }

    @Test
    public void longitudStringTest() {
        MatcherAssert.assertThat("Mordor", longitudString(is(8)));
    }
}
