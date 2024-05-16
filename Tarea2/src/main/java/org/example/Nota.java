package org.example;

/**
 * Clase que sirve para las notas que se hacen en la reunion
 */
public class Nota {
    /** Contenido de la nota */
    private String contenido;
    /** Constructor de la nota que deja el contenido en blanco */
    public Nota() {
        contenido = "";
    }

    /**
     * metodo que sirve para añadir una nota
     * @param s Mensaje que se quiere guardar
     */
    public void añadirNota(String s) {
        if (contenido.isBlank()) {
            contenido = contenido + s + ".";
        } else {
            contenido = contenido + " " + s + ".";
        }
    }

    /**
     * getter del contenido de la nota
     * @return contenido de la nota
     */
    public String leerNota() {
        return contenido;
    }
}
