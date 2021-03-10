import java.lang.reflect.Method;
import java.lang.reflect.Type;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestExercise {

    @Test
    @DisplayName("test Renat neix estirat")
    public void testRenatNeixEstirat() {
        assertTrue(new GatRenat().estaEstirat(), "Renat ha de néixer estirat");
    }

    @Test
    @DisplayName("test Renat neix viu")
    public void testRenatNeixViu() {
        assertTrue(new GatRenat().estaViu(), "Renat ha de néixer viu");
    }


    @Test
    @DisplayName("test Renat quan està dret")
    public void testRenatDret() {
        GatRenat renat = new GatRenat();
        renat.setPosicio("dret");

        assertAll("dret", 
                () -> assertTrue(renat.estaDret(), "Renat ha d'estar dret"),
                () -> assertFalse(renat.estaEstirat(), "Renat no pot estar estirat quan està dret"),
                () -> assertFalse(renat.estaAssegut(), "Renat no pot estar assegut quan està dret")
                );
    }


    @Test
    @DisplayName("test Renat.posicio és privat")
    public void testRenatPosicioEsPrivate() {
        assertTrue(UtilTests.classHasPrivateField(GatRenat.class, "posicio"),
                "Cal que la posició sigui privada per grantir que no pugui ser modificada malament");
    }

}