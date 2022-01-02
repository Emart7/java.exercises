package ProyectoCajeroAutomatico5;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class GeneradorAleatorioDeMovimientos {

    private static final String TRANSFERENCIA = "Transferencia de ";
    private static final String INGRESO = "Ingreso de ";
    private static final String RETIRO = "Retiro de ";
    private static final String PAGO_CON_TARJETA = "Pago con tarjeta de ";
    private static final String NOMINA = "Ingreso nomina de ";
    private static final String PAGO_RECIBO = "Pago de recibo de ";

    ArrayList<String> obtenerMovimientos(int numeroDeMovimientos, String moneda) {
        ArrayList<String> movimientos = new ArrayList<>();

        for (int i = 0; i < numeroDeMovimientos; i++) {
            int numeroDeMovimiento = obtenerIntAletorio(1, 6);
            String tipoDeMovimiento;

            switch (numeroDeMovimiento) {
                case 1:
                    tipoDeMovimiento = TRANSFERENCIA;
                    break;
                case 2:
                    tipoDeMovimiento = INGRESO;
                    break;

                case 3:
                    tipoDeMovimiento = RETIRO;
                    break;

                case 4:
                    tipoDeMovimiento = PAGO_CON_TARJETA;
                    break;

                case 5:
                    tipoDeMovimiento = NOMINA;
                    break;
                default:
                    tipoDeMovimiento = PAGO_RECIBO;
            }
            double cantidadAleatoria = obtenerDoubleAletorio(1.0, 3000.0);
            String movimiento = tipoDeMovimiento + String.format("%.2f", cantidadAleatoria) + " " + moneda;
            movimientos.add(movimiento);
        }
        return movimientos;
    }
        private int obtenerIntAletorio ( int minimo, int maximo){
            return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
        }
        private double obtenerDoubleAletorio ( double minimo, double maximo){
            return ThreadLocalRandom.current().nextDouble(minimo, maximo + 1.0);
        }
}
