
package com.mycompany.taller3;

import java.time.LocalDate;

public class Problema_9_EmprendimientoEjecutor {

    public static void main(String[] args) {
        // Crear un emprendimiento
        Problema_9_Emprendimiento emprendimiento1 = new Problema_9_Emprendimiento(
                "TechSolutions Loja",
                "1103056894001",
                "Tecnología",
                "Juan Pérez",
                "Calle Bolívar y Sucre",
                LocalDate.of(2018, 5, 15),
                25000.00
        );

        // Mostrar información
        System.out.println(emprendimiento1);

        // Calcular antigüedad
        System.out.println("Antigüedad: " + emprendimiento1.calcularAntiguedad() + " años");

        // Determinar tipo de negocio
        System.out.println("Tipo de negocio: ");
        emprendimiento1.tipoEmprendimiento();

        // Actualizar información
        emprendimiento1.actualizarDatos("TechSolutions Ecuador", "1105033458001", "Educación", "Gonzalo Cuanca", "Av. Eduardo Kigman", LocalDate.of(2022, 6, 15), 34060);
        System.out.println("\nDespués de actualizar:");
        System.out.println(emprendimiento1);
    }

}
