package UD1.Hilos.UD1EJ5LlegaElJefe.MODIFICADO;

public class Oficina {
    private boolean estaElJefe = false;

    public synchronized void saludoEmpleado(String nombre) {
        System.out.print(nombre + ": he llegado.");
        if (!estaElJefe) {
            System.out.println(" ZZZZZ");
            try {
                wait();
            } catch (InterruptedException ex) {
            }
            System.out.println(nombre + " Ehhh, A TRABAJAR!");
        } else
            System.out.println(nombre + ": Hola jefe, me pongo a trabajar");
    }

    public synchronized void saludoJefe(String nombre) {
        System.out.println(nombre + ": El jefe ha llegado");
        estaElJefe = true;
        notifyAll();
    }
}
