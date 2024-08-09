//Cree dos arreglos con números decimales, luego recortarlos y reste ambos arreglos el resultado aplicarlos a un tercer arreglo, si la resta da negativo entonces guarde 0.

import java.util.Scanner;
public class RestaDeArreglos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números decimales para el primer arreglo: ");
        int cantidad1 = scanner.nextInt();

        double[] arreglo1 = new double[cantidad1];
        System.out.println("Ingrese los números decimales para el primer arreglo: ");
        for (int i = 0; i < cantidad1; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo1[i] = scanner.nextDouble();
        }

        System.out.print("Ingrese la cantidad de números decimales para el segundo arreglo: ");
        int cantidad2 = scanner.nextInt();

        double[] arreglo2 = new double[cantidad2];
        for (int i = 0; i < cantidad2; i++) { 
            System.out.println("Número " + (i + 1) + ": ");
            arreglo2[i] = scanner.nextDouble();
        }
        scanner.close();
        
        int minLength = Math.min(cantidad1, cantidad2);
        double[] resultado = new double[minLength];

        for (int i = 0; i < minLength; i++) {
            double resta = arreglo1[i] - arreglo2[i];
            resultado[i] = (resta < 0) ? 0 : resta;
        }

        System.out.println("Resultados de la resta (los negativos son reemplazados por 0): ");
        for (double valor : resultado) {
            System.out.println(valor);
        }

    }
}
