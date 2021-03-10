import java.lang.reflect.Method;
import java.lang.reflect.Type;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestExercise {

    @Test
    @DisplayName("test Renat s'aixeca")
    public void testRenatEstiratADret() {
        GatRenat renat = new GatRenat();
        assertAll("aixecat",
                () -> assertEquals("m'aixeco", renat.aixecat(), "revisa el missatge de retorn quan se li demana aixecar-se"),
                () -> assertTrue(renat.estaDret(), "hauria de quedar dret quan se li demana que s'aixequi")
                );
    }

    @Test
    @DisplayName("test Renat seu")
    public void testRenatEstiratAAssegut() {
        GatRenat renat = new GatRenat();
        assertAll("seu",
                () -> assertEquals("m'assec", renat.seu(), "revisa el missatge de retorn quan se li demana seure's"),
                () -> assertTrue(renat.estaAssegut(), "hauria de quedar dret quan se li demana que segui")
                );
    }

    @Test
    @DisplayName("test Renat s'estira")
    public void testRenatDretAEstirat() {
        GatRenat renat = new GatRenat();
        renat.setPosicio("dret");
        assertAll("estirat",
                () -> assertEquals("m'estiro", renat.estirat(), "revisa el missatge de retorn quan se li demana estirar-se"),
                () -> assertTrue(renat.estaEstirat(), "hauria de quedar dret quan se li demana que s'estiri")
                );
    }

    @Test
    @DisplayName("test Renat no fa res quan ja està estirat i li demanen que s'estiri")
    public void testRenatEstiratAEstirat() {
        GatRenat renat = new GatRenat();
        assertAll("reestirat",
                () -> assertEquals("no faig res", renat.estirat(), "revisa el missatge de retorn quan no canvia de posició"),
                () -> assertTrue(renat.estaEstirat(), "hauria de quedar estirat")
                );
    }

    @Test
    @DisplayName("test Renat no fa res quan ja està dret i li demanen que s'aixequi")
    public void testRenatDretADret() {
        GatRenat renat = new GatRenat();
        renat.setPosicio("dret");
        assertAll("reaixecat",
                () -> assertEquals("no faig res", renat.aixecat(), "revisa el missatge de retorn quan no canvia de posició"),
                () -> assertTrue(renat.estaDret(), "hauria de quedar dret")
                );
    }


    @Test
    @DisplayName("test Renat no fa res quan ja està assegut i li demanen que segui")
    public void testRenatAssegutAAssegut() {
        GatRenat renat = new GatRenat();
        renat.setPosicio("assegut");
        assertAll("reseu",
                () -> assertEquals("no faig res", renat.seu(), "revisa el missatge de retorn quan no canvia de posició"),
                () -> assertTrue(renat.estaAssegut(), "hauria de quedar assegut")
                );
    }
}