
public class Problema1_Terreno_Ejecutor {

    static Problema1_Terreno_clase terreno = new Problema1_Terreno_clase();
    
    static Problema1_Terreno_clase terreno1 = new Problema1_Terreno_clase(2, 3, 4);

    public static void main(String[] args) {
        terreno.setAncho(20);
        terreno.setLargo(30);
        terreno.setValorMetro(500);
       
        terreno.calcularArea();
        terreno.calcularValorTerreno();
        System.out.println(" terreno1 \n" + terreno.toString()+ "\n");
        System.out.println("terreno 2\n"); 
        terreno1.calcularArea();
        terreno1.calcularValorTerreno();
        System.out.println(terreno1.toString());
        

    }
}
