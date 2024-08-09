
// Escribir un programa en Java que calcule la velocidad final de un objeto en caída libre, dados su velocidad inicial, la aceleración de la gravedad y el tiempo transcurrido. Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final, v_i es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo transcurrido.

import java.util.Scanner;

public class VelocidadFinal {
    
    private static final double CONSTANTE_GRAVEDAD = 9.8;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    try {
        System.out.print("Ingrese el tiempo transcurrido en segundos: ");
        double tiempo = scanner.nextDouble();

        System.out.print("Ingrese la velocidad inicial del objeto, en metros sobre segundos: ");
        double velocidadInicial = scanner.nextDouble();
        
        double velocidadFinal = velocidadInicial + CONSTANTE_GRAVEDAD * tiempo;

        System.out.println("La velocidad final del objeto es: " + velocidadFinal + "m/s");


    } finally {
        scanner.close();
    }
    }
}
