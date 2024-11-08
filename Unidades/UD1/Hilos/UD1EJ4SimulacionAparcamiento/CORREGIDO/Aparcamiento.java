package UD1.Hilos.UD1EJ4SimulacionAparcamiento.CORREGIDO;

public class Aparcamiento {
    static final int NUM_PLAZAS = 10;
    static Plaza[] plazas;

    public Aparcamiento() {
        plazas = new Plaza[NUM_PLAZAS];
        for (int i = 0; i < plazas.length; i++)
            plazas[i] = new Plaza();
    }

    public synchronized void aparcar(Coche coche) {
        Plaza plazaLibre;
        while ((plazaLibre = getPlazaLibre()) == null) {
            try {
                wait();
            } catch (InterruptedException ex) {
            }
            ;
        }
        plazaLibre.aparcaUnCoche(coche);
    }

    public synchronized void salir(Coche coche) {
        // podríamos evitar el bucle buscando la plaza donde está el coche
        // si almacenáramos en el coche en qué plaza está aparcado
        for (Plaza plaza : plazas)
            if (plaza.getCoche() == coche) {
                plaza.seVaElCoche();
                break;
            }
        notifyAll(); // o notify(); depende de simular que arrancan todos o solo el que entra
    }

    public Plaza getPlazaLibre() {
        for (Plaza plaza : plazas)
            if (plaza.estaLibre())
                return plaza;
        return null;
    }
}
