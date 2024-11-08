package UD1.Hilos.UD1EJ4SimulacionAparcamiento.MODIFICADO;

import java.util.Arrays;

public class Aparcamiento {
    private static final int NUM_PLAZAS = 10;
    private final String[] plazas = new String[NUM_PLAZAS];  // "0" representa plaza vacía

    public Aparcamiento() {
        Arrays.fill(plazas, "X"); // Inicializa todas las plazas como libres ("X")
    }

    public synchronized boolean intentarAparcar(int idConductor) {
        for (int i = 0; i < NUM_PLAZAS; i++) {
            if (plazas[i].equals("X")) {  // Encuentra la primera plaza libre
                plazas[i] = Integer.toString(idConductor);
                System.out.println("Conductor " + idConductor + " aparca en la plaza " + (i + 1) + "\n");
                mostrarEstado();
                return true;
            }
        }
        return false;  // No hay plazas libres
    }

    public synchronized void desocupar(int idConductor) {
        for (int i = 0; i < NUM_PLAZAS; i++) {
            if (plazas[i].equals(Integer.toString(idConductor))) {
                plazas[i] = "X";  // Libera la plaza
                System.out.println("Conductor " + idConductor + " se va de la plaza " + (i + 1) + "\n");
                mostrarEstado();
                break;
            }
        }
    }

    private void mostrarEstado() {
        System.out.println("Estado actual del aparcamiento: " + Arrays.toString(plazas));
    }
}
