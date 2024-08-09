
// Cálculo del área de un círculo: Escribir un programa en Java que calcule el área de un círculo con un radio de 5 unidades//

public class AreaDeUnCirculo {

    public static void main(String[] args) {
        
        double radio = 5;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área de un círculo con radio " + radio + " es: " + area);

    }
}