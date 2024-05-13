package org.example;

public class Main {
    public static void main(String[] args) {
        Nota n = new Nota();
        System.out.println(n.leerNota());
        n.añadirNota("Esta es la primera");
        System.out.println(n.leerNota());
        n.añadirNota("Esta es una segunda nota");
        System.out.println(n.leerNota());
    }
}