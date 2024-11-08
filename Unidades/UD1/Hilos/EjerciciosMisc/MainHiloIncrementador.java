package UD1.Hilos.EjerciciosMisc;

public class MainHiloIncrementador extends Thread {

    public static void main(String[] args) {
        final int NUMHILOS = 10;

        HiloIncrementador[] hilos = new HiloIncrementador[NUMHILOS];

        for (int i = 0; i < NUMHILOS; i++) {
            HiloIncrementador hilo = new HiloIncrementador("hilo" + i);
            hilo.start();
            hilos[i] = hilo;
        }

        for (HiloIncrementador hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(HiloIncrementador.n);
    }
}
