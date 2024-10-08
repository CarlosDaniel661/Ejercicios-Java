
//Escribir un programa en Java que calcule la energía cinética de un objeto en movimiento, dados su masa y su velocidad. Utilizar la fórmula: E = (1/2) * m * v^2, donde E es la energía cinética, m es la masa del objeto y v es la velocidad. Muestre el resultado por pantalla

import java.util.Scanner;
public class EnergíaCinética {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    try {
        System.out.print("Ingrese la masa del objeto en Kilogramos: ");
        double masa = scanner.nextDouble();

        System.out.print("Ingrese la velocidad del objeto en metros por segundo: ");
        double velocidad = scanner.nextDouble();

        double energiaCinetica = 0.5 * masa * Math.pow(velocidad, 2);

        System.out.println("La energía cinética del objeto es: " + energiaCinetica);

    }finally {
        scanner.close();
    }
    }
}
