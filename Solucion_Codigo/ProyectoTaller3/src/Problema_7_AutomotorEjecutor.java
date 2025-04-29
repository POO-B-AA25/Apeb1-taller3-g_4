
package com.mycompany.taller3;

public class Problema_7_AutomotorEjecutor {

    static Problema_7_Automotor automotor1 = new Problema_7_Automotor();
    static Problema_7_Automotor automotor2 = new Problema_7_Automotor("1900346789", "Chevrolet", 200, 11000);

    public static void main(String[] args) {
        automotor1.setCedulaDuenio("1104433789");
        automotor1.setMarcaVahiculo("Mazda");
        automotor1.setAnioFabricacion(2013);
        automotor1.setValorVehiculo(7500);
        automotor1.calcularValorMatricula();
        System.out.println("Automotor 1 \n" + automotor1);
        System.out.println("Automotor 2");
        automotor2.calcularValorMatricula();
        System.out.println(automotor2);
        

    }

}
