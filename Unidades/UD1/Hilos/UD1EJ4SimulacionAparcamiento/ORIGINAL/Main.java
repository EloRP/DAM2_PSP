package UD1.Hilos.UD1EJ4SimulacionAparcamiento.ORIGINAL;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final int NUM_PLAZAS = 10;
        final int NUM_COCHES = 50;

        Coche[] coches = new Coche[NUM_COCHES];
        Aparcamiento aparcamiento = new Aparcamiento(NUM_PLAZAS);

        for (int i = 0; i < NUM_COCHES; i++) {
            Coche coche = new Coche(i + 1, aparcamiento);
            coche.start();
            coches[i] = coche;
        }

        for (Coche coche : coches) {
            coche.join();
        }
    }
}
