package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        Scanner teclado = new Scanner(System.in);
        MenuText();
        System.out.print("  >. Ingrese su opcion: ");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                Opcion1();
                Menu();
                break;
            case 2:
                Opcion2();
                Menu();
                break;
            case 3:
                Opcion3();
                Menu();
                break;
            case 4:
                Opcion4();
                Menu();
                break;
            default:
                System.out.println("La opcion no es correcta.");
                Menu();
                break;
        }
    }

    public static void MenuText() {
        System.out.println("** MENU **");
        System.out.println("1. Opcion 1");
        System.out.println("2. Opcion 1");
        System.out.println("3. Opcion 1");
        System.out.println("4. Salir");
    }

    public static void Opcion1() {
        System.out.println("Soy una opcion 1");
    }

    public static void Opcion2() {
        System.out.println("Soy una opcion 2");
    }

    public static void Opcion3() {
        System.out.println("Soy una opcion 3");
    }

    public static void Opcion4() {
        System.exit(0);
    }

}
