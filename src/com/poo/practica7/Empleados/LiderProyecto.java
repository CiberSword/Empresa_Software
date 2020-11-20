package com.poo.practica7.Empleados;

public class LiderProyecto extends Empleado{

    LiderProyecto(){
        nombre = "Naomi";
        ID = 48267;
        horasDeTrabajo = 0;
        if (horasDeTrabajo < 8){
            horasDeTrabajo += trabajar();
        }
    }

    public int trabajar(){
        System.out.println("Hora de trabajar");
        revisarStatusEmpresa(horasDeTrabajo);

        return horasDeTrabajo;
    }

    public void revisarStatusEmpresa(int horasDeTrabajo){
        System.out.println("La empresa ha generado 500,000$ durante el último mes");
        this.horasDeTrabajo += 3;
    }
}
