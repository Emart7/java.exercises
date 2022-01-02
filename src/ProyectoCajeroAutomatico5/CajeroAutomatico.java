package ProyectoCajeroAutomatico5;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
Clase que emula las funcionalidades de un cajero automatico.
1. La clase tendra una variable de instancia llamada cuentaBancariaActual de tipo CuentaBancaria
2. La clase tendra un constructor que tendra como parametros un String que identifica al usuario y otro String que contiene una contrasena
3. Como se trata de una emulacion, en lugar de conectar con la base de datos del banco para que nos devuelva la cuenta bancaria del usuario,
lo que vamos a hacer es crear un objeto de la clase CuentaBancaria con un nombre cualquiera y un saldo aleatorio
4. Esta clase tendra los siguientes metodos:

mostrarSaldo()
ingresarDinero()
scarDinero()
consultarUltimoMovimientos
salir()
Se creara un objeto de tipo CajeroAutomatico

 */
public class CajeroAutomatico {

    //Variable de Instancia
    CuentaBancaria cuentaBancariaActual;

    CajeroAutomatico(String identificador, String contraseña){
        double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0,50000);
        cuentaBancariaActual = new CuentaBancaria("Nombre Cualquiera", cantidadAleatoria);
    }

    void mostrarSaldo(){
        System.out.println("Su saldo es: "+ cuentaBancariaActual.obtenerSaldo());
    }

    void ingresarDinero(){
        System.out.println("Cuanto dinero quiere ingresar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.ingresarDinero(cantidad);
    }

    void retirarDinero(){
        System.out.println("Cuanto dinero quiere retirar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.retirarDinero(cantidad);
    }

    void consultarUltimosMovimientos(){

        GeneradorAleatorioDeMovimientos generadorAleatorioDeMovimientos = new GeneradorAleatorioDeMovimientos();
        System.out.println("Cuantos movimientos quiere consultar? ");
        Scanner scanner = new Scanner(System.in);
        int numerosDeMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generadorAleatorioDeMovimientos.obtenerMovimientos(numerosDeMovimientos, "euros");
        mostrarMovimientos(movimientos);
    }

    void mostrarMovimientos(ArrayList<String> movimientos){
        for(String movimiento: movimientos){
            System.out.println(movimiento);
        }
    }

    void salir(){
        System.out.println("Muchas gracias por usar nuestros servicios...");
    }

}
