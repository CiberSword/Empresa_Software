package com.poo.practica7.Empleados;

import com.poo.practica7.Empleados.Empleado;

public class Diseñador extends Empleado{

    Diseñador(){
        nombre = "Alfredo";
        ID = 1234;
        horasDeTrabajo = 0;
    }

    public int trabajar(){
        System.out.println("Hora de trabajar");
        horasDeTrabajo += pensarEnDiseños();

    }

    public int pensarEnDiseños(){
        System.out.println("Imaginando un nuevo diseño");
        return 1;
    }

    public int establecerColores(){
        System.out.println("El color perfecto para este diseño es...");
        return 2;
    }

    public int dibujar(){
        

    }
}
