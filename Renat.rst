**************************************
 *Exercici 04_01. En Renat té set vides* 
**************************************

Autor David Guiu

Codi

El codi a analitzar és el següent:

::

    public class GatRenat {
        public int vides = 7;         // vides disponibles del gat Renat
        public static void main(String[] args) {
            GatRenat renat;           // declarem la referència al gat
            renat = new GatRenat();   // creem la instància del gat Renat.
            System.out.println("Al gat Renat li queden " + renat.vides + " vides");
        }
    }
    
    
Pregunta 1
==========
Quin ha de ser el nom del fitxer que contingui aquest codi perquè funcioni?
GatRenat es el nombre q le ponemos a la istancia

Pregunta 2
==========
A quina línia està declarada la variable renat que apareix a la línia 6?
En la linea 4 es donde hacemos la referencia

Pregunta 3
==========
A quina línia s’assigna el valor que es mostra per pantalla?
en la linea 2

Pregunta 4
==========
Quin valor apareix si a aquesta línia no s’assigna cap valor?
Dara 0

Pregunta 5
==========
Què passaria sí la línia 5 no hi fos? Perquè creus?
pues que renat no tendria las vidas

Pregunta 6
==========
Perquè creus que el comentari de la línia 4 parla de referència? Quina relació té amb el concepte de variable?
dara error porque no se inicializa

Pregunta 7
==========
La línia 5 parla d”instància. En aquest context, una instància es pot entendre com el contingut real al que fa referència la variable renat. Es diu que la instància es construeix amb l’operador new i això implica bàsicament que es reserva espai de memòria per a allotjar tota la informació relativa a la instància.

Istancia new GatRenat(),variable renat,valor vidas

Pregunta 8
==========
Pel que hem estudiat fins ara, vides podria ser considerat una variable global dins de la classe GatRenat però hi ha dues diferències respecte les variables globals que varem veure a Variables i mòduls. Sabries indicar quines?
