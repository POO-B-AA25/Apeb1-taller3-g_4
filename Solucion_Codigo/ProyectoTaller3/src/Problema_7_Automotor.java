
package com.mycompany.taller3;

public class Problema_7_Automotor {

    public String cedulaDuenio;
    public String marcaVahiculo;
    public int anioFabricacion;
    public double valorVehiculo;
    public double valorMatricula;

    public Problema_7_Automotor() {
    }

    public Problema_7_Automotor(String cedulaDuenio, String marcaVahiculo, int anioFabricacion, double valorVehiculo) {
        this.cedulaDuenio = cedulaDuenio;
        this.marcaVahiculo = marcaVahiculo;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
    }

    public String getCedulaDuenio() {
        return cedulaDuenio;
    }

    public void setCedulaDuenio(String cedulaDuenio) {
        this.cedulaDuenio = cedulaDuenio;
    }

    public String getMarcaVahiculo() {
        return marcaVahiculo;
    }

    public void setMarcaVahiculo(String marcaVahiculo) {
        this.marcaVahiculo = marcaVahiculo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(double valorMatricula) {
        this.valorMatricula = valorMatricula;
    }
    
    
    public void calcularValorMatricula(){
        valorMatricula = (valorVehiculo * 0.002) * (2025-anioFabricacion);
    }

    @Override
    public String toString() {
        return "Cédula dueño=" + cedulaDuenio + ", Marca vehículo=" + marcaVahiculo + ", Año fabricacion=" + anioFabricacion + ", Valor vehículo=" + valorVehiculo + ", Valor matrícula=" + valorMatricula;
    }
    
    
    
    

}
