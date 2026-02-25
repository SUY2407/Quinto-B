
package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** PROGRAMA SALUDO ***");
        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.next();
        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();
        Saludo(nombre,edad);
        AnioNacimiento(edad);
//        int anio = AnioNacimiento(edad);
//        System.out.println("Tu naciste en el anio: "+AnioNacimiento(edad));
    }
    
    public static void Saludo(String nombre, int edad){
        System.out.println("\n");
        System.out.println(" Este es el mensaje: ");
        System.out.println("      Tu nombre es: "+nombre);
        System.out.println("      Tienes "+edad+" anios");
        System.out.println(" BIENVENIDO AMIGO ");
    }
    
//    public static int AnioNacimiento(int edad){
//        int anio = 2026 - edad;
//        return anio;
//    }
    
    public static void AnioNacimiento(int edad){
        int anio = 2026 - edad;
        System.out.println("Tu naciste en el anio: "+anio);
    }
    
}
