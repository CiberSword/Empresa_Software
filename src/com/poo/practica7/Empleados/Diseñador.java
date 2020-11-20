package com.poo.practica7.Empleados;

import com.poo.practica7.Empleados.Empleado;

public class Diseñador extends Empleado{

    Diseñador(){
        nombre = "Alfredo";
        ID = 1234;
        horasDeTrabajo = 0;
        trabajar();
    }

    public int trabajar(){
        System.out.println("Hora de trabajar");
        horasDeTrabajo += investigarDiseños();
        horasDeTrabajo += pensarEnDiseños();
        horasDeTrabajo += establecerColores();
        horasDeTrabajo += dibujar();
        return horasDeTrabajo;
    }

    public int investigarDiseños(){
        System.out.println("Investigando diseños");
        return 1;
    }

    public int pensarEnDiseños(){
        System.out.println("Imaginando un nuevo diseño");
        return 2;
    }

    public int establecerColores(){
        System.out.println("El color perfecto para este diseño es...");
        return 1;
    }

    public int dibujar(){
        System.out.println("Este diseño será el mejor de todos");
        return 5;
    }

    public int establecerNuevoSlogan(){
        System.out.println("Imaginalo y hazlo");
    }
}
