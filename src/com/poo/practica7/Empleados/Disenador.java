package com.poo.practica7.Empleados;

import com.poo.practica7.Empleados.Empleado;

public class Disenador extends Empleado{

    Disenador(){
        setNombre("Matt Heafy");
        setID(93849);
        setHorasDeTrabajo(0);
        System.out.println(toString());
        setHorasDeTrabajo(trabajar());
    }

    public String toString(){
        return "\n\nDISEÑADOR: " + getNombre();
    }

    public int trabajar(){
        System.out.println("\t << HORA DE TRABAJAR >> ");
        investigarDisenos();
        pensarEnDisenos();
        establecerColores();
        dibujar();
        establecerNuevoSlogan();
        return getHorasDeTrabajo();
    }

    public void investigarDisenos(){
        System.out.println("Investigando diseños");
        setHorasDeTrabajo(1);
    }

    public void pensarEnDisenos(){
        System.out.println("Imaginando un nuevo diseño");
        setHorasDeTrabajo(2);
    }

    public void establecerColores(){
        System.out.println("El color perfecto para este diseño es...");
        setHorasDeTrabajo(2);
    }

    public void dibujar(){
        System.out.println("Este diseño será el mejor de todos");
        setHorasDeTrabajo(5);
    }

    public void establecerNuevoSlogan(){
        System.out.println("Nuevo Slogan: \"Imaginalo y hazlo\"");
        setHorasDeTrabajo(1);
    }
}
