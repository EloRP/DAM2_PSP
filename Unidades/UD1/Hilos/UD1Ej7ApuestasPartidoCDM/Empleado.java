package UD1.Hilos.UD1Ej7ApuestasPartidoCDM;

import java.util.Random;

public class Empleado extends Thread {
    final int NUM_APUESTAS_EMPLEADO = 5;
    Porra porra;
    int numEmpleado;

    public Empleado(int numEmpleado, Porra porra) {
        this.numEmpleado = numEmpleado;
        this.porra = porra;

    }

    @Override
    public void run() {
        porra.leerImporte();
        try {
            Thread.sleep(new Random().nextInt(300));
        } catch (InterruptedException e) {
            System.out.println("Se ha interrumpido el hilo.");
        }
        for (int i = 0; i < NUM_APUESTAS_EMPLEADO; i++) {
            porra.incrementarApuesta();
        }
    }

}
