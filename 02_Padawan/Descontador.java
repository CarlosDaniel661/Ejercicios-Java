import java.util.Scanner;

public class Descontador {

public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    try {
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        for (int i = 0; i < 20; i++) { numero--;
        }

        System.out.println("El número descontado 20 veces es: " + numero);

    } finally {
        scanner.close();
    }
}
    
}
