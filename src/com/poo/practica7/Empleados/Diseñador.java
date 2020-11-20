package com.poo.practica7.Empleados;

import com.poo.practica7.Empleados.Empleado;

public class Diseñador extends Empleado{

    Diseñador(){
        nombre = "Alfredo";
        ID = 1234;
        horasDeTrabajo = 0;
        this.horasDeTrabajo += trabajar();
    }

    public int trabajar(){
        System.out.println("Hora de trabajar");
        investigarDiseños();
        pensarEnDiseños();
        establecerColores();
        dibujar();
        establecerNuevoSlogan();
        return horasDeTrabajo;
    }

    public void investigarDiseños(){
        System.out.println("Investigando diseños");
        this.horasDeTrabajo += 1;
    }

    public void pensarEnDiseños(){
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
