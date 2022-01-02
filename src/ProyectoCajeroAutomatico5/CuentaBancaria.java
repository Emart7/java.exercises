package ProyectoCajeroAutomatico5;

public class CuentaBancaria {
    String titularDeCuenta;
    double saldoCuenta;

    //Constructor
    public CuentaBancaria(String titularDeCuenta, double saldoCuenta) {
        this.titularDeCuenta = titularDeCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    double obtenerSaldo() {
        return saldoCuenta;
    }

    void ingresarDinero(double cantidad) {
        if (cantidad < 0) {
            return;
        }
        saldoCuenta += cantidad;
    }

    void retirarDinero(double cantidad) {
        if (cantidad < 0) {
            return;
        }
    }
}
