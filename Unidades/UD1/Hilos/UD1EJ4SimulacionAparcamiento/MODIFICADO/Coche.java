package UD1.Hilos.UD1EJ4SimulacionAparcamiento.MODIFICADO;

import java.util.Random;

public class Coche extends Thread {
        private static final Random random = new Random();
        private final int idConductor;
        private final Aparcamiento aparcamiento;
    
        public Coche(int idConductor, Aparcamiento aparcamiento) {
            this.idConductor = idConductor;
            this.aparcamiento = aparcamiento;
        }
    
        @Override
        public void run() {
            while (!aparcamiento.intentarAparcar(idConductor)) {
                try {
                    Thread.sleep(500); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            try {
                int tiempoAparcado = 1 + random.nextInt(5);
                Thread.sleep(tiempoAparcado * 1000L);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            aparcamiento.desocupar(idConductor);
        }
    }
