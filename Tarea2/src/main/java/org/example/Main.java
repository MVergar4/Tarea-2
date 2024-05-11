package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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