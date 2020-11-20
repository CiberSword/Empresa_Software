package com.poo.practica7.Empleados;

import com.poo.practica7.Empleados.*;

public class LiderProyecto extends Empleado{
    Empleado empleado;

    LiderProyecto(){
        nombre = "Naomi";
        ID = 48267;
        this.horasDeTrabajo = 0;
        horasDeTrabajo += trabajar();
    }

    public int trabajar(){
        System.out.println("Hora de trabajar");
        revisarStatusEmpresa();
        pensarEnNuevoPrograma();
        return horasDeTrabajo;
    }

    public void revisarStatusEmpresa(){
        System.out.println("La empresa ha generado 500,000$ durante el último mes...");
        this.horasDeTrabajo += 3;
    }

    public void pensarEnNuevoPrograma(){
        System.out.println("Necesitamos mas ideas para un nuevo programa. Algo que sea innovador. Es hora de un nuevo juego, a trabajar.");
        this.horasDeTrabajo += 2;
    }

    public void revisarTrabajadores(Empleado empleado){
        if (empleado.horasDeTrabajo > 0){
            System.out.println("Excelente trabajo " + empleado.nombre + ", continue trabajando asi.");
        }
        else{
            System.out.println("El dinero no se genera solo " + empleado.nombre + ", pongase a trabajar");
        }
        this.horasDeTrabajo += 1;
    }
}
