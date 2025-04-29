
package com.mycompany.taller3;


public class Problema_8_Cheque {

    public String nombreCliente = "";
    public String nombreBanco = "";
    public double valorCheque = 0;
    public double comisionBanco = 0;

    public Problema_8_Cheque() {
    }

    public Problema_8_Cheque(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public double getValorChque() {
        return valorCheque;
    }

    public void setValorChque(double valorChque) {
        this.valorCheque = valorChque;
    }

    public double getComisionBanco() {
        return comisionBanco;
    }

    public void setComisionBanco(double comisionBanco) {
        this.comisionBanco = comisionBanco;
    }

    public void calcularComisionBanco() {
        comisionBanco = valorCheque * 0.003;
    }

    @Override
    public String toString() {
        return "Nombre cliente:  " + nombreCliente + ", Nombre banco: " + nombreBanco + ", Valor cheque: " + valorCheque + ", Comision banco:" + comisionBanco;
    }

}
