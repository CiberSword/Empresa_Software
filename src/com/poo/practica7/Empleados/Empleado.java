package com.poo.practica7.Empleados;

public abstract class Empleado {
    private String nombre;
    private int ID;
    private double salario;
    private int horasDeTrabajo;

    public Empleado(String nombre, int ID, double salario, int horasDeTrabajo) {
        this.nombre = nombre;
        this.ID = ID;
        this.salario = salario;
        this.horasDeTrabajo = horasDeTrabajo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHorasDeTrabajo() {
        return horasDeTrabajo;
    }

    public void setHorasDeTrabajo(int horasDeTrabajo) {
        this.horasDeTrabajo = horasDeTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int trabajar();
}
