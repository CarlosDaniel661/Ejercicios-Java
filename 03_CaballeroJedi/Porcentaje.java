import java.util.Scanner;

public class Porcentaje {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    try {
      
        System.out.print("Ingrese un número real: ");
        double numeroReal1 = scanner.nextDouble();

        System.out.print("Ingrese un número entero: ");
        int numeroEntero1 = scanner.nextInt();

        double porcentaje = (numeroEntero1 / numeroReal1) * 100;

        System.out.println(numeroEntero1 + " es el " + porcentaje + " % de " + numeroReal1);

    } finally {
        scanner.close();
    }
    }
}