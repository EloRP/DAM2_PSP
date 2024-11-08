package UD1.Hilos.UD1EJ5LlegaElJefe.ORIGINAL;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Oficina oficina = new Oficina();
        final int NUM_EMPLEADOS = 10;
        int cuandoLlegaElJefe = new Random().nextInt(NUM_EMPLEADOS + 1);

        for (int i = 0; i <= NUM_EMPLEADOS; i++) {
            if (cuandoLlegaElJefe == i) {
                new Jefe(oficina).start();
            } else {
                new Empleado(oficina, "Empleado " + ((i < cuandoLlegaElJefe) ? i : i - 1)).start();
            }
        }

    }

}
