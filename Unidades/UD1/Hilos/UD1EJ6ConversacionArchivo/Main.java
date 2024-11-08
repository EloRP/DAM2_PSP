package UD1.Hilos.UD1EJ6ConversacionArchivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        final int NUMHILOS = 2;
        Hilo[] hilos = new Hilo[NUMHILOS];
        BufferedReader ficheroTexto = new BufferedReader(
                new FileReader("UD1\\Hilos\\UD1EJ6ConversacionArchivo\\Conversacion.txt"));
        Fichero fichero = new Fichero(ficheroTexto);

        for (int i = 0; i < NUMHILOS; i++) {
            Hilo hilo = new Hilo(i + 1, fichero);
            hilo.start();
            hilos[i] = hilo;
        }

        for (Hilo hilo : hilos) {
            hilo.join();
        }
        System.out.println("\nFin de la simulación.");
    }
}
