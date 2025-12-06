package Modulos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("=== Geometría Básica===");
        System.out.println("R E C T A N G U L O");
        System.out.println("\nIngrese una etiqueta para el Rectángulo:");
        String etique=sc.nextLine();
        System.out.println("Ingrese la medida de la Base: ");
        double base=sc.nextDouble();
        System.out.println("Ingrese la medida de la altura: ");
        double altura=sc.nextDouble();

        Rectangulo primerRectangulo =new Rectangulo(etique, base, altura);

        System.out.println("\n R E S U L T A D O");
        System.out.println("Etiqueta de Identifiacación:"+ primerRectangulo.getIdentificacion());
        System.out.println("Área: " + primerRectangulo.setcalcularArea());
        System.out.println("Perámetro: " + primerRectangulo.setcalcularPerimetro());
    }


}
