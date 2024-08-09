
// Escribir un programa en Java que calcule la fuerza centrípeta necesaria para mantener un objeto en una trayectoria circular, dados su masa, la velocidad angular y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la fuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r es el radio de la trayectoria. Muestre el resultado por pantalla.

import java.util.Scanner;
public class FuerzaCentrípeta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    try {
        System.out.print("Ingrese la masa del objeto en Kilogramos: ");
        double masa = scanner.nextDouble();

        System.out.print("Ingrese la velocidad angular del objeto en metros sobre segundos: ");
        double velocidadAngular = scanner.nextDouble();

        System.out.print("Ingrese el radio de la trayectoria del objeto en metros: ");
        double radio = scanner.nextDouble();

        double fuerzaCentripeta = masa * Math.pow(velocidadAngular,2) / radio;

        System.out.println("La fuerza centrípeta necesaria es: " + fuerzaCentripeta + " Newtons.");


    } finally {
        scanner.close();
    }
    }
}
