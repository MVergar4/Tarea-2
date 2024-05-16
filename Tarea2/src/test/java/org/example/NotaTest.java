package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotaTest {

    @Test
    void añadirNota() {
        Nota n = new Nota();
        n.añadirNota("Hola ");
        n.añadirNota("Buenos ");
        n.añadirNota("Dias ");
        assertEquals("Hola . Buenos . Dias .",n.leerNota());
    }
}