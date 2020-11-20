package com.poo.practica7.Empleados;

public class PruebaEmpleados {
    public static void main(String[] args){
        Disenador disenador = new Disenador();
        System.out.println("Horas de trabajo: " + disenador.horasDeTrabajo);

        LiderProyecto liderProyecto = new LiderProyecto();
        System.out.println("Veamos como va la producción...");
        liderProyecto.revisarTrabajadores(disenador);
    }
}
