import java.util.Scanner;

public class EurosADolares {
    private static final double FACTOR_CONVERSION = 1.09;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    try {
        System.out.print("Ingrese su salario en Euros: ");
        double salarioEuros = scanner.nextDouble();
        
        double salarioDolares = salarioEuros * FACTOR_CONVERSION;

        System.out.println("Su salario en dólares americanos es: " + salarioDolares);

    } finally {
        scanner.close();
    }    
    }
}
