import java.util.Scanner;
public class Problema3_InstitucionesEducativas_Ejecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el nombre de la institución: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Ingrese el tipo de institución (Ej: Pública, Privada): ");
        String tipoInstitucion = entrada.nextLine();
        
        System.out.print("Ingrese el número de alumnos: ");
        int numeroAlumnos = entrada.nextInt();
        
        System.out.print("Ingrese el número de docentes: ");
        int numeroDocentes = entrada.nextInt();
        
        System.out.print("Ingrese el número de sedes: ");
        int numeroSedes = entrada.nextInt();
        
        System.out.print("Ingrese el gasto proyectado por estudiante: ");
        double gastoPorEstudiante = entrada.nextDouble();

        // Crear objeto y realizar cálculo
        Problema3_InstitucionesEducativas_Clase institucion = new Problema3_InstitucionesEducativas_Clase(
            nombre, tipoInstitucion, numeroAlumnos, numeroDocentes, numeroSedes, gastoPorEstudiante
        );
        institucion.calcularPresupuesto();

        // Mostrar resultados
        System.out.println("\nInformación de la Institución:");
        System.out.println(institucion.toString());
    }
}

