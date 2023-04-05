package ejerciciosjavaegg;

import java.util.Scanner;

public class Ejercicio2P1 {

// Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
// pantalla.
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre:");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Mi nombre es: " + nombre);
    }
}
