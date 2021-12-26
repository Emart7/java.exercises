import java.util.Scanner;

public class IntroduccionCaracteresTeclado {
    public static void main(String[] args) {
        // Introducir un carácter por teclado
        Scanner teclado = new Scanner(System.in);

        System.out.println("Como te llamas?: ");
        String nombre = teclado.nextLine();

        System.out.println("Hola " + nombre + ", Bienvenido a Java.");

        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();

        System.out.println("Tu edad es: " + edad + " años.");

    }
}
