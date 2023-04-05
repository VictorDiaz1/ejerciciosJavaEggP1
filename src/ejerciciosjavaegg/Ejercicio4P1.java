package ejerciciosjavaegg;

import java.util.Scanner;

public class Ejercicio4P1 {

// Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
// Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
    public static void main(String[] args) {
        System.out.println("Ingrese una cantidad en grados centigrados:");
        Scanner sc = new Scanner(System.in);
        double gradosCentigrados = sc.nextDouble();
        double gradosFahrenheit = (32 + (9 * gradosCentigrados / 5));
        System.out.println("Su equivalente en grados Fahrenheit es: " + gradosFahrenheit);
    }
}
