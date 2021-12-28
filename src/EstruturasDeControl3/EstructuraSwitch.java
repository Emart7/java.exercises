package EstruturasDeControl3;

import java.util.Scanner;

public class EstructuraSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduzca el dia que mas le convenga para la cita: ");
        String diaSelecionado = scanner.nextLine();

        switch (diaSelecionado){
            case "lunes":
            case "miercoles":
                System.out.println("El " + diaSelecionado + " puede venir de 11:00 a 12:30");
                break;
            case "martes":
            case "jueves":
                System.out.println("El " + diaSelecionado + " puede venir de 15:30 a 17:30");
                break;
            case "viernes":
                System.out.println("El " + diaSelecionado + " puede venir de 09:00 a 11:00");
                break;
            case "sabado":
            case "domingo":
                System.out.println("El " + diaSelecionado + " nuestra clinica estara cerrada.");
                break;
            default:
                System.out.println("Usted no ha introducido un dia valido.");
        }
    }
}
