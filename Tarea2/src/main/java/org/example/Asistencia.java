package org.example;

/**
 * Registro de empleados presentes en la reunion
 */
public class Asistencia {
    /** Empleado que está presente */
    protected Empleado empleado;

    /**
     * Contructor por defecto, asigna el empleado
     * @param e empleado que se quiere marcar como presente
     */
    public Asistencia(Empleado e) {
        empleado = e;
    }

    /**
     * Entrega el empleado almacenado
     * @return empleado presente
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Descripción de la clase
     * @return descripción
     */
    public String toString() {
        return "Empleado " + empleado.getId() + ": presente.";
    }
}
