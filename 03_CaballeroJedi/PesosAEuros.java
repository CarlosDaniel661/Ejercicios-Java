import java.util.Scanner;

public class PesosAEuros {
    private static final double FACTOR_CONVERSION = 0.00099;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    try {
        System.out.print("Ingrese su salario actual en Pesos Argentinos: ");
        double salarioPesos = scanner.nextDouble();

        double salarioEuros = salarioPesos * FACTOR_CONVERSION;

        System.out.println("Su salario actual en Euros es de: " + salarioEuros);

    }finally {
        scanner.close();
    }
    }
    
}
