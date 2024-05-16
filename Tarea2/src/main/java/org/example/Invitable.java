package org.example;

import java.time.Instant;

/**
 * Interfaz que sirve para que tanto departamento como un solo empleado puedan ser invitados.
 */
public interface Invitable {
    public Invitacion invitar(Instant hora);
}
