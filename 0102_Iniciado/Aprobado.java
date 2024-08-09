// Escribe un programa que imprima un título para el programa, luego un listado (Seguido, NO con saltos de línea) de las N notas de mis exámenes, donde los N números son guardados en variables o constantes según corresponda. Luego obtenga el promedio de esas calificaciones y me diga si aprobé o no y con cuanto

import java.util.Scanner;
public class Aprobado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa de cálculo de Promedio de Calificaciones: ");

        System.out.print("Ingrese el número de calificaciones: ");
        int N = scanner.nextInt();

        double[] calificaciones = new double[N];

        System.out.println("Ingrese las calificaciones: ");
        for (int i = 0; i < N; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
            
        }

        System.out.print("Las calificaciones son: ");
        for (int i = 0; i < N; i++) {
            System.out.print(calificaciones[i]);
            if (i < N - 1) {
                System.out.print(", ");

            }
        }
        System.out.println();

        double suma = 0;
        for (int i = 0; i < N; i++) {
            suma += calificaciones[i];

        }
        double promedio = suma / N;

        System.out.printf("El promedio es %.2f\n", promedio);
        if (promedio >= 6.0) {
            System.out.println("¡Aprobaste!");
        } else {
            System.out.println("No aprobaste. :c");
        }
        scanner.close();

    }
}
