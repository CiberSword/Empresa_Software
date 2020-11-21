package com.poo.practica7.Empleados;

public class LiderProyecto extends Empleado{
    Empleado empleado;

    LiderProyecto(){
        setNombre("Scarlet Johanson");
        setID(48267);
        setHorasDeTrabajo(0);
        System.out.println(toString());
        setHorasDeTrabajo(trabajar());

    }

    public String toString(){

        return "\n\nLIDER DEL PROYECTO: " + getNombre();
    }

    public int trabajar(){
        System.out.println("\t << HORA DE TRABAJAR >> ");
        revisarStatusEmpresa();
        pensarEnNuevoPrograma();
        return getHorasDeTrabajo();
    }

    public void revisarStatusEmpresa(){
        System.out.println("La empresa ha generado 500,000$ durante el último mes...");
        setHorasDeTrabajo(3);
    }

    public void pensarEnNuevoPrograma(){
        System.out.println("Necesitamos mas ideas para un nuevo programa, algo que sea innovador. Es hora de un nuevo juego, a trabajar.");
        setHorasDeTrabajo(2);
    }

    public void revisarTrabajadores(Empleado empleado){
        if (empleado.getHorasDeTrabajo() > 0){
            System.out.println("\tExcelente trabajo " + empleado.getNombre() + ", continue asi.");
        }
        else{
            System.out.println("El dinero no se genera solo " + empleado.getNombre() + ", pongase a trabajar");
        }
        setHorasDeTrabajo(1);
    }
}
