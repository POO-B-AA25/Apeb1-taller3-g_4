
package com.mycompany.taller3;


public class Problema_5_RecordEstudiante {

    public String nombreEstudiante;
    public double calMat1;
    public double calMat2;
    public double calMat3;
    public double promedio;
    public String estado;

    public Problema_5_RecordEstudiante() {
    }

    public Problema_5_RecordEstudiante(String nombreEstadiante, double calMat1, double calMat2, double calMat3) {
        this.nombreEstudiante = nombreEstadiante;
        this.calMat1 = calMat1;
        this.calMat2 = calMat2;
        this.calMat3 = calMat3;
    }

    public String getNombreEstudinte() {
        return nombreEstudiante;
    }

    public void setNombreEstudinte(String nombreEstudinte) {
        this.nombreEstudiante = nombreEstudinte;
    }

    public double getCalMat1() {
        return calMat1;
    }

    public void setCalMat1(double calMat1) {
        this.calMat1 = calMat1;
    }

    public double getCalMat2() {
        return calMat2;
    }

    public void setCalMat2(double calMat2) {
        this.calMat2 = calMat2;
    }

    public double getCalMat3() {
        return calMat3;
    }

    public void setCalMat3(double calMat3) {
        this.calMat3 = calMat3;
    }

    public double getPromedio() {
        promedio = (calMat1 + calMat2 + calMat3) / 3;
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void determinarEstado() {
        if (promedio >= 6.5) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
    }

    @Override
    public String toString() {
        return "Record Estudiante\n" + "Nombre estudiante = "
                + nombreEstudiante + ",\n Calificacion materia 1 = "
                + calMat1 + ",\n Calificacion materia 2 = "
                + calMat2 + ", \n Calificacion materia 3 = "
                + calMat3 + ", \n Promedio = " + promedio + ", \n Estado = " + estado;
    }

}
