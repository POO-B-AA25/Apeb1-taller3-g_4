public class Problema_2EquivalenteHora_Clase {
    public int horas;
    public int minutos;
    public int segundos;
    public double dias;

    // Constructor por defecto
    public Problema_2EquivalenteHora_Clase() {
        horas = 0;
        minutos = 0;
        segundos = 0;
        dias = 0.0;
    }

    // Constructor con parámetros
    public Problema_2EquivalenteHora_Clase(int horas) {
        this.horas = horas;
        calcularEquivalencias();
    }

    // Método privado para cálculos
    private void calcularEquivalencias() {
        minutos = horas * 60;
        segundos = horas * 3600;
        dias = horas / 24.0;
    }

    // Método toString
    @Override
    public String toString() {
        return "Horas: " + horas +
               "\nMinutos: " + minutos +
               "\nSegundos: " + segundos +
               "\nDías: " + String.format("%.2f", dias);
    }
}
