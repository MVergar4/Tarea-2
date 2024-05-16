package org.example;

import java.time.Instant;
import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private ArrayList<Empleado> al;
    public Departamento(String nombre){
        this.nombre=nombre;
    }

    public void setEmpleados(Empleado E) {
        al.add(E);
    }

    public int obtenerCantidadEmpleados(){
        return al.size();
    }
    public ArrayList<Invitacion> invitarDepartamentoEntero(Instant hora) {
        ArrayList<Invitacion> alinv = new ArrayList<>();
        for(int i=0; i< al.size();i++){
            alinv.add(al.get(i).invitar(hora));
        }
        return alinv;
    }
}
