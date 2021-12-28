package EstruturasDeControl3;

import java.util.Scanner;

public class LaSentenciaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroPensado = 6;

        System.out.println("Adivina el numero que estoy pensando del 1 al 10.");
        System.out.println("*************************************************");
        System.out.println("Ingresa tu numero: ");
        int numeroIngresado = scanner.nextInt();

        String color;

        if(numeroIngresado == numeroPensado){
            color = "\033[0;32m";
            System.out.println(color + "Excelente! Adivinaste mi numero.");
        }
        else{
            color = "\033[0;31m";
        System.out.println(color + "No adivinaste. El numero que estaba pensando era el: " + numeroPensado);
                    }

    }
}
