package com.poo.practica7.Empleados;

import com.poo.practica7.Empleados.Empleado;

public class Disenador extends Empleado{

    Disenador(){
        nombre = "Alfredo";
        ID = 1234;
        horasDeTrabajo = 0;
        System.out.println(toString());
        this.horasDeTrabajo += trabajar();
    }

    public String toString(){
        return "\n\nDISEÑADOR: " + this.nombre;
    }

    public int trabajar(){
        System.out.println("\t << HORA DE TRABAJAR >> ");
        investigarDisenos();
        pensarEnDisenos();
        establecerColores();
        dibujar();
        establecerNuevoSlogan();
        return horasDeTrabajo;
    }

    public void investigarDisenos(){
        System.out.println("Investigando diseños");
        this.horasDeTrabajo += 1;
    }

    public void pensarEnDisenos(){
        System.out.println("Imaginando un nuevo diseño");
        this.horasDeTrabajo += 2;
    }

    public void establecerColores(){
        System.out.println("El color perfecto para este diseño es...");
        this.horasDeTrabajo += 1;
    }

    public void dibujar(){
        System.out.println("Este diseño será el mejor de todos");
        this.horasDeTrabajo += 5;
    }

    public void establecerNuevoSlogan(){
        System.out.println("Nuevo Slogan: \"Imaginalo y hazlo\"");
        this.horasDeTrabajo += 1;
    }
}
