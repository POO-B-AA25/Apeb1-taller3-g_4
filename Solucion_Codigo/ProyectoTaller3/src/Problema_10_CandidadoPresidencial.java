
package com.mycompany.taller3;

public class Problema_10_CandidadoPresidencial {

    public String nombre;
    public int edad;
    public String partidoPolitico;
    public String planGobierno;
    public int numPropuestasClave;

    /**
     *
     */
    public Problema_10_CandidadoPresidencial() {
    }

    public Problema_10_CandidadoPresidencial(String nombre, String partidoPolitico) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
    }

    public Problema_10_CandidadoPresidencial(String nombre, int edad, String partidoPolitico, String planGobierno, int numPropuestasClave) {
        this.nombre = nombre;
        this.edad = edad;
        this.partidoPolitico = partidoPolitico;
        this.planGobierno = planGobierno;
        this.numPropuestasClave = numPropuestasClave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getPlanGobierno() {
        return planGobierno;
    }

    public void setPlanGobierno(String planGobierno) {
        this.planGobierno = planGobierno;
    }

    public int getNumPropuestasClave() {
        return numPropuestasClave;
    }

    public void setNumPropuestasClave(int numPropuestasClave) {
        this.numPropuestasClave = numPropuestasClave;
    }

    public void modificarInformacion(Problema_10_CandidadoPresidencial candidato) {
        if (candidato.getNombre() != null && !candidato.getNombre().isEmpty()) {
            nombre = candidato.getNombre();
        }
        if (candidato.getEdad() != 0) {
            edad = candidato.getEdad();
        }

        if (candidato.getPlanGobierno() != null && !candidato.getPlanGobierno().isEmpty()) {
            planGobierno = candidato.getPlanGobierno();
        }
        if (candidato.getPartidoPolitico() != null && !candidato.getPartidoPolitico().isEmpty()) {
            partidoPolitico = candidato.getPartidoPolitico();
        }

        if (candidato.getEdad() != 0) {
            numPropuestasClave = candidato.getNumPropuestasClave();
        }
    }

    public void cumpleRequisito() {
        if (edad >= 35) {
            System.out.println("Cumple requisitos");
        } else {
            System.out.println("No cumple edad mínima");
        }

    }

    @Override
    public String toString() {
        return "\nNombre= " + nombre + ", \nEdad= " + edad + ", \nPartido político=" + partidoPolitico + ", \nPlan gobierno=" + planGobierno + ", \nNum propuestas clave=" + numPropuestasClave;
    }

}
