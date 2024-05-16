package org.example;

/**
 * Notas que pueden tomarse durante la reunión
 */
public class Nota {
    /** contenido de la nota */
    private String contenido;

    /**
     * Constructor por defecto, inicializa el contenido con un String vacío
     */
    public Nota() {
        contenido = "";
    }

    /**
     * Añade una nota al registro
     * @param s nota que se quiere añadir
     */
    public void añadirNota(String s) {
        if (contenido.isBlank()) {
            contenido = contenido + s + ".";
        } else {
            contenido = contenido + " " + s + ".";
        }
    }

    /**
     * Entrega lo que contienen las notas
     * @return contenido de las notas
     */
    public String leerNota() {
        return contenido;
    }
}
