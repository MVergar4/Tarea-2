package org.example;
import java.util.ArrayList;

/**
 * Clase que sirve para medir la asistencia en la reunion
 */
public class Asistencia {
    /** Un empleado */
    protected Empleado empleado;
    /**
     * Constructor que recibe y guarda un empleado
     * @param e Empleado
     */
    public Asistencia(Empleado e) {
        empleado = e;
    }
    /**
     * getter del empleado
     * @return el empleado
     */
    public Empleado getEmpleado() {
        return empleado;
    }
    /**
     * Sobreescribe el toString para dar cuenta de lo que tiene cada objeto de esta clase
     * @return frase con la id del empleado diciendo que esta presente
     */
    @Override
    public String toString() {
        return "Empleado " + empleado.getId() + ": presente.";
    }
}
