#####################################
Exercici 04_04. Renat també des de fora
#####################################

* autor/a: David Guiu



Codi
====

El codi a analitzar és el següent:

::

  public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println("Al gat Renat li queden " + renat.vides + " vides");
    }
}
Pregunta 1
==========
Quin és el nom del fitxer on està definit el punt d’entrada main() d’aquest programa?
En el public class

Pregunta 2
==========
Ara tenim dos fitxers amb main(). Com pot saber Java quin és el main() a executar?
usagatrenat porque llama a los dos

Pregunta 3
==========
A quin fitxer està definida la classe del gat Renat?
en gatrenat

Pregunta 4
==========
Quants programes es podrien construir fent ús de la definició del gat Renat?
Todas las que quieras

Pregunta 5
==========
Què passaria si el fitxer amb el codi anterior i el que conté la definició de la classe del Renat estiguessin en directoris diferents?
No funcionaria

Pregunta 6
==========
Elimina el main() de GatRenat. Continua funcionant UsaGatRenat? Què ha deixat de poder-se executar?
Si funciona,no se podra ejecutar Gatrenat

