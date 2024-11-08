package UD1.Hilos.UD1EJ6ConversacionArchivo;

import java.io.IOException;
import java.util.Random;

public class Hilo extends Thread {
    int numHilo;
    Fichero fichero;
    Random random = new Random();

    public Hilo(int numHilo, Fichero fichero) {
        this.numHilo = numHilo;
        this.fichero = fichero;
    }

    @Override
    public void run() {
        try {
            String linea = fichero.leerLinea();
            while (linea != null) {
                System.out.println("Pescador " + numHilo + ": " + linea);
                Thread.sleep(random.nextInt(5000));
                linea = fichero.leerLinea();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
