package Modulos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PROCESAMIENTO DE TEXTO");

        System.out.println("Ingrese el texto inicial: ");
        String texto = sc.nextLine();

        cadenaCaracteres procesador = new cadenaCaracteres(texto, "NB11", 30);
        System.out.println("Identificador: " + procesador.getIdentificador());
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("1. Añadir prefijo");
            System.out.println("2. Contar espacios");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();



            if (opcion == 1) {
                System.out.print("\nIngrese el prefijo a añadir: ");
                String prefijo = sc.nextLine();
                procesador.anadirPrefijo(prefijo);

            } else if (opcion == 2) {
                System.out.println("Espacios en blanco: " + procesador.contarEspacios());

            } else if (opcion == 3) {
                System.out.println("Saliendo");

            } else {
                System.out.println("Opción no válida");
            }
        }
    }
}
