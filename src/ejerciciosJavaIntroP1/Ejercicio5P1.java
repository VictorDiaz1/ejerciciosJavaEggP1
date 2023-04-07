package ejerciciosJavaIntroP1;

import java.util.Scanner;

public class Ejercicio5P1 {

// Escribir un programa que lea un número entero por teclado y muestre por pantalla el
// doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
    public static void main(String[] args) {

        System.out.println("Ingrese un numero:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("El doble del numero es: " + num * 2);
        System.out.println("El triple del numero es: " + num * 3);
        System.out.println("La raiz cuadrada del numero es: " + Math.sqrt(num));
        System.out.println("----------------------");
        double num2 = 2, num3 = 15.5;
        int numero2 = (int) (Math.random() * 10);//metodo random genera numero al azar
        System.out.println("numero al azar: " + numero2);
        System.out.println("Valor absoluto: " + Math.abs(num2));
        System.out.println("Entero menor mas cercano: " + Math.floor(num2));
        System.out.println("Menor de dos valores: " + Math.min(num2, num3));
        System.out.println("Mayor de dos valores: " + Math.max(num2, num3));
        System.out.println("Primer numero elevado al segundo numero: " + Math.pow(num2, num3));

    }
}
