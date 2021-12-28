package EstruturasDeControl3;
import java.util.Scanner;

public class ElOperadorInterrogante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero entero a dividir: ");
        int numeroDividendo = scanner.nextInt();
        System.out.println("Introduce otro numero entero como divisor: ");
        int numeroDivisor = scanner.nextInt();

        int resultado;

//        if(numeroDivisor == 0){
//            System.out.println("El resultado es: 0");
//        }else {
//            resultado = numeroDividendo / numeroDivisor;
//            System.out.println("El resultado es: " + resultado);
//        }

        //Funciona como el codigo comentado
        resultado = numeroDivisor == 0?0: numeroDividendo / numeroDivisor;
        System.out.println("El resultado es: " + resultado);

    }
}
