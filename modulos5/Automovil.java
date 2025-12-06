package modulos;

import java.time.LocalDate;

public class Automovil {
    private String marca;
    private int anio;
    private double velocidad;

    public Automovil(String marcaVehiculo, int anioFabricacion, double velocidadMax) {
        this.marca = marcaVehiculo;
        this.anio = anioFabricacion;
        this.velocidad = velocidadMax;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
      return anio;
    }

    public double getVelocidad() {
        return velocidad;
    }
    public void encender() {
        int anioActual = LocalDate.now().getYear();

        if (anioActual - anio > 30) {
            System.out.println("No se puede encender: Vehículo muy antiguo");
        } else {
            System.out.println("Vehículo encendido exitosamente");
        }
    }

    public void calcularAntiguedad() {
        int anioActual = LocalDate.now().getYear();
        int antiguedad = anioActual - anio;
        System.out.println("Antigüedad: " + antiguedad + " años");
    }
}
