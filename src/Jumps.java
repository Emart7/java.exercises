import java.util.Scanner;

public class Jumps {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = input.nextLine();

        System.out.println("Ingrese su apellido: ");
        String apellido = input.nextLine();

        System.out.println("Hola " + nombre + " " + apellido);

        //a new line is inserted
        System.out.println("New line: \n " + nombre);

        //a tab is inserted
        System.out.println("Tab: \t " + nombre);

        //a backslash is inserted
        System.out.println("Backslash: \b " + nombre);

        //a single quote is inserted
        System.out.println("single quote: \' " + nombre);

        //a double quote is inserted
        System.out.println("Double quote: \" " + nombre);

        //a car return is inserted
        System.out.println("Nueva linea: \r " + nombre);

    }
    }
