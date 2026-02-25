package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** Ejemplo IF ***");
        System.out.print("  Ingrese su nota: ");
        int numero = teclado.nextInt();
        System.out.print(" Ingrese la seccion : ");
        String seccion = teclado.next();
        Validar4(numero, seccion);
//        Validar1(numero);
//        Validar2(numero);
    }

    public static void Validar1(int numero) {
        if (numero < 10) {
            System.out.println(" El numero ingresado es menor a 10");
        }
    }

    public static void Validar2(int numero) {
        if (numero < 10) {
            System.out.println(" El numero ingresado es menor a 10");
        } else {
            System.out.println(" El numero es mayor a 10");
        }
    }

    public static void Validar3(int numero) {
        if (numero >= 0 && numero <= 50) {
            System.out.println("Rendimiento Bajo");
        } else if (numero > 50 && numero <= 70) {
            System.out.println("Rendimiento Intermedio");
        } else if (numero > 70 && numero <= 80) {
            System.out.println("Rendimiento Bueno");
        } else if (numero > 80 && numero <= 100) {
            System.out.println("Rendimiento Excelente");
        } else {
            System.out.println("La nota ingresada no cumple con los estandares.");
        }
    }

    public static void Validar4(int numero, String seccion) {
        if (seccion.equals("a")) {
            if (numero >= 0 && numero <= 50) {
                System.out.println("Rendimiento Bajo");
            } else if (numero > 50 && numero <= 70) {
                System.out.println("Rendimiento Intermedio");
            } else if (numero > 70 && numero <= 80) {
                System.out.println("Rendimiento Bueno");
            } else if (numero > 80 && numero <= 100) {
                System.out.println("Rendimiento Excelente");
            } else {
                System.out.println("La nota ingresada no cumple con los estandares.");
            }
        } else if (seccion.equals("b")) {

            if (numero >= 0 && numero <= 40) {
                System.out.println("Rendimiento Bajo");
            } else if (numero > 40 && numero <= 59) {
                System.out.println("Rendimiento Intermedio");
            } else if (numero > 59 && numero <= 75) {
                System.out.println("Rendimiento Bueno");
            } else if (numero > 75 && numero <= 100) {
                System.out.println("Rendimiento Excelente");
            } else {
                System.out.println("La nota ingresada no cumple con los estandares.");
            }

        } else {
            System.out.println("La seccion no Existe");
        }

    }

}
