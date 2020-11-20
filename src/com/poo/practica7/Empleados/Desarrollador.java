package com.poo.practica7.Empleados;

public class Desarrollador extends Empleado{
    /** Método Constructor **/
    public Desarrollador(String nombre,int ID){
        this.nombre = nombre;
        this.ID = ID;
        horasDeTrabajo = 0;
    }

    /** Método Trabajar **/
    public int trabajar(){
        System.out.println("\t << HORA DE TRABAJAR >> ");
        this.horasDeTrabajo += obtenerLogicaDelPrograma();
        this.horasDeTrabajo += desarrollarCodigo();
        this.horasDeTrabajo += debugearCodigo();
        this.horasDeTrabajo += optimizarCodigo();
        return horasDeTrabajo;
    }

    /** Métodos simulación **/
    private int obtenerLogicaDelPrograma(){
        System.out.println("Investigando definiciones en internet");
        return 3;
    }

    private int desarrollarCodigo(){
        System.out.println("Implementando Hola Mundo");
        return  2;
    }

    private int debugearCodigo(){
        System.out.println("Error encontrado: Falto ;");
        return 4;
    }

    private int optimizarCodigo(){
        System.out.println("Eliminando 50 renglones vacios y 4 variables sin usar");
        return 1;
    }

    /** Sobrescritura de toString **/
    public String toString(){
        return "\nDesarrolador: " + this.nombre;
    }
}
