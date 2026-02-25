package main;

import java.util.Scanner;

public class Main {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //Declarando vector vacio
        int[] vector1 = new int[5];
        
        LlenadoCompleto(vector1);
        LlenadoPosicion(vector1);
        System.out.println(" ");
        MostrarVector(vector1);
        System.out.println(" ");
        BuscarValor(vector1);
        BuscarIndice(vector1);
        ActualizarValor(vector1);
        ActualizarIndice(vector1);
        EliminarValor(vector1);
        EliminarIndice(vector1);
        System.out.println(" ");
        MostrarVector(vector1);

     

    }

    public static void LlenadoCompleto(int[] vector) {
        System.out.println("/*/*/  Llenando el vector   /*/*/");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("  >. Ingrese valor en la posicion [" + i + "] = ");
            int valor = teclado.nextInt(); // 5
            vector[i] = valor; // i = 1 ---> vector[1] = 5
        }
    }
    
    public static void LlenadoPosicion(int [] vector){
        System.out.println("/*/*/  Llenando el vector por Posicion   /*/*/");
        System.out.print("  >. Ingrese la posicion: ");  
        int posicion = teclado.nextInt();  // 5
        System.out.print("  >. Ingrese el valor: ");
        int valor = teclado.nextInt();  // 20
        vector[posicion] = valor; // vector[5] = 20
    }

    public static void MostrarVector(int[] vector) {
        System.out.println("/*/*/  Mostrando el vector   /*/*/");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector[" + i + "] = " + vector[i]); // 0  vector[0] = 5   
        }
    }
    
    public static void BuscarValor(int [] vector){
        System.out.println("/*/*/  Buscando Valor  /*/*/");
        System.out.print("  >. Ingrese valor a buscar: ");
        int valor = teclado.nextInt(); // 5
        int posicion = 0; // variable que guarda la posicion encontrada
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == valor) {
                System.out.println("Valor encontrado en posicion ["+i+"]");
                posicion = i;
            }
        }
        
    }
    
    public static void BuscarIndice(int [] vector){
        System.out.println("/*/*/  Buscando Indice  /*/*/");
        System.out.print("  >. Ingrese indice a buscar: ");
        int indice = teclado.nextInt();
        int valor = 0; // variable que utilizaremos para guardar el valor que esta en el indice
        for (int i = 0; i < vector.length; i++) {
            if (indice == i) {
                System.out.println("Indice encontrado el valor es: "+vector[i]);
                valor = vector[i];
            }
        }
        
    }
    
    public static void ActualizarValor(int [] vector){
        System.out.println("/*/*/  Actualizar Valor  /*/*/");
        System.out.print("  >. Ingrese valor actual: ");
        int actual = teclado.nextInt();
        System.out.print("  >. Ingrese valor nuevo: ");
        int nuevo = teclado.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == actual) {
                System.out.println("Valor actual encontrado");
                vector[i] = nuevo;
                System.out.println("Valor nuevo actualizado.");
            }
        }
        
    }
    
    public static void ActualizarIndice(int[] vector){
        System.out.println("/*/*/  Actualizar Valor por Indice  /*/*/");
        System.out.print("  >. Ingrese indice: ");
        int indice = teclado.nextInt();
        System.out.print("  >. Ingrese valor nuevo: ");
        int nuevo = teclado.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (indice == i) {
                System.out.println("Indice encontrado");
                vector[i] = nuevo;
                System.out.println("Valor nuevo en el indice indicado");
            }
        }
    }
    
    public static void EliminarValor(int [] vector){
        System.out.println("/*/*/  Eliminar por Valor   /*/*/");
        System.out.print("  >. Ingrese valor a eliminar: ");
        int valor = teclado.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (valor == vector[i]) {
                System.out.println("Valor a eliminar encontrado");
                vector[i] = 0;
                System.out.println("Valor eliminado con exito");
            }
        }
    }
    
    public static void EliminarIndice(int [] vector){
        System.out.println("/*/*/  Eliminar por Indice /*/*/");
        System.out.print("  >. Ingrese indice a eliminar: ");
        int indice = teclado.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (indice == i) {
                System.out.println("Indice encotrado listo para eliminar");
                vector[i] = 0;
                System.out.println("Indice eliminado correctamente");
            }
        }
    }
}
