package TP3.factorymethod;

public abstract class FabricaVehiculo {

    protected abstract Vehiculo crearVehiculo();

    public void venderVehiculo() {
        Vehiculo vehiculo = crearVehiculo();
        vehiculo.entregar();
    }
}