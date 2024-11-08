package UD1.Hilos.EjerciciosMisc;

public class Hilo extends Thread {
    public Hilo(String nombre) {
        super(nombre);
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Soy el hilo" + getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }

    public static void main(String[] args) { // el main suele estar situado en otra clase
        for (int i = 0; i <= 100; i++) {
            Hilo hilo = new Hilo("hilo" + i);
            hilo.start();
        }
    }
}