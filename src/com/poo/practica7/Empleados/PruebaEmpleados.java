package com.poo.practica7.Empleados;

public class PruebaEmpleados {
    public static void main(String[] args){
        Disenador disenador = new Disenador();
        System.out.println("Horas de trabajo: " + disenador.horasDeTrabajo);

        Desarrollador desarrollador = new Desarrollador("Mark Zuckerberg",1405);
        System.out.println("Horas de trabajo: " + desarrollador.horasDeTrabajo);

        Tester tester = new Tester("Elon Musk",2806);
        System.out.println("Horas de trabajo: " + tester.horasDeTrabajo);

        LiderProyecto liderProyecto = new LiderProyecto();
        System.out.println("Veamos como va la producción...");
        liderProyecto.revisarTrabajadores(disenador);
        liderProyecto.revisarTrabajadores(desarrollador);
        liderProyecto.revisarTrabajadores(tester);
    }
}
