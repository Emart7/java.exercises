package ClasesObjetosYMetodos4;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1 - Variables de Instancia
//        CuentaBancaria cuentaDeJuan = new CuentaBancaria();
//        cuentaDeJuan.titularDeCuenta = "Juan Martinez";
//        cuentaDeJuan.TipoDeCuenta = "nomina";
//        cuentaDeJuan.saldoCuenta = 80000;
//
//        System.out.println("Saldo actual de la cuenta de Juan: " + cuentaDeJuan.saldoCuenta);

        //Ejercicio 2 / Metodos
//        CuentaBancaria cuentaDeJorge = new CuentaBancaria();
//        cuentaDeJorge.titularDeCuenta = "Jorge Suarez";
//        cuentaDeJorge.TipoDeCuenta = "ahorros";
//        cuentaDeJorge.saldoCuenta = 42000;

        // Forma no adecuada para ejecutar metodos
//        cuentaDeJorge.retiroDinero(500);
//        System.out.println("Dinero retirado. El nuevo saldo de Jorge es: $" + cuentaDeJorge.saldoCuenta);
//
//        cuentaDeJorge.ingresoDinero(1000);
//        System.out.println("Dinero depositado. El nuevo saldo de Jorge es : $"+ cuentaDeJorge.saldoCuenta);
//
//        cuentaDeJorge.cambioDeCuenta("nomina");
//        System.out.println("Cambio de cuenta realizado. Su nuevo tipo de cuenta es: " + cuentaDeJorge.TipoDeCuenta);

        //Buenas practicas para implementar metodos
//        double saldo = cuentaDeJorge.obtenerSaldo();
//        System.out.println("El saldo de Juan es: " + saldo);
//
//        cuentaDeJorge.retiroDinero(-1000);
//        System.out.println("El salde de Juan tras sacar una cantidad negativa es: " + cuentaDeJorge.obtenerSaldo());

        //Ejercicio 3 - Calculadora
//        Calculadora calculadora = new Calculadora();
//        double radio = 4.0;
//        double area = calculadora.calcularAreaCirculo(radio);
//        System.out.println("El area de un circulo de un radio" + radio + " es: " + area);
//
//        System.out.println("El volumen de un prisma de 5 por 4 por 8 es: " + calculadora.calcularVolumenPrismaRectangular(5,4,8));
//
//        calculadora.calcularMedia(2.6,2,5.9,8);

        CuentaBancaria cuentaDeJoy = new CuentaBancaria("Joy Suarez","ahorro",5000);

    }
}
