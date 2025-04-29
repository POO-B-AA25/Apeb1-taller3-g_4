/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author USUARIO
 */
public class Problema_9_Emprendimiento {

    private String nombreEmprendimiento;
    private String ruc;
    private String sectorEconomico;
    private String propietario;
    private String ubicacion;
    private LocalDate fechaInicioActividad;
    private double capitalInicial;

    public Problema_9_Emprendimiento() {
    }

    public Problema_9_Emprendimiento(String nombreEmprendimiento, String ruc, String sectorEconomico, String propietario, String ubicacion, LocalDate fechaInicioActividad, double capitalInicial) {
        this.nombreEmprendimiento = nombreEmprendimiento;
        this.ruc = ruc;
        this.sectorEconomico = sectorEconomico;
        this.propietario = propietario;
        this.ubicacion = ubicacion;
        this.fechaInicioActividad = fechaInicioActividad;
        this.capitalInicial = capitalInicial;
    }

    public String getNombreEmprendimiento() {
        return nombreEmprendimiento;
    }

    public void setNombreEmprendimiento(String nombreEmprendimiento) {
        this.nombreEmprendimiento = nombreEmprendimiento;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getSectorEconomico() {
        return sectorEconomico;
    }

    public void setSectorEconomico(String sectorEconomico) {
        this.sectorEconomico = sectorEconomico;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LocalDate getFechaInicioActividad() {
        return fechaInicioActividad;
    }

    public void setFechaInicioActividad(LocalDate fechaInicioActividad) {
        this.fechaInicioActividad = fechaInicioActividad;
    }

    public double getCapitalInicial() {
        return capitalInicial;
    }

    public void setCapitalInicial(double capitalInicial) {
        this.capitalInicial = capitalInicial;
    }

    public void actualizarDatos(String nombreEmprendimiento, String ruc, String sectorEconomico, String propietario, String ubicacion, LocalDate fechaInicioActividad, double capitalInicial) {
        if (nombreEmprendimiento != null && !nombreEmprendimiento.isEmpty()) {
            this.nombreEmprendimiento = nombreEmprendimiento;
        }
        if (ruc != null && !ruc.isEmpty()) {
            this.ruc = ruc;
        }
        if (sectorEconomico != null && !sectorEconomico.isEmpty()) {
            this.sectorEconomico = sectorEconomico;
        }
        if (propietario != null && !propietario.isEmpty()) {
            this.propietario = propietario;
        }
        if (ubicacion != null && !ubicacion.isEmpty()) {
            this.ubicacion = ubicacion;
        }
        if (fechaInicioActividad != null) {
            this.fechaInicioActividad = fechaInicioActividad;
        }
        if (capitalInicial != 0) {
            this.capitalInicial = capitalInicial;
        }
    }

    public int calcularAntiguedad() {
        LocalDate hoy = LocalDate.now();
        return Period.between(fechaInicioActividad, hoy).getYears();
    }

    public void tipoEmprendimiento() {
        if (capitalInicial < 10000) {
            System.out.println("Micro emprendimiento");
        } else {
            if (capitalInicial >= 1000 && capitalInicial > 50000) {
                System.out.println("Pequeño emprendimiento");
            } else {
                System.out.println("Mediano emprendimiento");
            }
        }
    }

    @Override
    public String toString() {
        return "Problema_9_Emprendimiento{" + "nombreEmprendimiento=" + nombreEmprendimiento + ", ruc=" + ruc + ", sectorEconomico=" + sectorEconomico + ", propietario=" + propietario + ", ubicacion=" + ubicacion + ", fechaInicioActividad=" + fechaInicioActividad + ", capitalInicial=" + capitalInicial + '}';
    }

}
