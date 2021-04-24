import java.lang.reflect.Type;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class TestExercise {


    @Nested
    @DisplayName("Tests de Vi")
    class SobreVi {
        @ParameterizedTest
        @CsvSource(value={
        "'   nom',nom,'cal eliminar els espais inicials'",
        "'nom   ',nom,'cal eliminar els espais finals'",
        "'nom   cognom1   cognom2', 'nom cognom1 cognom2', 'cal eliminar espais extra entre paraules'",
        "'nom cognom1 cognom2', 'nom cognom1 cognom2', 'cal respectar espais entre paraules'",
        "'  Nom  Cognom1 Cognom2 ', 'Nom Cognom1 Cognom2', 'cal respectar majúscules i minúscules quan s'eliminen espais'",
        "'   ', 'nom no vàlid', 'cal un nom per defecte quan el rebut no és vàlid'"
        })
        @DisplayName("test normalitza nom")
        public void testNormalitzaNom(String nom, String esperat, String missatge) {
            String obtingut = Vi.normalitzaNom(nom);
            assertEquals(esperat, obtingut, missatge);
        }
    }

}