package modulos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("DATOS DE VEHÍCULOS");

        System.out.print("Marca: ");
        String marca = sc.nextLine();

        System.out.print("Año de fabricación: ");
        int anio = sc.nextInt();

        System.out.print("Velocidad máxima:  ");
        double velocidad = sc.nextDouble();

        Automovil auto = new Automovil(marca, anio, velocidad);

        System.out.println("\nINFORMACIÓN");
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Año: "+ auto.getAnio());
        System.out.println("Velocidad Máx: " + auto.getVelocidad());

        int opcion = 0;
        while (opcion != 3) {
            System.out.println("\n1. Encender vehículo");
            System.out.println("2. Calcular antigüedad");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                auto.encender();

            } else if (opcion == 2) {
                auto.calcularAntiguedad();

            } else if (opcion == 3) {
                System.out.println("Fin");

            } else {
                System.out.println("Opción no válida");
            }
        }

    }
}
