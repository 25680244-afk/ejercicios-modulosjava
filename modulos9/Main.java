package Modulos;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            Sistema vuelo1 = new Sistema("IBZ-402", 50, 49, 200.0); // Cambiado a 200.0
            System.out.println("\n## Vuelo "+ vuelo1.getcodigoVuelo() + " ##");
            System.out.println("Ingrese la cantidade  boletos a reservar:");
            int asientosAReservar = scanner.nextInt();
            vuelo1.Asientos(asientosAReservar);
            System.out.println("\n== REPORTE FINAL ==");
            System.out.println("Codigo de vuelo: " + vuelo1.getcodigoVuelo());
            System.out.println("Cantidad de Asientos reservados: "+ vuelo1.getReservados());
            System.out.println("Porcentaje de Ocupación: " + vuelo1.Porcentaje() + "%");

        }
    }

