package ejerciciosjavaegg;

import java.util.Scanner;

public class Ejercicio1P1 {

//  Escribir un programa que pida dos números enteros
//  por teclado y calcule la suma de los
//  dos. El programa deberá después mostrar el resultado de la suma
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros enteros:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        System.out.println("suma = " + suma);
    }
}
