package org.example;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {
    @Test
    void invitar() {
        Empleado A = new Empleado("1","Juan","Perez","jperez");
        Instant instante = Instant.parse("2024-05-13T12:00:00Z");
        Invitacion i = A.invitar(instante);
        assertEquals("Empleado 1: invitado.",A.invitar(instante).toString());
    }
}