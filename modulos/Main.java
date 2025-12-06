package modulos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== CONTROL DE INVENTARIO ===");

        Control producto1 = new Control("PROD-001", 50, 60);

        System.out.println("\nENTRADA DE MERCANCÍA");

        System.out.println("\nProducto: Jabón");
        System.out.println("Stock actual:" + producto1.getStockstock());
        System.out.print("Ingrese la cantidad a agregar: ");
        int cantidad1 = scanner.nextInt();

        System.out.println("Entrada de: " + cantidad1 + " unidades:");
        producto1.incrementarStock(cantidad1);


        System.out.println("\nCÁLCULO DEL VALOR TOTAL DEL STOCK ");

        double valorTotal1 = producto1.calcularValorTotalStock();


        System.out.println("Valor total del stock - Producto 1: $" + String.format("%.2f", valorTotal1));
    }
}
