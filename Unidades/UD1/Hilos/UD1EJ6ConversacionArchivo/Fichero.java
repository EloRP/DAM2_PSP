package UD1.Hilos.UD1EJ6ConversacionArchivo;

import java.io.BufferedReader;
import java.io.IOException;

public class Fichero {
    BufferedReader fichero;

    public Fichero(BufferedReader fichero) {
        this.fichero = fichero;
    }

    public synchronized String leerLinea() throws IOException, InterruptedException {
        String linea = fichero.readLine();
        notify();
        wait();
        if (linea == null)
            notifyAll();
        return linea;
    }
}
