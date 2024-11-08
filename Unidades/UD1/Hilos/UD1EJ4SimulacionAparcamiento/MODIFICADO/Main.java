package UD1.Hilos.UD1EJ4SimulacionAparcamiento.MODIFICADO;

public class Main {
    private static final int NUM_CONDUCTORES = 50;

    public static void main(String[] args) {
        Aparcamiento aparcamiento = new Aparcamiento();
        for (int i = 1; i <= NUM_CONDUCTORES; i++) {
            new Coche(i, aparcamiento).start();
        }
        System.out.println("\nFin de la simulación.");
    }
}