package UD1.Hilos.UD1Ej7ApuestasPartidoCDM;

public class Main {
    public static void main(String[] args) {
        final int NUM_EMPLEADOS = 10;
        Empleado[] empleados = new Empleado[NUM_EMPLEADOS];
        Porra porra = new Porra();

        for (int i = 0; i < NUM_EMPLEADOS; i++) {
            empleados[i] = new Empleado(i + 1, porra);
        }

        for (Empleado empleado : empleados) {
            try {
                empleado.join();
            } catch (InterruptedException e) {
                System.out.println("Se ha interrumpido el hilo.");
            }
        }

        System.out.println("Resultado del partido: ");
        System.out.println("Total de dinero ingresado en la apuesta: " + porra.importeApuesta);
        System.out.println("Empleados ganadores: ");
        System.out.println("Dinero por ganador: ");
    }
}
