package main;

import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String[] emails = new String[5];
        String[] nombres = new String [4];
        LlenarString(emails);
        LlenarString(nombres);
        MostrarString(emails);
        MostrarString(nombres);
//        EliminarString1(emails);
//        MostrarString(emails);
//        ActualizarString2(emails);
//        MostrarString(emails);

    }

    public static void LlenarString(String[] vector) {
        System.out.println("\n//// Llenado el vector ////");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("  >. Ingrese su valor en [" + i + "] = ");
            String valor = teclado.next();
            vector[i] = valor;
        }
    }

    public static void MostrarString(String[] vector) {
        System.out.println("\n//// Mostrando el vector ////");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("[" + i + "] = " + vector[i]);
        }
    }

    public static void EliminarString1(String[] vector) {
        System.out.println("\n//// Eliminar por valor ////");
        System.out.print("  >. Ingrese valor actual: ");
        String actual = teclado.next();
        for (int i = 0; i < vector.length; i++) {
            if (actual.equals(vector[i])) {
                // actual == vector[i]
                vector[i] = null;
            }
        }
    }
    
     public static void ActualizarString2(String[] vector) {
        System.out.println("\n//// Actualizar por indice ////");
        System.out.print("  >. Ingrese indice: ");
        int indice = teclado.nextInt();
         System.out.print("  >. Ingrese valor nuevo: ");
         String nuevo = teclado.next();
        for (int i = 0; i < vector.length; i++) {
            if (indice == i) {
                vector[i] = nuevo;
                System.out.println(" Valor actualizado con exito!");
            }
        }
    }
}
