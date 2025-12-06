package modulos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libros libro1 = new Libros ("LIB-001", "Gabriel García Márquez", 2020);
        Libros libro2 = new Libros("LIB-002", "Mario Vargas Llosa", 2015);

        System.out.println("=== LIBROS DISPONIBLES ===");
        System.out.println("1. " + libro1.getIdentificador() + " - " + libro1.getAutor());
        System.out.println("2. " + libro2.getIdentificador() + " - " + libro2.getAutor());

        System.out.print("\n¿Qué libro quieres reservar? (1 o 2): ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            libro1.reservar();
        } else if (opcion == 2) {
            libro2.reservar();
        } else {
            System.out.println("Opción no válida");
        }
    }
}


