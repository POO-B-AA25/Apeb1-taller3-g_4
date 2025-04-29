public class Problema4_EquipoCelular_Clase {
    public String sistemaOperativo;
    public double tamañoPantalla;
    public double costoInicial;
    public double ivaPorcentaje;
    public double ivaCosto;
    public double costoFinal;
    public String direccionMac;
    public String informacionIMEI;

    // Constructor con parámetros
    public Problema4_EquipoCelular_Clase(String sistemaOperativo, double tamañoPantalla, double costoInicial, double ivaPorcentaje, String direccionMac, String informacionIMEI) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamañoPantalla = tamañoPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMac = direccionMac;
        this.informacionIMEI = informacionIMEI;
        calcularIva();
        calcularCostoFinal();
    }


    public void calcularIva() {
        ivaCosto = (costoInicial * ivaPorcentaje) / 100;
    }

    public void calcularCostoFinal() {
        costoFinal = costoInicial + ivaCosto;
    }

    @Override
    public String toString() {
        return "Sistema Operativo: " + sistemaOperativo +
               "\nTamaño de Pantalla: " + tamañoPantalla + " pulgadas" +
               "\nCosto Inicial: $" + costoInicial +
               "\nIVA (" + ivaPorcentaje + "%): $" + ivaCosto +
               "\nCosto Final: $" + costoFinal +
               "\nDirección MAC: " + direccionMac +
               "\nInformación IMEI: " + informacionIMEI;
    }

}
