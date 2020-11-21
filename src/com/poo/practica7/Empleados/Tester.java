package com.poo.practica7.Empleados;

public class Tester extends Empleado {
    /** Método Constructor **/
    public Tester(String nombre,int ID){
        super(nombre,ID,0);
        System.out.println(toString());
        setHorasDeTrabajo(trabajar());
    }

    /** Sobrescritura método toString **/
    public String toString(){
        return "\nTESTER: " + getNombre();
    }

    /** Método Trabajar **/
    public int trabajar(){
        int horasJornada = 0;
        System.out.println("\t << HORA DE TRABAJAR >> ");
        horasJornada  += correrPrograma();
        horasJornada  += testearInterfaz();
        horasJornada  += encontrarBugs();
        horasJornada  += reportarDescubrimientos();
        return horasJornada ;
    }

    /** Métodos Simulación **/
    private int correrPrograma(){
        System.out.println("Esperando a que el programa cargue");
        return 1;
    }

    private int testearInterfaz(){
        System.out.println("¿Qué tan intuituvo es para el usuario? ¿Comó se puede mejorar?");
        return 2;
    }

    private int encontrarBugs(){
        System.out.println("Bug encontrado, registrandolo en la bitacora");
        return 5;
    }

    private int reportarDescubrimientos(){
        System.out.println("Se finalizo el testeo, se encontraron 4 bugs");
        return 2;
    }

}
