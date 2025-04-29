
package com.mycompany.taller3;


public class Problema_10_CandidadoPresidencialEjecutor {

    static Problema_10_CandidadoPresidencial candidadtPresidencial1 = new Problema_10_CandidadoPresidencial();
    static Problema_10_CandidadoPresidencial candidatoPresidencial2 = new Problema_10_CandidadoPresidencial("Maritza Campos", "PSC");
    static Problema_10_CandidadoPresidencial candidatoPresidencial3 = new Problema_10_CandidadoPresidencial("Fernando Villareal", 45, "ARE", "Ecuador en progreso", 23);

    public static void main(String[] args) {
        candidadtPresidencial1.setNombre("Daniel Noboa");
        candidadtPresidencial1.setEdad(37);
        candidadtPresidencial1.setNumPropuestasClave(20);
        candidadtPresidencial1.setPartidoPolitico("ADN");
        candidadtPresidencial1.setPlanGobierno("Ecuador del Futuro");
        System.out.println("\nCandidato 1:  " + candidadtPresidencial1);
        candidadtPresidencial1.cumpleRequisito();

        System.out.println("\nCandidato 2: ");
        candidatoPresidencial2.setEdad(34);
        candidatoPresidencial2.setNumPropuestasClave(10);
        candidatoPresidencial2.setPartidoPolitico("RC34");
        candidatoPresidencial2.setPlanGobierno("Ecuador adelante");
        System.out.println(candidatoPresidencial2);
        candidatoPresidencial2.cumpleRequisito();

        System.out.println("\nCandidato 3:");
        System.out.println(candidatoPresidencial3);
        candidatoPresidencial3.cumpleRequisito();

        //Para modificar datos se lo pude hacer con los mismos set de los atributos
        //Tambien se creo un metodo, para ello se crea un nuevo objeto de ejemplo:
        Problema_10_CandidadoPresidencial cantidadoActualizar = new Problema_10_CandidadoPresidencial("Antonio Santander", "AGP");
        candidadtPresidencial1.modificarInformacion(cantidadoActualizar);
        System.out.println("\nCandidado actualizado: " + candidadtPresidencial1);
        //para obtener mostrar los datos se utiliza el toString()
        

    }
}
