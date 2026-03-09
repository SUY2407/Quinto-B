package main;

import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matriz1 = new int[25][25];
        int[][] matriz2 = new int[2][3];

        LlenarMatriz1(matriz1);
        MostrarMatriz(matriz1);
        System.out.println("\n\n");
        ActualizarMatriz1(matriz1);
        MostrarMatriz(matriz1);

    }

    public static void LlenarMatriz1(int[][] matriz) {
        System.out.println("\n//// Llenando Matriz ////");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = 24;
            }
        }
    }

    public static void LlenarMatriz2(int[][] matriz) {
        System.out.println("\n//// Llenando Matriz por solicitud ////");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("  >. Ingresa dato: ");
                int valor = teclado.nextInt();
                matriz[i][j] = valor;
            }
        }
    }

    public static void MostrarMatriz(int[][] matriz) {
        System.out.println("\n//// Mostrando Matriz ////");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void ActualizarMatriz1(int[][] matriz) {
        System.out.println("\n//// Actualizando Matriz ////");
        System.out.print(" >. Ingrese indice de fila: ");
        int f = teclado.nextInt();
        System.out.print(" >. Ingrese indice de columna: ");
        int c = teclado.nextInt();
        System.out.print(" >. Ingrese valor nuevo: ");
        int nuevo = teclado.nextInt();

        if (f >= 0 && f < matriz.length && c >= 0 && c < matriz[0].length) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    if (f == i && c == j) {
                        matriz[i][j] = nuevo;
                    }
                }
            }
        }else{
            System.out.println("Error los indices no cumplen");
        }

    }

}
