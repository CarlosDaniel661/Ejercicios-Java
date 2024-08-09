// Cálculo de la hipotenusa de un triángulo: Escribir un programa en Java que calcule la hipotenusa de un triángulo rectángulo, dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la hipotenusa, a y b son los catetos.//


import java.util.Scanner;

public class HipotenusaDeUnTriángulo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    try {
        System.out.print("Ingrese el valor del cateto (a): ");
        double catetoa = scanner.nextDouble();

        System.out.print("Ingrese el valor del cateto (b): ");
        double catetob = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(catetoa, 2) + Math.pow(catetob, 2));

        System.out.println("La hipotenusa del triángulo con catetos " + catetoa + " y " + catetob + " es: " + hipotenusa);


    }finally {
        scanner.close();

    }
    }
}
