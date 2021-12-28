package EstruturasDeControl3;

import java.util.Scanner;

public class LaEscaleraIfElseIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero entero y te dare informacion sobre el: ");
        int numeroIngresado = scanner.nextInt();

        if(numeroIngresado <= 3){
            System.out.println("El numero que ingresaste es menor que 3.");
        } else if(numeroIngresado <= 5){
            System.out.println("E numero ingresado esta entre 3 y 5.");
        } else if (numeroIngresado <= 8){
            System.out.println("El numero ingresado esta entre 5 y 8.");
        } else {
            System.out.println("El numero es mayor a 8.");
        }
    }
}
