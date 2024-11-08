package UD1.Hilos.UD1EJ5LlegaElJefe.ORIGINAL;

import java.util.Random;

public class Jefe extends Thread {
    boolean llego = false;
    Random random = new Random();
    private Oficina oficina;

    public Jefe(Oficina oficina) {
        this.oficina = oficina;
    }

    @Override
    public void run() {
        oficina.llegaJefe();
    }
}


