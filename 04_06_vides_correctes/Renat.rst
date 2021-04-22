#####################################
Exercici 04_06. Vides sempre correctes
#####################################

* autor/a: David Guiu


Codi
====

El codi a analitzar és el següent:

::

    public class GatRenat {
    public int vides = 7;
}

public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        renat.vides = -12;
        System.out.println("El gat Renat té " + renat.vides + " vides");
    }
}

Pregunta 1
==========
Què passa si intentes executar el següent codi? Perquè creus?

public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println("El gat Renat té " + renat.vides + " vides");
    }
}
Error,dice que vides es privado y solo GatRenat tiene acceso

Pregunta 2
==========
Què tal si modifiquem lleugerament el codi anterior per aquest?

 public class UsaGatRenat {
     public static void main(String[] args) {
         GatRenat renat = new GatRenat();
         System.out.println("El gat Renat té " + renat.getVides() + " vides");
     }
 }
Fixa’t que ara estem fent servir renat.getVides() en comptes de directament renat.vides(). Funciona ara?

Ahora funciona porque getVides no es privada


Pregunta 3
==========

Pregunta 4
==========
Pregunta 5
==========
Pregunta 6
==========
Pregunta 7
==========
Pregunta 8
==========
Pregunta 9
==========

