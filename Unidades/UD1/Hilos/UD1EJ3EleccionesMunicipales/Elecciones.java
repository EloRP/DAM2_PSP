package UD1.Hilos.UD1EJ3EleccionesMunicipales;

public class Elecciones {
    static final int NUM_HABITANTES = 10000; // poner<10 habitantes para simular empates
    static String[] nombresPartidos = { "PP", "BNG", "PSOE", "Marea", "IndCDM" };

    public static void main(String[] args) {
        Urna urna = new Urna(nombresPartidos);
        // Empiezan las votaciones
        Votante[] votantes = new Votante[NUM_HABITANTES];
        for (int i = 0; i < NUM_HABITANTES; i++) {
            votantes[i] = new Votante(urna);
            votantes[i].start();
        }
        // Esperamos a que todo el mundo acabe de votar
        for (Votante votante : votantes)
            try {
                votante.join();
            } catch (InterruptedException ex) {
            }
        // Mostramos los resultados
        System.out.println(urna);
        urna.visualizarResultados();
    }
}