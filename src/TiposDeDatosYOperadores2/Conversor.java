package TiposDeDatosYOperadores2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        //Programa que pida por pantalla una cantidad en euros
        //y devuelva la conversion en dolares.
        //El mensaje con el resultado sera: *** euros equivalen a *** US dolares

        System.out.println("Bienvenido al conversor de moneda.");
        System.out.println("***********************************");
        System.out.println("Ingrese la cantidad en euros a convertir: ");
        Scanner teclado = new Scanner(System.in);
        double euros = teclado.nextDouble();

        double dolares = 1.09 * euros;

        System.out.println(euros + " euros equivalen a " + dolares + " dolares.");

        String eurosString = Double.toString(euros);
        BigDecimal eurosBigDecimal = new BigDecimal(eurosString);
        double tasaDeCambio = 1.09;
        String tasaDeCambioString = Double.toString(tasaDeCambio);
        BigDecimal tasaDeCambioBigDecimal = new BigDecimal(tasaDeCambioString);

        BigDecimal dolaresBigDecimal = eurosBigDecimal.multiply(tasaDeCambioBigDecimal);
        System.out.println(euros + " euros equivalen a " + dolaresBigDecimal.toString() + " US dolares.");
    }
}
