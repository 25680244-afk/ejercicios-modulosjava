package Modulos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("TEMPERATURA Y CLIMA");

        System.out.print("Valor de temperatura: ");
        double valor = sc.nextDouble();
        sc.nextLine();

        System.out.print("Unidad (Celsius/Fahrenheit): ");
        String unidad = sc.nextLine();

        System.out.print("Fecha (23/11/2024): ");
        String fecha = sc.nextLine();

        Temperatura temp = new Temperatura(valor, unidad, fecha);
        System.out.println("\n INFORMACIÓN ");
        System.out.println("Grados: " + temp.getValor());
        System.out.println("Unidad: " + temp.getUnidad());
        System.out.println("Fecha: " + temp.getFecha());
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("\n1. Convertir temperatura");
            System.out.println("2. Verificar si es extrema");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();



            switch (opcion) {
                case 1:
                    temp.setconvertirValor();
                    System.out.println("Resultado de la conversión: " + temp.getValor() + " grados " + temp.getUnidad());
                    break;

                case 2:
                    temp.verificarExtrema();
                    break;

                case 3:
                    System.out.println("Saliendo");
                    break;
            }

        }

    }

}
