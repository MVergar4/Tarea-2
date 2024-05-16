package org.example;

import java.time.Instant;

/**
 * Interfaz para invitar
 */
public interface Invitable {
    /**
     * Invita a una hora específica
     * @param hora hora a la que se invita
     * @return registro de la invitación
     */
    public Invitacion invitar(Instant hora);
}
