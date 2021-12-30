package ClasesObjetosYMetodos4;

public class CuentaBancaria {

    //Variables de Instancia
    String titularDeCuenta;
    String TipoDeCuenta;
    double saldoCuenta;

    //Sobre carga de constructores
    CuentaBancaria (String t, String tipo, double s){
        titularDeCuenta = t;
        TipoDeCuenta = tipo;
        saldoCuenta = s;
    }

    CuentaBancaria (String t, double s){
        titularDeCuenta = t;
        TipoDeCuenta = "ahorro";
        saldoCuenta = s;
    }

    CuentaBancaria(){
        TipoDeCuenta = "ahorro";
    }

    //Asignando metodos a la clase CuentaBancaria
    void retiroDinero(double cantidad){
        if (cantidad < 0){
            return;
        }
        saldoCuenta -= cantidad;
    }
    void ingresoDinero(double cantidad){
        if (cantidad < 0){
            return;
        }
        saldoCuenta += cantidad;
    }
    void cambioDeCuenta(String nuevoTipo){
        TipoDeCuenta = nuevoTipo;
    }
    double obtenerSaldo(){
        return saldoCuenta;
    }
}
