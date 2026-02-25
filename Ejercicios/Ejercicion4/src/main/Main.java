
package main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** Programa Tanquesito ***");
        System.out.print("  >. Ingrese la cantidad de galones: ");
        int galones = teclado.nextInt();
        ProcesoTanque(galones);
    }
    
    public static void ProcesoTanque(int galones){
        if (galones == 0) {
            System.out.println("El tanque esta vacio");
        }else if (galones > 0 && galones <=25){
            System.out.println("El tanque esta en nivel bajo");
        }else if (galones > 25 && galones <=40){
            System.out.println("El tanque esta en nivel medio");
        }else if (galones > 40 && galones <=56){
            System.out.println("El tanque esta en nivel alto");
        }else if (galones > 56){
            System.out.println("El tanque se esta desbordando");
        }else{
            System.out.println("El valor ingresado es incorrecto");
        }
    }
    
    
    
    
    
}
