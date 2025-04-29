
package com.mycompany.taller3;


public class Problema_6_Profesor {

    public String nombre;
    public String apellido;
    public double sueldoBasico;
    public String cedula;
    public double sueldoTotal;

    public Problema_6_Profesor() {
    }

    public Problema_6_Profesor(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSueldoToal() {
        return sueldoTotal;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.20);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido:" + apellido + ", Sueldo básico: " + sueldoBasico + ", Cédula: " + cedula + ", Sueldo total: " + sueldoTotal ;
    }

}
