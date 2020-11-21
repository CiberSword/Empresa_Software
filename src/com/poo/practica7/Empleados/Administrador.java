package com.poo.practica7.Empleados;

public class Administrador extends Empleado{

    public Administrador(String nombre, int ID) {
        super(nombre, ID,0);
    }

    @Override
    public int trabajar() {
        return 0;
    }
}
