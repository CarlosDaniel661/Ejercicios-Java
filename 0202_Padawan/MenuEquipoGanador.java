//Modifique el ejercicio anterior en donde usted debe crear un menú de opciones en donde en ese menú de opciones debe elegir qué equipo de fútbol quiere saber la información del el ejercicio 11.

import java.util.Scanner;
public class MenuEquipoGanador {
    public static void main(String[] args) {
        
        String equipo1 = "Equipo A";
        String equipo2 = "Equipo B";

        String entrenador1 = "Entrenador A";
        String entrenador2 = "Entrenador B";

        String jugador1Equipo1 = " Jugador 1A";
        String jugador2Equipo1 = " Jugador 2A";
        String jugador3Equipo1 = " Jugador 3A";

        String jugador1Equipo2 = " Jugador 1B";
        String jugador2Equipo2 = " Jugador 2B";
        String jugador3Equipo2 = " Jugador 3B";

        Scanner scanner = new Scanner(System.in);
        boolean seguir = true;

        while (seguir) {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Mostrar información del " + equipo1);
            System.out.println("2. Mostrar información del "+ equipo2);
            System.out.println("3. Salir");
            System.out.println("Elija una opción: ");

            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:                 
                               
                    System.out.println("Equipo: " + equipo1);
                    System.out.println("Entrenador: " + entrenador1);
                    System.out.println("Jugadores:");
                    System.out.println("1. " + jugador1Equipo1);
                    System.out.println("2. " + jugador2Equipo1);
                    System.out.println("3. " + jugador3Equipo1);
                    System.out.println();
                    break;

                case 2:

                    System.out.println("Equipo: " + equipo2);
                    System.out.println("Entrenador: " + entrenador2);
                    System.out.println("Jugadores:");
                    System.out.println("1. " + jugador1Equipo2);
                    System.out.println("2. " + jugador2Equipo2);
                    System.out.println("3. " + jugador3Equipo2);
                    break;

                case 3:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        }
        scanner.close();

        System.out.println("El programa ha finalizado.");


    }
}
