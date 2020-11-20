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
            revisarStatusEmpresa();
        }
        return horasDeTrabajo;
    }

    public void revisarStatusEmpresa(){
        System.out.println("La empresa ha generado 500,000$ durante el último mes");
        this.horasDeTrabajo += 3;
    }

    public void pensarEnNuevoPrograma(int horasDeTrabajo){
        System.out.println("Necesitamos mas ideas para un nuevo programa. Algo que sea innovador.");
        this.horasDeTrabajo += 2;
    }


}
