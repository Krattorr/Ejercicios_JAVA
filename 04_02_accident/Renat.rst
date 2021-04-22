#####################################
Exercici 04_02. En Renat té set vides
#####################################

* autor/a:David Guiu


Codi
====

El codi a analitzar és el següent:

::
public class GatRenat {
    public int vides = 7;         // vides disponibles del gat Renat
    public static void main(String[] args) {
        GatRenat renat;           // declarem l'objecte (la referència) al gat
        renat = new GatRenat();   // creem la instància del gat Renat.
        System.out.println("Abans el gat Renat tenia " + renat.vides + " vides");
        renat.vides = renat.vides - 1;  // Renat ha tingut un accident
        System.out.println("Ara el gat Renat té " + renat.vides);
    }
}

Pregunta 1
==========
Com podem consultar (llegir, obtenir) el valor d’una propietat de la instància?
Pues llmando esa istancia y haciendo un print renat.vides

Pregunta 2
==========
Com podem canviar (escriure, assignar) el valor d’una propietat de la instància?
Pues haciendo una cosa parecida la linea 7

Pregunta 3
==========
És possible indicar que el gat Renat té -12 vides? Com? És quelcom desitjable que pugui passar? En cas que es pugui, com ho podries evitar fent servir els coneixements de programació estructurada i modular que hem treballat fins ara?
Pues en la linea 7 pones -12 

