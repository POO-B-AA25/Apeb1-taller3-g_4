package com.mycompany.taller3;


import com.mycompany.taller3.Problema_8_Cheque;

public class Problema_8_Cheque_Ejecutor {

    static Problema_8_Cheque cheque1 = new Problema_8_Cheque();

    static Problema_8_Cheque cheque2 = new Problema_8_Cheque("María Rojas", "Banco de Loja", 8000);

    public static void main(String[] args) {
        cheque1.setNombreCliente("Marco Torres");
        cheque1.setNombreBanco("Mutualista Pichincha");
        cheque1.setValorChque(3800);
        cheque1.calcularComisionBanco();
        System.out.println("Cheque 1: " + cheque1);
        cheque2.calcularComisionBanco();
        System.out.println("Cheque 2: " + cheque2);

    }

}
