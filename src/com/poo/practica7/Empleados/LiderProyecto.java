package com.poo.practica7.Empleados;

import com.poo.practica7.Empleados.*;

public class LiderProyecto extends Empleado{
    Empleado empleado;

    LiderProyecto(){
        nombre = "Naomi";
        ID = 48267;
        this.horasDeTrabajo = 0;
        System.out.println(toString());
        horasDeTrabajo += trabajar();

    }

    public String toString(){
        return "\n\nLIDER DEL PROYECTO: " + this.nombre;
    }

    public int trabajar(){
        System.out.println("\t << HORA DE TRABAJAR >> ");
        revisarStatusEmpresa();
        pensarEnNuevoPrograma();
        return horasDeTrabajo;
    }

    public void revisarStatusEmpresa(){
        System.out.println("La empresa ha generado 500,000$ durante el último mes...");
        this.horasDeTrabajo += 3;
    }

    public void pensarEnNuevoPrograma(){
        System.out.println("Necesitamos mas ideas para un nuevo programa, algo que sea innovador. Es hora de un nuevo juego, a trabajar.");
        this.horasDeTrabajo += 2;
    }

    public void revisarTrabajadores(Empleado empleado){
        if (empleado.horasDeTrabajo > 0){
            System.out.println("\tExcelente trabajo " + empleado.nombre + ", continue asi.");
        }
        else{
            System.out.println("El dinero no se genera solo " + empleado.nombre + ", pongase a trabajar");
        }
        this.horasDeTrabajo += 1;
    }
}
