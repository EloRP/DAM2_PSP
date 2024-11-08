package UD1.Hilos.UD1EJ4SimulacionAparcamiento.ORIGINAL;

import java.util.Random;

public class Coche extends Thread {
    int numCoche;
    Aparcamiento aparcamiento;
    static final int TIEMPO_APARCAMIENTO = 5000;
    private Random random = new Random();
    boolean haAparcado = false;

    public Coche(int numCoche, Aparcamiento aparcamiento) {
        super();
        this.numCoche = numCoche;
        this.aparcamiento = aparcamiento;
        haAparcado = false;
    }

    @Override
    public String toString() {
        return String.valueOf(numCoche);
    }

    public void run() {
        while (!haAparcado) {
            int plazaPorOcupar = random.nextInt(aparcamiento.length());
            if (aparcamiento.aparcar(plazaPorOcupar)) {
                System.out.println("Coche " + numCoche + " aparcado");
                haAparcado = true;
                try {
                    Thread.sleep(random.nextInt(TIEMPO_APARCAMIENTO));
                    aparcamiento.salir(plazaPorOcupar);
                    System.out.println("Coche " + numCoche + " saliendo");
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
