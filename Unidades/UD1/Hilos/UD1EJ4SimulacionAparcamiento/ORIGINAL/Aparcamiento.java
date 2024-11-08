package UD1.Hilos.UD1EJ4SimulacionAparcamiento.ORIGINAL;

public class Aparcamiento {
    Plaza[] plazas;
    int numIdPlaza;

    public Aparcamiento(int numPlazas) {
        plazas = new Plaza[numPlazas];
        for (int i = 0; i < numPlazas; i++) {
            plazas[i] = new Plaza();
        }
    }

    public boolean aparcar(int numPlaza) {
        return plazas[numPlaza].ocupar();
    }

    public void salir(int numPlaza) {
        plazas[numPlaza].desocupar();
    }

    public int length() {
        return plazas.length;
    }
    
}
