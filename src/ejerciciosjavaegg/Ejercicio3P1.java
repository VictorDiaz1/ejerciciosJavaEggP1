package ejerciciosjavaegg;

import java.util.Scanner;

public class Ejercicio3P1 {

// Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
// en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
    public static void main(String[] args) {
        System.out.println("Ingrese una frase:");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());

    }
}
