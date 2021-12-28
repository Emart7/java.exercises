package EstruturasDeControl3;

import java.util.Scanner;

public class ElBucleFor {
    public static void main(String[] args) {
        //Ejercicio 1

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ingrese el primer numero: ");
//        int numero1 = scanner.nextInt();
//        System.out.print("Ingrese el segundo numero: ");
//        int numero2 = scanner.nextInt();
//
//        int resultado = 0;
//
//        for (int i = 0;i < numero2; i++){
//            System.out.println("Iteracion numero: " + i);
//            resultado += numero1;
//        }
//        System.out.println("El resuldado es: " + resultado);

        //Ejercicio 2

        int suma = 0;
        for (int i = 1, j=100; i<j; i++, j--){
            //Tenemos dos variables de control la "i" y la "j"
            System.out.println("iteracion numero " + i + " sumando " + i + " y " + j);
            suma = suma + i + j;
        }
        System.out.println("El resultado de la suma de los numeros del 1 al 100 es: " + suma);
    }
}
