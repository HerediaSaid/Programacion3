package TP3.adapter;

public class AdaptadorHiluxVieja implements Velocimetro {

    private static final double MILLAS_A_KM = 1.60934;

    private final ComputadoraHiluxVieja computadoraVieja;

    public AdaptadorHiluxVieja(ComputadoraHiluxVieja computadoraVieja) {
        this.computadoraVieja = computadoraVieja;
    }

    @Override
    public int obtenerVelocidadKmh() {
        double millas = computadoraVieja.leerVelocidadEnMillas();
        return (int) Math.round(millas * MILLAS_A_KM);
    }
}