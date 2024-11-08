package UD1.Hilos.EjerciciosMisc;

import java.util.Random;

public class HiloIncrementador extends Thread {
    public HiloIncrementador(String nombre) {
        super(nombre);
    }

    static int n = 0;

    public void run() {
        final int NUMINCREMENTOS = 10;
        for (int i = 0; i < NUMINCREMENTOS; i++) {
            int temp = n;
            try {
                Thread.sleep(new Random().nextInt(200, 400));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            n = temp + 1;
        }
    }
}
