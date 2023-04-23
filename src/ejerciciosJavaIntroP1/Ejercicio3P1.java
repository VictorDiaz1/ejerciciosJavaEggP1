package ejerciciosJavaIntroP1;

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
        System.out.println(frase.toString());
        System.out.println("Devuelve el caracter en la pocision indicada: " + frase.charAt(0));
        System.out.println("Cambia el String por el que indicamos:" + frase.replaceAll(frase, " hola"));
        System.out.println("Elimina los caracteres indicados de principio a fin:" + frase.substring(3));
        System.out.println("Concatena: " + frase.concat(" chau"));
        System.out.println("Devuelve los caracteres indicados: " + frase.substring(0, 2));
        System.out.println("Devuelve boolean si termina con string indicado: " + frase.endsWith("a"));

    }
}
