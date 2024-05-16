package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void setEmpleado(){
        Empleado A = new Empleado("12","Cifuentes","Francisco","fcifuentes");
        Departamento D = new Departamento("Finanza");
    }
    @Test
    void obtenerCantidadEmpleados() {
        Empleado A = new Empleado("12","Cifuentes","Francisco","fcifuentes");
        Empleado B = new Empleado("13","Vergara","Marcelo","mvergara");
        Departamento D = new Departamento("Finanzas");
        D.setEmpleados(A);D.setEmpleados(B);
        assertEquals(2,D.obtenerCantidadEmpleados());
    }
    @Test
    void probarToString(){
        Departamento D = new Departamento("Finanzas");
        assertEquals("Departamento Finanzas de empleados",D.toString());
    }

    @Test
    void invitarDepartamentoEntero() {
    }
}