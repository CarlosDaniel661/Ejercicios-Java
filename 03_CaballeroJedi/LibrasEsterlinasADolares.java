import java.util.Scanner;

public class LibrasEsterlinasADolares {
    private static final double FACTOR_CONVERSION = 1.29;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    try {
        System.out.print("Ingrese su salario en Libras Esterlinas: ");
        double salarioLibras = scanner.nextDouble();

        double salarioDolares = salarioLibras * FACTOR_CONVERSION;

        System.out.println("Su salario en dólares americanos es de: " + salarioDolares);

    }finally {
        scanner.close();
    }
    }
}
