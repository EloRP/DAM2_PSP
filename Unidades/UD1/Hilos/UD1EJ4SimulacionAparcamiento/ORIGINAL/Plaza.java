package UD1.Hilos.UD1EJ4SimulacionAparcamiento.ORIGINAL;

public class Plaza {
    boolean ocupada;

    public Plaza() {
        ocupada = false;
    }

    public synchronized boolean ocupar() {
        boolean puedeOcupar = false;
        if (!ocupada) {
            ocupada = true;
            puedeOcupar = true;
        }

        return puedeOcupar;
    }

    public void desocupar() {
        ocupada = false;
    }
}
