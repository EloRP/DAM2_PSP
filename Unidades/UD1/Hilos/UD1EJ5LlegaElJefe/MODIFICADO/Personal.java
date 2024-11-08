package UD1.Hilos.UD1EJ5LlegaElJefe.MODIFICADO;

public abstract class Personal extends Thread {
    Oficina oficina;

    public Personal(String nombre, Oficina oficina) {
        super(nombre);
        this.oficina = oficina;
    }

    abstract public void aTrabajar();

    public void run() {
        aTrabajar();
    }
}

class Jefe extends Personal {

    public Jefe(String nombre, Oficina oficina) {
        super(nombre, oficina);
    }

    public void aTrabajar() {
        oficina.saludoJefe(getName());
    }
}

class Empleado extends Personal {

    public Empleado(String nombre, Oficina oficina) {
        super(nombre, oficina);
    }

    public void aTrabajar() {
        oficina.saludoEmpleado(getName());
    }
}
