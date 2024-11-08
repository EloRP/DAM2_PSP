package UD1.Hilos.EjerciciosMisc;

import java.util.Random;

public class ContadorDef {
    private int contador;
    private Random random;

    public ContadorDef() {
        this.contador = 0;
        this.random = new Random();
    }

    public int getContador() {
        return this.contador;
    }

    public synchronized void incrementa() {
        contador++;
    }
}