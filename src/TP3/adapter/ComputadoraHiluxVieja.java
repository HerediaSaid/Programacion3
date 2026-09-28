package TP3.adapter;

public class ComputadoraHiluxVieja {

    private final double velocidadEnMillas;

    public ComputadoraHiluxVieja(double velocidadEnMillas) {
        this.velocidadEnMillas = velocidadEnMillas;
    }

    public double leerVelocidadEnMillas() {
        return velocidadEnMillas;
    }
}