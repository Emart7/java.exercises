package EstruturasDeControl3;

import java.util.Scanner;

public class ElBucleWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduzca el numero a calcular la raiz: ");
        double numeroACalcular = scanner.nextDouble();
        double candidatoARaizCuadrada = 0.0;
        while (candidatoARaizCuadrada * candidatoARaizCuadrada <= numeroACalcular){
            candidatoARaizCuadrada += 0.1;
            System.out.println("Aproximacion: " + candidatoARaizCuadrada + " Su cuadrado es: " + candidatoARaizCuadrada);
                    }
        candidatoARaizCuadrada -= 0.01;
        System.out.println("La raiz cuadrada que hemos calculado es: " + candidatoARaizCuadrada);
        System.out.println("La raiz cuadrada real es: " + Math.sqrt(numeroACalcular));
    }
}
