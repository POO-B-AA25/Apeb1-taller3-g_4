
package com.mycompany.taller3;

import java.util.concurrent.ThreadLocalRandom;

public class Problema_5_RecordEstudianteEjecutor {

    static Problema_5_RecordEstudiante recordEestudiante1 = new Problema_5_RecordEstudiante();

    public static void main(String[] args) {
        recordEestudiante1.setNombreEstudinte("Jose Rivas");
        recordEestudiante1.setCalMat1(ThreadLocalRandom.current().nextDouble(0.0,10.0));
        recordEestudiante1.setCalMat2(ThreadLocalRandom.current().nextDouble(0.0,10.0));
        recordEestudiante1.setCalMat3(ThreadLocalRandom.current().nextDouble(0.0,10.0));
        recordEestudiante1.getPromedio();
        recordEestudiante1.determinarEstado();
        System.out.println(recordEestudiante1);

    }
}
