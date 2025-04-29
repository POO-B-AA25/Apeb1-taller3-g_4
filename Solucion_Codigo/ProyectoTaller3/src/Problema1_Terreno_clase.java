
public class Problema1_Terreno_clase {
    public double ancho;
    public double largo;
    public double valorMetro;
    public double area;
    public double costoTerreno;

    public Problema1_Terreno_clase() {
    }

    
    public Problema1_Terreno_clase(double ancho, double largo, double valorMetro) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetro = valorMetro;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setValorMetro(double valorMetro) {
        this.valorMetro = valorMetro;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getValorMetro() {
        return valorMetro;
    }

    public double getArea() {
        return area;
    }

    public double getCostoTerreno() {
        return costoTerreno;
    }
    
    public void calcularArea(){
          area = getAncho()*getLargo();
         
    }
    
    public void calcularValorTerreno(){
        costoTerreno = getValorMetro()*getArea();
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return " ancho = " + this.ancho + "\n largo = " + this.largo + "\n valor metro = " + this.valorMetro + " \n area = " + this.area + " \n costo Terreno = " + this.costoTerreno;
        
    }
    
    
}
