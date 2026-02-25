package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Programa Calculadora");
        System.out.print(" Ingrese numero 1: ");
        int a = teclado.nextInt();
        System.out.print(" Ingrese numero 2: ");
        int b = teclado.nextInt();
        System.out.println("\n Operaciones");
        suma(a,b);
        resta(a,b);
        multi(a,b);
        division(a,b);
//        operaciones(a,b);
//        System.out.println("La suma es: "+suma(a,b));
//        System.out.println("La resta es: "+resta(a,b));
//        System.out.println("La multi es: "+multi(a,b));
//        System.out.println("La division es: "+division(a,b));
    }

//    public static double suma(int a, int b) {
//        double resultado = a + b;
//        return resultado;
//    }
//
//    public static double resta(int a, int b) {
//        double resultado = a - b;
//        return resultado;
//    }
//
//    public static double multi(int a, int b) {
//        double resultado = a * b;
//        return resultado;
//    }
//
//    public static double division(int a, int b) {
//        double resultado = a / b;
//        return resultado;
//    }
//
//    public static void operaciones(int a, int b){
//        double suma = a+b;
//        double resta = a -b;
//        double multi = a * b;
//        double div = a / b;
//        
//        System.out.println("La suma es: "+suma);
//        System.out.println("La resta es: "+resta);
//        System.out.println("La multi es: "+multi);
//        System.out.println("La division es: "+div);
//    }
    

    public static void suma(int a, int b) {
        double resultado = a + b;
        System.out.println("La suma es: "+resultado);
    }

    public static void resta(int a, int b) {
        double resultado = a - b;
        System.out.println("La resta es: "+resultado);
    }

    public static void multi(int a, int b) {
        double resultado = a * b;
        System.out.println("La multi es: "+resultado);
    }

    public static void division(int a, int b) {
        double resultado = a / b;
        System.out.println("La div es: "+resultado);
    }
}
