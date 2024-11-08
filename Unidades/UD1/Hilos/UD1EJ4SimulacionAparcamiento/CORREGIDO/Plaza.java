package UD1.Hilos.UD1EJ4SimulacionAparcamiento.CORREGIDO;

public class Plaza {
    private static int contadorPlazas = 0;
    private int numPlaza;
    Coche cocheAparcado = null;

    public Plaza() {
        numPlaza = ++contadorPlazas;
    }

    public Coche getCoche() {
        return cocheAparcado;
    }

    public void aparcaUnCoche(Coche coche) {
        cocheAparcado = coche;
        System.out.println(coche + " > " + this);
    }

    public void seVaElCoche() {
        System.out.println(this + " libre > " + cocheAparcado);
        cocheAparcado = null;
    }

    public boolean estaLibre() {
        return cocheAparcado == null;
    }

    @Override
    public String toString() {
        return "P" + numPlaza;
    }
}
