package Modulos;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("GESTIÓN DE TAREAS");
            System.out.println("Descripción: ");
            String desc = sc.nextLine();

            System.out.println("Prioridad (Baja/Media/Alta): ");
            String prioridad = sc.nextLine();

            tareaPendiente tarea = new tareaPendiente(desc, prioridad);
            int opcion = 0;
            while (opcion != 3) {
                System.out.println("\n == TAREA: " +  tarea.getDescripcion() + "==");
                System.out.println("Estado actual: " + (tarea.getIndicador() ? "Completada" : "Pendiente"));
                System.out.println("Prioridad: " + tarea.getPrioridad());
                System.out.println("\n1. Marcar completada o Pendiente");
                System.out.println("2. Ver si es urgente");
                System.out.println("3. Salir");
                System.out.print("Opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        tarea.marcarComoCompletada();
                        break;

                    case 2:
                        if (tarea.esUrgente()) {
                            System.out.println("URGENTE");
                        } else {
                            System.out.println("No urgente");
                        }
                        break;

                    case 3:
                        System.out.println("Fin");
                        break;
                }
            }
        }
    }

