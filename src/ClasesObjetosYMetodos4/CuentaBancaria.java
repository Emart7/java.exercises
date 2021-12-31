package ClasesObjetosYMetodos4;

public class CuentaBancaria {

    //Variables de Instancia
    String titularDeCuenta;
    TipoDeCuenta tipoDeCuenta;
    double saldoCuenta;

    final double COMISION = 1.2;

    // Definicion de Constantes
    //Solo para el ejemplo 4
//   public static final   String TIPO_AHORRO = "ahorro";
//   public static final   String TIPO_NOMINA = "nomina";

    //Sobre carga de Constructores
    CuentaBancaria (String titularDeCuenta, TipoDeCuenta tipo, double saldoCuenta){
        this.titularDeCuenta = titularDeCuenta;
        this.tipoDeCuenta = tipo;
        this.saldoCuenta = saldoCuenta;
    }

    //opcion 2
    CuentaBancaria (String titularDeCuenta, double saldoCuenta){
    this(titularDeCuenta,TipoDeCuenta.AHORRO,saldoCuenta);
    }
//    CuentaBancaria (String titularDeCuenta, double saldoCuenta){
//        this.titularDeCuenta = titularDeCuenta;
//        this.tipoDeCuenta = TipoDeCuenta.AHORRO;
//        this.saldoCuenta = saldoCuenta;
//    }


    //Opcion 3
//    CuentaBancaria(){
//        tipoDeCuenta = TipoDeCuenta.AHORRO;
//    }
    CuentaBancaria(){
        this("",TipoDeCuenta.NOMINA,0);
    }



    //Asignacion de metodos a la clase CuentaBancaria
    void retiroDinero(double cantidad){
        if (cantidad < 0){
            return;
        }
        double comision = calcularComision();
        saldoCuenta -= cantidad;
        saldoCuenta -= comision;
           }

        double calcularComision(){
        switch (tipoDeCuenta){
            case AHORRO:
                return COMISION;
            case NOMINA:
                return 0;
            default:
                return 0;
               }
           }

    void ingresoDinero(double cantidad){
        if (cantidad < 0){
            return;
        }
        saldoCuenta += cantidad;
    }
    void cambioTipoDeCuenta(TipoDeCuenta nuevoTipo){
        tipoDeCuenta = nuevoTipo;
    }
    double obtenerSaldo(){
        return saldoCuenta;
    }
}
