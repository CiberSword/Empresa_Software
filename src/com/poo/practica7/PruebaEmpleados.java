package com.poo.practica7;

import com.poo.practica7.Empleados.*;

public class PruebaEmpleados {
    public static void main(String[] args) {
        Disenador disenador = new Disenador("Alfredo Ramirez Torres", 1234);
        System.out.println("Horas de trabajo: " + disenador.getHorasDeTrabajo());

        Desarrollador desarrollador = new Desarrollador("Mark Zuckerberg", 1405);
        System.out.println("Horas de trabajo: " + desarrollador.getHorasDeTrabajo());

        Tester tester = new Tester("Elon Musk", 2806);
        System.out.println("Horas de trabajo: " + tester.getHorasDeTrabajo());

        LiderProyecto liderProyecto = new LiderProyecto("Andrea Garcia Garcia", 48267);
        System.out.println("Veamos como va la producción...");
        liderProyecto.revisarTrabajadores(disenador);
        liderProyecto.revisarTrabajadores(desarrollador);
        liderProyecto.revisarTrabajadores(tester);
        System.out.println("Horas de trabajo: " + liderProyecto.getHorasDeTrabajo());

        Administrador admin = new Administrador("Fernando Ramirez Pinales", 3421);
        System.out.println("Horas de trabajo: " + admin.getHorasDeTrabajo());
        System.out.println("\nEs hora de pagar a los empleados...");
        admin.pagarNomina(disenador);
        admin.pagarNomina(desarrollador);
        admin.pagarNomina(tester);
        admin.pagarNomina(liderProyecto);
        admin.pagarNomina(admin);
        System.out.println("Salarios de la semana: \nDisenador: " + disenador.getSalario() + "\nDesarrollador:" +
                desarrollador.getSalario() + "\nTester:" + tester.getSalario() + "\nLider del proyecto: " +
                liderProyecto.getSalario() + "\nAdministrador: " + admin.getSalario());
    }
}
