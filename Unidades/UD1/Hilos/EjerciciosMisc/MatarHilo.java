package UD1.Hilos.EjerciciosMisc;

public class MatarHilo extends Thread {

        private boolean salir = false;
        private int i = 0;

        public void fin() {
            salir = true;
        }

        @Override
        public void run() {
            while (!salir) {
                System.out.println(i++);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                }
            }
        }
    }

    class Principal {
        public static void main(String[] args) {
            MatarHilo hilo = new MatarHilo();
            hilo.start();
            System.out.println("Vamos a esperar cuatro segundos ...");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
            }
            System.out.println("... y matamos 'suavemente' el hilo.");
            hilo.fin();
        }
    }


