package org.example;
import java.util.ArrayList;

public class Asistencia {
    protected Empleado empleado;
    public Asistencia(Empleado e) {
        empleado = e;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public String toString() {
        return "Empleado " + empleado.getId() + ": presente.";
    }
}
