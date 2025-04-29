
package com.mycompany.taller3;


public class Problema_6_Profesor_Ejecutor {

    static Problema_6_Profesor profesor1 = new Problema_6_Profesor();
    static Problema_6_Profesor profesor2 = new Problema_6_Profesor("José Antonio", "Rivera Castillo", 470, "1900456789");

    public static void main(String[] args) {
        profesor1.setNombre("Ana María");
        profesor1.setApellido("Polo Carrazco");
        profesor1.setSueldoBasico(840);
        profesor1.setCedula("11040552278");
        profesor1.calcularSueldoTotal();
        System.out.println("Profesor 1 \n "+ profesor1);
        System.out.println("Profesor 2");
        profesor2.calcularSueldoTotal();
        System.out.println(profesor2.toString());
    }
}
