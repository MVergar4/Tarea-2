package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {
    private Empleado A = new Empleado("12","Cifuentes","Francisco","fcifuentes");
    private Empleado B = new Empleado("13","Vergara","Marcelo","mvergara");
    private Departamento D = new Departamento("Finanzas");
    @BeforeEach
    void setUp() {
        D.setEmpleados(A);D.setEmpleados(B);
    }
    @AfterEach
    void tearDown() {
    }
    @Test
    void obtenerCantidadEmpleados() {
        assertEquals(2,D.obtenerCantidadEmpleados());
    }
    @Test
    void probarToString(){
        assertEquals("Departamento Finanzas de empleados",D.toString());
    }
    @Test
    void invitarDepartamentoEntero() {
        D.setEmpleados(A);D.setEmpleados(B);
        Instant instante = Instant.parse("2024-05-13T12:00:00Z");
        ArrayList<Invitacion> lista = new ArrayList<>();
        Invitacion i = A.invitar(instante); Invitacion i2=B.invitar(instante);
        lista.add(i);lista.add(i2);

        assertEquals(lista,D.invitarDepartamentoEntero(instante));
        //Dice que el test falla pero al revisar lo esperado con lo actual es identico.
    }

}