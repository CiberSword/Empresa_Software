package com.poo.practica7.Empleados;


public class PruebaEmpleados {
    public static void main(String[] args){
        Disenador disenador = new Disenador();
        System.out.println("Nombre: " + disenador.getNombre());
        System.out.println("ID: " + disenador.getID());
        System.out.println("Horas de trabajo: " + disenador.getHorasDeTrabajo());

        Desarrollador desarrollador = new Desarrollador("Mark Zuckerberg",1405);
        System.out.println("Horas de trabajo: " + desarrollador.getHorasDeTrabajo());

        Tester tester = new Tester("Elon Musk",2806);
        System.out.println("Horas de trabajo: " + tester.getHorasDeTrabajo());

        LiderProyecto liderProyecto = new LiderProyecto();
        System.out.println("Nombre: " + liderProyecto.getNombre());
        System.out.println("ID: " + liderProyecto.getID());
        System.out.println("Horas de trabajo: " + liderProyecto.getHorasDeTrabajo());
        System.out.println("Veamos como va la producción...");
        liderProyecto.revisarTrabajadores(disenador);
        liderProyecto.revisarTrabajadores(desarrollador);
        liderProyecto.revisarTrabajadores(tester);
        System.out.println("Horas de trabajo: " + liderProyecto.getHorasDeTrabajo());
    }
}
