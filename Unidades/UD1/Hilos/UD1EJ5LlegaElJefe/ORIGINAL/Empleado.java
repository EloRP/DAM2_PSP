package UD1.Hilos.UD1EJ5LlegaElJefe.ORIGINAL;

public class Empleado extends Thread {
    Oficina oficina;
    String nombre;

    public Empleado(Oficina oficina, String nombre) {
        this.oficina = oficina;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        oficina.llegadaEmpleado(nombre);
    }
}