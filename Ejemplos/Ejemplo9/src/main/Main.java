package main;

import java.util.Scanner;

public class Main {
    
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        String [][] pokemones = new String [10][10];
        int [][] fuerza = new int [2][3];
        
        LlenarString(pokemones);
        MostrarString(pokemones);
        ActualizarString1(pokemones);
        MostrarString(pokemones);
        EliminarString1(pokemones);
        MostrarString(pokemones);
    }
    
    public static void LlenarString(String[][] matriz){
        System.out.println("\n///// Llenando String /////");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = "Snorlax";
            }
        }
    }
    
    public static void MostrarString(String [][] matriz){
        System.out.println("\n///// Mostrando String /////");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
    public static void ActualizarString1(String [][]matriz){
        System.out.println("\n///// Actualizando String /////");
        System.out.print(" >. Ingrese indice de fila: ");
        int f = teclado.nextInt();
        System.out.print(" >. Ingrese indice de columna: ");
        int c = teclado.nextInt();
        System.out.print(" >. Ingrese pokemon nuevo: ");
        String nuevo = teclado.next();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (f == i && c == j) {
                    matriz[i][j] = nuevo;
                }
            }
        }
    }
    
    public static void EliminarString1(String[][]matriz){
        System.out.println("\n//// Eliminando String /////");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = null;
            }
        }
    }

}
