package UD1.Hilos.EjerciciosMisc;

public class HiloIncrementadorDef extends Thread {
    final int NUM_INCREMENTOS = 100;
    ContadorDef contador;

    public HiloIncrementadorDef(String nombre, ContadorDef contador) {
        super(nombre);
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < NUM_INCREMENTOS; i++)
            contador.incrementa();
    }
}