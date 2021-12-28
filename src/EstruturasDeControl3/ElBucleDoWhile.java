package EstruturasDeControl3;

import java.util.Scanner;

public class ElBucleDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        do {
            System.out.println("Ingrese el numero a calcular la raiz o ingrese cero para salir: ");
            numero = scanner.nextDouble();
            if(numero == 0){
                System.out.println("Hasta la vista");
            }else {
                System.out.println("La raiz cuadrada es: " + Math.sqrt(numero));
            }
        } while (numero != 0);
    }
}
