
//Conversión de grados Celsius a grados Fahrenheit : Escribir un programa en Java que convierta una temperatura en grados Celsius a grados Fahrenheit. Buscar la fórmula con la que se resuelve.//
import java.util.Scanner;

public class CelsiusAFahrenheit {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    try {
        System.out.print("Ingrese la temperatura actual en grados Celsius: ");
        double gradosCelsius = scanner.nextDouble();

        double gradosFahrenheit = gradosCelsius * 9/5 + 32;

        System.out.println("La temperatura actual en grados Fahrenheit es: " + gradosFahrenheit);


    }finally {
        scanner.close();
    }
    }
}
