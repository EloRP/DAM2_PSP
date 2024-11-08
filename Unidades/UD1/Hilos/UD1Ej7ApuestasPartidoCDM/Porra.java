package UD1.Hilos.UD1Ej7ApuestasPartidoCDM;

public class Porra {
    int importeApuesta;

    public Porra() {
        importeApuesta = 0;
    }

    public int leerImporte() {
        return importeApuesta;
    }

    public synchronized void incrementarApuesta() {
        importeApuesta++;
    }
}
