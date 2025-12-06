package Modulos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);

        System.out.println(" == Control de empleados ==");
        System.out.println("Ingrese la clave del empleado: ");
        String clave = sc.nextLine();
        System.out.println("Ingrese el salario mensual: ");
        double salario = sc.nextDouble();

        System.out.print("Ingrese el porcentaje de retención: ");
        double retencion = sc.nextDouble();

        Empleado empleado = new Empleado(clave, salario, retencion);

        int opcion =0;
        while (opcion != 3){
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Calcular salario neto");
            System.out.println("2. Aplicar aumento");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("'\n Clave del empleado: " + empleado.getClave());
                    System.out.println("Salario neto: $" + empleado.calcularSalarioNeto());
                    break;

                case 2:
                    System.out.print("Porcentaje de aumento: ");
                    double aumento = sc.nextDouble();
                    empleado.aplicarAumento(aumento);
                    break;

                case 3:
                    System.out.println("Saliendo");
                    break;
            }

        }



    }
}
