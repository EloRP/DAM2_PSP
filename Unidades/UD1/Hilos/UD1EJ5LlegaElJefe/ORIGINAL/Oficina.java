package UD1.Hilos.UD1EJ5LlegaElJefe.ORIGINAL;

public class Oficina {

    boolean jefeLlego = false;

    public synchronized void llegaJefe() {
        System.out.println("EL JEFE HA LLEGADO!");
        jefeLlego = true;
        notifyAll();
    }

    public synchronized void llegadaEmpleado(String nombreEmpleado) {
        if (!jefeLlego) {
            System.out.println(nombreEmpleado + " ha llegado. ZZZZZZ");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("(" + nombreEmpleado + " desperezándose), buenos días jefe, aquí estoy trabajando");
        } else {
            System.out.println(nombreEmpleado + " ha llegado. Hola jefe!, me pongo a trabajar...");
        }
    }
}
