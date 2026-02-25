package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** PROGRAMA PROMEDIO ***");
        System.out.print(">. Ingrese la nota 1: ");
        int n1 = teclado.nextInt();
        System.out.print(">. Ingrese la nota 2: ");
        int n2 = teclado.nextInt();
        System.out.print(">. Ingrese la nota 3: ");
        int n3 = teclado.nextInt();
        System.out.print(">. Ingrese la nota 4: ");
        int n4 = teclado.nextInt();
        System.out.println("El promedio obtenido es: ");
        CalcularPromedio(n1, n2, n3, n4);
    }

    public static void CalcularPromedio(int nota1, int nota2, int nota3, int nota4) {
        double promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("**** El promedio obtenido es ***");
        System.out.println(promedio);
    }
//    
//    public static double CalcularPromedio(int nota1, int nota2, int nota3, int nota4){
//        double promedio = (nota1+nota2+nota3+nota4)/4;
//        return promedio;
//    }

}
