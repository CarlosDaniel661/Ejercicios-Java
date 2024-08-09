import java.util.Scanner;

public class DolaresAPesos {
    private static final double FACTOR_CONVERSION = 1435;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    try {
        System.out.print("Ingrese su salario en dólares americanos: ");
        double salarioDolares = scanner.nextDouble();

        double salarioPesosArgentinos = salarioDolares * FACTOR_CONVERSION;

        System.out.println("Su salario en Pesos Argentinos es de: " + salarioPesosArgentinos);

    }finally {
        scanner.close();
    }
    }
    
}
