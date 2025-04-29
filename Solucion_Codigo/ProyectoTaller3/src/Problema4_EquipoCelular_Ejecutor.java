public class Problema4_EquipoCelular_Ejecutor {
    public static void main(String[] args) {
        Problema4_EquipoCelular_Clase celular1 = new Problema4_EquipoCelular_Clase(
            "Android 14",
            6.5,
            350.00,
            12.0,
            "00:1A:7D:DA:71:13",
            "355689104123456"
        );

        System.out.println("Datos del Equipo Celular:\n");
        System.out.println(celular1.toString());
    }
}
