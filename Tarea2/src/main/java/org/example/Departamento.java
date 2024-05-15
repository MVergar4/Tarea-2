package org.example;

import java.util.ArrayList;

public class Departamento implements Invitable {
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
    @Override
    public void invitar() {
        for(int i=0; i< al.size();i++){
            al.remove(0).invitar();
        }
    }
}
