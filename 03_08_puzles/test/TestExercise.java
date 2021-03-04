/*
    Unit testing methods for exercise 03_11_show
*/

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class TestExercise {

    @ParameterizedTest
    @CsvSource(value={
        "'',false",
        "' ',false",
        "'nom amb espais', false",
        "'!', false",
        "'/', false",
        "n,true",
        "_,true",
        "1,true",
        "nom_Perfectament_valid_123, true"
    })
    @DisplayName("test esNomPuzleValid()")
    public void esNomPuzleValid(String text, boolean expected) {
        assertEquals(expected, Puzle.esNomPuzleValid(text));
    }

    @ParameterizedTest
    @CsvSource(value={
        "'',false",
        "puzle_.txt,false",
        "puzle_.csv, false",
        "test_.txt, false",
        "puzlemolon.txt, false",
        "puzle_amb noms espaiats.txt, false",
        "puzle_nom_Perfectament_valid_123.txt, true"
    })
    @DisplayName("test esNomFitxerDePuzleValid()")
    public void esNomFitxerDePuzleValid(String text, boolean expected) {
        assertEquals(expected, Puzle.esNomFitxerDePuzleValid(text));
    }

    @ParameterizedTest
    @CsvSource(value={
        "puzle_.txt, ''",
        "puzle_amb noms espaiats.txt, 'amb noms espaiats'",
        "puzle_nom_Perfectament_valid_123.txt, nom_Perfectament_valid_123"
    })
    @DisplayName("test extreuNomPuzleDeNomFitxer()")
    public void extreuNomPuzleDeNomFitxer(String text, String expected) {
        assertEquals(expected, Puzle.extreuNomPuzleDeNomFitxer(text));
    }

    @ParameterizedTest
    @CsvSource(value={
        "-1,0",
        "0,-1",
        "8,0",
        "0,8",
        "-1,8",
        "8,-1",
        "-1,-1",
        "8,8",
    })
    @DisplayName("test posicionaFigura() quan coordenades fora de taulell")
    public void posicionaFiguraForaTaulell(int fila, int columna) {
        char[][] taulell = {
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'}
        };
        char figura = 'p';
        boolean found = Escacs.posicionaFigura(taulell, fila, columna, figura);
        assertFalse(found, "Revisa la funció quan la coordenada és (" + fila + ", " + columna + ")");
    }

    @ParameterizedTest
    @CsvSource(value={
        "0,0",
        "0,1",
        "0,7",
        "1,0",
        "7,0",
        "3,4",
        "7,7",
    })
    @DisplayName("test posicionafigura() retorna true quan coordenades dins del taulell")
    public void posicionaFiguraDinsRetornaTrue(int fila, int columna) {
        char[][] taulell = {
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'}
        };
        char figura = 'p';
        boolean found = Escacs.posicionaFigura(taulell, fila, columna, figura);
        assertTrue(found, "revisa la funció quan la coordenada és (" + fila + ", " + columna + ") i casella lliure");
    }

    @ParameterizedTest
    @CsvSource(value={
        "0,0",
        "0,1",
        "0,7",
        "1,0",
        "7,0",
        "3,4",
        "7,7",
    })
    @DisplayName("test posicionafigura() col·loca figura quan coordenades dins del taulell")
    public void posicionafiguraDinsPosiciona(int fila, int columna) {
        char[][] taulell = {
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'}
        };
        char figura = 'p';
        Escacs.posicionaFigura(taulell, fila, columna, figura);
        char found = taulell[fila][columna];
        assertEquals(figura, found, "revisa que la funció posicioni la figura quan la coordenada és (" + fila + ", " + columna + ") i casella lliure");
    }

    @ParameterizedTest
    @CsvSource(value={
        "0,0",
        "0,1",
        "0,7",
        "1,0",
        "7,0",
        "3,4",
        "7,7",
    })
    @DisplayName("test posicionafigura() retorna false quan coordenades dins del taulell però ocupades")
    public void posicionaFiguraDinsOcupadaRetornaFalse(int fila, int columna) {
        char[][] taulell = {
            {'r','r','·','·','·','·','·','r'},
            {'r','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','r','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'r','·','·','·','·','·','·','r'}
        };
        char figura = 'p';
        boolean found = Escacs.posicionaFigura(taulell, fila, columna, figura);
        assertFalse(found, "revisa la funció quan la coordenada és (" + fila + ", " + columna + ") i casella ocupada");
    }

    @ParameterizedTest
    @CsvSource(value={
        "0,0",
        "0,1",
        "0,7",
        "1,0",
        "7,0",
        "3,4",
        "7,7",
    })
    @DisplayName("test posicionafigura() col·loca figura quan coordenades dins del taulell")
    public void posicionafiguraDinsOcupadaNoPosiciona(int fila, int columna) {
        char[][] taulell = {
            {'r','r','·','·','·','·','·','r'},
            {'r','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','r','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'r','·','·','·','·','·','·','r'}
        };
        char figura = 'p';
        Escacs.posicionaFigura(taulell, fila, columna, figura);
        char expected = 'r';
        char found = taulell[fila][columna];
        assertEquals(expected, found, "revisa que la funció posicioni la figura quan la coordenada és (" + fila + ", " + columna + ") i casella ocupada");
    }




    @ParameterizedTest
    @CsvSource(value={
        "T, true",
        "C, true",
        "A, true",
        "D, true",
        "R, true",
        "P, true",
        "t, true",
        "c, true",
        "a, true",
        "d, true",
        "r, true",
        "p, true",
        "·, false",
        "@, false",
        "!, false",
        "X, false",
        "1, false",
        "q, false",
    })
    @DisplayName("test esFiguraValida()")
    public void esFiguraValida(char figura, boolean expected) {
        assertEquals(expected, Escacs.esFiguraValida(figura));
    }

    @ParameterizedTest
    @CsvSource(value={
        "-1,0,0,0",
        "0,-1,0,0",
        "8,0,0,0",
        "0,8,0,0",
        "-1,8,0,0",
        "8,-1,0,0",
        "-1,-1,0,0",
        "8,8,0,0",

        "0,0,-1,0",
        "0,0,0,-1",
        "0,0,8,0",
        "0,0,0,8",
        "0,0,-1,8",
        "0,0,8,-1",
        "0,0,-1,-1",
        "0,0,8,8",

        "-1,0,-1,0",
        "0,-1,0,-1",
        "8,0,8,0",
        "0,8,0,8",
        "8,-1,-1,8",
        "-1,8,8,-1",
        "8,8,-1,-1",
        "-1,-1,8,8",
    })
    @DisplayName("test mouFigura() quan coordenades fora de taulell")
    public void posicionaFiguraForaTaulell(int filaOrigen, int columnaOrigen, int filaDest, int columnaDest) {
        char[][] taulell = {
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'}
        };
        char figura = 'p';
        boolean found = Escacs.mouFigura(taulell, filaOrigen, columnaOrigen, filaDest, columnaDest);
        assertFalse(found, "Revisa la funció quan les coordenades estan fora del taulell");
    }

    @ParameterizedTest
    @CsvSource(value={
        "5,4,4,2",
        "5,4,3,3",
        "5,4,3,5",
        "5,4,4,6",
        "5,4,6,6",
        "5,4,7,5",
        "5,4,7,3",
        "5,4,6,2",
    })
    @DisplayName("test mouFigura() retorna cert quan moviment és possible")
    public void mouFiguraQuanPosibleRetornaTrue(int filaOrigen, int columnaOrigen, int filaDest, int columnaDest) {
        char[][] taulell = {
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','C','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'}
        };
        boolean found = Escacs.mouFigura(taulell, filaOrigen, columnaOrigen, filaDest, columnaDest);
        assertTrue(found, "Revisa la funció quan es demana moure una figura existent a una posició lliure");
    }

    @ParameterizedTest
    @CsvSource(value={
        "5,4,4,2",
        "5,4,3,3",
        "5,4,3,5",
        "5,4,4,6",
        "5,4,6,6",
        "5,4,7,5",
        "5,4,7,3",
        "5,4,6,2",
    })
    @DisplayName("test mouFigura() posiciona la figura quan moviment és possible")
    public void mouFiguraQuanPosiblePosicionaEnDestinacio(int filaOrigen, int columnaOrigen, int filaDest, int columnaDest) {
        char[][] taulell = {
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','C','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'}
        };
        Escacs.mouFigura(taulell, filaOrigen, columnaOrigen, filaDest, columnaDest);
        assertTrue(taulell[filaDest][columnaDest] == 'C', "Revisa que la funció estigui posicionant la figura en destinació");
    }

    @ParameterizedTest
    @CsvSource(value={
        "5,4,4,2",
        "5,4,3,3",
        "5,4,3,5",
        "5,4,4,6",
        "5,4,6,6",
        "5,4,7,5",
        "5,4,7,3",
        "5,4,6,2",
    })
    @DisplayName("test mouFigura() elimina la figura de la posició d'origen")
    public void mouFiguraQuanPosibleAlliberaOrigen(int filaOrigen, int columnaOrigen, int filaDest, int columnaDest) {
        char[][] taulell = {
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','C','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'}
        };
        Escacs.mouFigura(taulell, filaOrigen, columnaOrigen, filaDest, columnaDest);
        assertTrue(taulell[filaOrigen][columnaOrigen] == '·', "Revisa que la funció estigui alliberant la posició d'origen");
    }

    @ParameterizedTest
    @CsvSource(value={
        "5,4,4,2",
        "5,4,3,3",
        "5,4,3,5",
        "5,4,4,6",
        "5,4,6,6",
        "5,4,7,5",
        "5,4,7,3",
        "5,4,6,2",
    })
    @DisplayName("test mouFigura() retorna fals quan la destinació està ocupada")
    public void mouFiguraQuanOcupadaRetornaFalse(int filaOrigen, int columnaOrigen, int filaDest, int columnaDest) {
        char[][] taulell = {
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','P','·','P','·','·'},
            {'·','·','P','·','·','·','P','·'},
            {'·','·','·','·','C','·','·','·'},
            {'·','·','P','·','·','·','P','·'},
            {'·','·','·','P','·','P','·','·'}
        };
        boolean found = Escacs.mouFigura(taulell, filaOrigen, columnaOrigen, filaDest, columnaDest);
        assertFalse(found, "Revisa la funció quan es demana moure una figura existent a una posició lliure");
    }

    @Test
    @DisplayName("test mouFigura() retorna fals quan l'origen està buit")
    public void mouFiguraQuanOrigenBuit() {
        char[][] taulell = {
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'}
        };
        assertFalse(Escacs.mouFigura(taulell, 1, 2, 3, 4), "Revisa el cas que l'origen no contingui cap figura");
    }

    @ParameterizedTest
    @CsvSource(value={
        "-1,0",
        "0,-1",
        "8,0",
        "0,8",
        "-1,8",
        "8,-1",
        "-1,-1",
        "8,8",
    })
    @DisplayName("test eliminaFigura() quan coordenades fora de taulell")
    public void eliminaFiguraForaTaulell(int fila, int columna) {
        char[][] taulell = {
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'}
        };
        boolean found = Escacs.eliminaFigura(taulell, fila, columna);
        assertFalse(found, "Revisa la funció quan la coordenada és (" + fila + ", " + columna + ")");
    }

    @Test
    @DisplayName("test eliminafigura() retorna true quan la figura hi és")
    public void eliminaFiguraQuanHiEs() {
        char[][] taulell = {
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','R','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'}
        };
        boolean found = Escacs.eliminaFigura(taulell, 3, 4);
        assertTrue(found, "revisa la funció quan la figura a eliminar hi és");
    }

    @Test
    @DisplayName("test eliminafigura() retorna false quan la figura no hi és")
    public void eliminaFiguraQuanNoHiEs() {
        char[][] taulell = {
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'},
            {'·','·','·','·','·','·','·','·'}
        };
        boolean found = Escacs.eliminaFigura(taulell, 7, 2);
        assertFalse(found, "revisa la funció quan la figura a eliminar no hi és");
    }

    @Test
    @DisplayName("Test hi és mòdul composaNomFitxerDeNomPuzle()")
    public void prgtestX1composaNomFitxerDeNomPuzle() {
        Class classe = Puzle.class;
        String modulObjectiu = "composaNomFitxerDeNomPuzle";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        1, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                    "java.lang.String",
                    types[0].getTypeName(),
                    "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "java.lang.String",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
    @Test
    @DisplayName("Test hi és mòdul extreuNomPuzleDeNomFitxer()")
    public void prgtestX2extreuNomPuzleDeNomFitxer() {
        Class classe = Puzle.class;
        String modulObjectiu = "extreuNomPuzleDeNomFitxer";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        1, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                    "java.lang.String",
                    types[0].getTypeName(),
                    "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "java.lang.String",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
    @Test
    @DisplayName("Test hi és mòdul esNomFitxerDePuzleValid()")
    public void prgtestX3esNomFitxerDePuzleValid() {
        Class classe = Puzle.class;
        String modulObjectiu = "esNomFitxerDePuzleValid";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        1, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                    "java.lang.String",
                    types[0].getTypeName(),
                    "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "boolean",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
    @Test
    @DisplayName("Test hi és mòdul esNomPuzleValid()")
    public void prgtestX4esNomPuzleValid() {
        Class classe = Puzle.class;
        String modulObjectiu = "esNomPuzleValid";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        1, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                    "java.lang.String",
                    types[0].getTypeName(),
                    "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "boolean",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
    @Test
    @DisplayName("Test hi és mòdul existeixPuzle()")
    public void prgtestX5existeixPuzle() {
        Class classe = Puzle.class;
        String modulObjectiu = "existeixPuzle";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        1, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                    "java.lang.String",
                    types[0].getTypeName(),
                    "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "boolean",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
    @Test
    @DisplayName("Test hi és mòdul esEnter()")
    public void prgtestX6esEnter() {
        Class classe = UtilString.class;
        String modulObjectiu = "esEnter";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        1, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                    "java.lang.String",
                    types[0].getTypeName(),
                    "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "boolean",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
    @Test
    @DisplayName("Test hi és mòdul respostaABoolean()")
    public void prgtestX7respostaABoolean() {
        Class classe = UtilitatsConfirmacio.class;
        String modulObjectiu = "respostaABoolean";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        1, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                    "java.lang.String",
                    types[0].getTypeName(),
                    "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "boolean",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
    @Test
    @DisplayName("Test hi és mòdul creaPuzleBuit()")
    public void prgtestX8creaPuzleBuit() {
        Class classe = Escacs.class;
        String modulObjectiu = "creaPuzleBuit";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        0, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "char[][]",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
    @Test
    @DisplayName("Test hi és mòdul llegeixPuzle()")
    public void prgtestX9llegeixPuzle() {
        Class classe = Puzle.class;
        String modulObjectiu = "llegeixPuzle";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        1, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                    "java.lang.String",
                    types[0].getTypeName(),
                    "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "char[][]",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
    @Test
    @DisplayName("Test hi és mòdul mostraTaulell()")
    public void prgtestX10mostraTaulell() {
        Class classe = Escacs.class;
        String modulObjectiu = "mostraTaulell";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        1, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                    "char[][]",
                    types[0].getTypeName(),
                    "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "void",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
    @Test
    @DisplayName("Test hi és mòdul duplicaPuzle()")
    public void prgtestX11duplicaPuzle() {
        Class classe = Puzle.class;
        String modulObjectiu = "duplicaPuzle";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        2, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                    "java.lang.String",
                    types[0].getTypeName(),
                    "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                    "java.lang.String",
                    types[1].getTypeName(),
                    "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "void",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
    @Test
    @DisplayName("Test hi és mòdul escriuPuzle()")
    public void prgtestX12escriuPuzle() {
        Class classe = Puzle.class;
        String modulObjectiu = "escriuPuzle";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        2, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                    "java.lang.String",
                    types[0].getTypeName(),
                    "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                    "char[][]",
                    types[1].getTypeName(),
                    "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "void",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
    @Test
    @DisplayName("Test hi és mòdul mostraAjuda()")
    public void prgtestX13mostraAjuda() {
        Class classe = Puzle.class;
        String modulObjectiu = "mostraAjuda";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        0, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "void",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
    @Test
    @DisplayName("Test hi és mòdul mostraLlista()")
    public void prgtestX14mostraLlista() {
        Class classe = Puzle.class;
        String modulObjectiu = "mostraLlista";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        0, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "void",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
    @Test
    @DisplayName("Test hi és mòdul processaAdd()")
    public void prgtestX15processaAdd() {
        Class classe = Puzle.class;
        String modulObjectiu = "processaAdd";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        1, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                    "java.lang.String[]",
                    types[0].getTypeName(),
                    "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "void",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
    @Test
    @DisplayName("Test hi és mòdul processaCp()")
    public void prgtestX16processaCp() {
        Class classe = Puzle.class;
        String modulObjectiu = "processaCp";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        1, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                    "java.lang.String[]",
                    types[0].getTypeName(),
                    "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "void",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
    @Test
    @DisplayName("Test hi és mòdul processaDel()")
    public void prgtestX17processaDel() {
        Class classe = Puzle.class;
        String modulObjectiu = "processaDel";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        1, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                    "java.lang.String[]",
                    types[0].getTypeName(),
                    "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "void",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
    @Test
    @DisplayName("Test hi és mòdul processaMv()")
    public void prgtestX18processaMv() {
        Class classe = Puzle.class;
        String modulObjectiu = "processaMv";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        1, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                    "java.lang.String[]",
                    types[0].getTypeName(),
                    "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "void",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
    @Test
    @DisplayName("Test hi és mòdul processaNew()")
    public void prgtestX19processaNew() {
        Class classe = Puzle.class;
        String modulObjectiu = "processaNew";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        1, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                    "java.lang.String[]",
                    types[0].getTypeName(),
                    "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "void",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
    @Test
    @DisplayName("Test hi és mòdul processaShow()")
    public void prgtestX20processaShow() {
        Class classe = Puzle.class;
        String modulObjectiu = "processaShow";
        Method[] methods = classe.getDeclaredMethods();
        boolean foundTarget = false;
        for (Method method: methods) {
            if (modulObjectiu.equals(method.getName())) {
                foundTarget=true;
                Type[] types = method.getGenericParameterTypes();
                assertEquals(
                        1, 
                        types.length, 
                        "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                    "java.lang.String[]",
                    types[0].getTypeName(),
                    "Revisa els paràmetres requerits pel mòdul " + modulObjectiu + "()"
                );
                assertEquals(
                        "void",
                        method.getGenericReturnType().getTypeName(),
                        "S'esperava " + modulObjectiu + "() d'un tipus diferent"
                );
            }
        }
        assertTrue(foundTarget, "No es troba el mòdul " + modulObjectiu + "(). Revisa enunciat.");
    }
}