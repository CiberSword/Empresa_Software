package com.poo.practica7.Empleados;

public class LiderProyecto extends Empleado{

    LiderProyecto(){
        nombre = "Naomi";
        ID = 48267;
        this.horasDeTrabajo = 0;
        horasDeTrabajo += trabajar();
    }

    public int trabajar(){
        System.out.println("Hora de trabajar");
        if (this.horasDeTrabajo < 8) {
            revisarStatusEmpresa(this.horasDeTrabajo);
        }
        return horasDeTrabajo;
    }

    public void revisarStatusEmpresa(int horasDeTrabajo){
        System.out.println("La empresa ha generado 500,000$ durante el último mes");
        this.horasDeTrabajo += 3;
    }


}
