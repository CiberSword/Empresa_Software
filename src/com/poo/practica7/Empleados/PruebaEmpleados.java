package com.poo.practica7.Empleados;

public class PruebaEmpleados {
    public static void main(String[] args){
        Diseñador diseñador = new Diseñador();
        System.out.println("Horas de trabajo: " + diseñador.horasDeTrabajo);

        LiderProyecto liderProyecto = new LiderProyecto();
        liderProyecto.revisarTrabajadores(diseñador);
    }
}
