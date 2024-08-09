import java.util.Scanner;

public class LibrasAKilogramos {
    private static final double FACTOR_CONVERSION = 0.453592;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
    

    try {
        System.out.print("Ingrese el peso en libras: ");
        double libras = scanner.nextDouble();

        double kilogramos = libras * FACTOR_CONVERSION;

        System.out.println(libras + "libras es igual a " + kilogramos + "kilogramos.");

    } finally {
        scanner.close();
    }
    }
    
}
