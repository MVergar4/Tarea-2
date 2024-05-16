package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ReunionTest {
    private Empleado E1 = new Empleado("12","Cifuentes","Francisco","fcifuentes");
    private Empleado E2 = new Empleado("13","Vergara","Marcelo","mvergara");
    private Empleado E3 = new Empleado("14","Perez","Juan","jperez");
    private Empleado E4 = new Empleado("15","Pato","Diaz","pdiaz");
    private Departamento D = new Departamento("Finanzas");
    Date fecha= new Date(124,4,14,12,0,0);
    Instant instante = Instant.parse("2024-05-13T12:00:00Z");
    Instant instante_2 = Instant.parse("2024-05-13T13:00:00Z");
    Instant instante_3 = Instant.parse("2024-05-13T12:30:00Z");
    Duration duracion = Duration.between(instante,instante_2);
    tipoReunion T = tipoReunion.MARKETING;
    ArrayList<Invitacion> lista = new ArrayList<>();
    @BeforeEach
    void setUp() {
    }
    @Test
    void addAsistente() {
        lista.add(E1.invitar(instante));lista.add(E2.invitar(instante));
        ReunionPresencial R = new ReunionPresencial("Sala 111",fecha,instante,duracion,T, lista);
        R.addAsistente(E1);R.addAsistente(E2);
        assertEquals("[Empleado 12: presente., Empleado 13: presente.]",R.obtenerAsistencias().toString());
    }

    @Test
    void addAtrasado() {
        lista.add(E1.invitar(instante));lista.add(E2.invitar(instante));
        lista.add(E1.invitar(instante));lista.add(E2.invitar(instante));
        ReunionPresencial R = new ReunionPresencial("Sala 111",fecha,instante,duracion,T, lista);
        R.addAsistente(E1);R.addAsistente(E2);R.addAsistente(E3);R.addAtrasado(E4,instante_3);
        assertEquals("[Empleado 15: atrasado.]",R.obtenerRetrasos().toString());
    }

    @Test
    void verAsistentesInforme() {
        lista.add(E1.invitar(instante));lista.add(E2.invitar(instante));
        lista.add(E1.invitar(instante));lista.add(E2.invitar(instante));
        ReunionPresencial R = new ReunionPresencial("Sala 111",fecha,instante,duracion,T, lista);
        R.addAsistente(E1);R.addAsistente(E2);R.addAtrasado(E4,instante_3);
        assertEquals("[Empleado 12: presente., Empleado 13: presente.] [Empleado 15: atrasado.]",R.obtenerAsistencias()+" "+R.obtenerRetrasos());
    }
}