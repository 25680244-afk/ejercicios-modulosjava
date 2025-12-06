package modulos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SISTEMA DE CUENTAS BANCARIAS");
        System.out.println("\nCreación de cuenta");
        System.out.println("Ingrese un número de cuenta");
        String numeroCuenta = sc.nextLine();
        sc.nextLine();
        System.out.println("Ingrese el nombre del titular");
        String nombreTitular = sc.nextLine();
        System.out.println("Ingrese el saldo inicial");
        double saldoInicial = sc.nextDouble();
        cuentaDeAhorro cuentaNueva = new cuentaDeAhorro(numeroCuenta, nombreTitular, saldoInicial);
        System.out.println("== Cuenta creada == ");

        int opcion=0;
        while (opcion != 3) {
            System.out.println("\n O P E R A C I O N E S");;
            System.out.println("\n=== MENÚ DE OPERACIONES ===");
            System.out.println("1. Realizar depósito");
            System.out.println("2. Realizar retiro");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese la cantidad a depositar: $");
                    double deposito = sc.nextDouble();
                    cuentaNueva.depositar(deposito);
                    System.out.println("Saldo actual: $" + cuentaNueva.getSaldo());

                case 2:
                    System.out.print("\nIngrese la cantidad a retirar: $");
                    double retiro = sc.nextDouble();
                    cuentaNueva.retirar(retiro);
                    System.out.println("Saldo actual: $" + cuentaNueva.getSaldo());
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        }


    }
}
