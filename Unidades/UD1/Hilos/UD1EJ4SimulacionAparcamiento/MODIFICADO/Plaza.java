package UD1.Hilos.UD1EJ4SimulacionAparcamiento.MODIFICADO;

public class Plaza {
    boolean ocupada;

    public Plaza() {
        ocupada = false;
    }

    public boolean ocupar() {
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
