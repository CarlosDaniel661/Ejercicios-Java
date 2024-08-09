//Triangulo de asteriscos : Se le solicita que creen un programa que imprima un triángulo de asteriscos en la consola. Usar bucles.

import java.util.Scanner;
public class TriánguloDeAsteriscos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    

        System.out.print("Ingrese el número de filas para el triángulo: ");
        int filas = scanner.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        
            scanner.close();

        
                
    }
}