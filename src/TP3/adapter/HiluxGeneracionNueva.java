package TP3.adapter;

public class HiluxGeneracionNueva implements Velocimetro {

    private final int velocidadActual;

    public HiluxGeneracionNueva(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    @Override
    public int obtenerVelocidadKmh() {
        return velocidadActual;
    }
}