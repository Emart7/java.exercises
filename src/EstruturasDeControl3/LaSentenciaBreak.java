package EstruturasDeControl3;

public class LaSentenciaBreak {
    public static void main(String[] args) {

        //Ejemplo 1
//        int numeroEncontrado;
//        for (numeroEncontrado = 2567; numeroEncontrado <= 3642; numeroEncontrado ++){
//            System.out.println("Sera el numero? " + numeroEncontrado);
//            if((numeroEncontrado % 2 == 0) && (numeroEncontrado % 3 == 0) && (numeroEncontrado % 3 == 0)){
//                break;
//            }
//        }
//        if(numeroEncontrado > 3642){
//            System.out.println("No hay ningun numero entre 2567 y 3642, que sea multiplo de 2, 3, y 5.");
//        }else {
//            System.out.println("El primer multiplo de 2, 3, y 5 entre 2567 y 3642 es: " + numeroEncontrado);
//        }

        //Ejemplo 2

        int numeroEncontrado2 = 2567;

        while (numeroEncontrado2 <= 3642){
            System.out.println("El numero encontrado sera? " + numeroEncontrado2);
            if ((numeroEncontrado2 % 2 == 0) && (numeroEncontrado2 % 3 == 0) && (numeroEncontrado2 % 5 == 0)){
                break;
            }
            numeroEncontrado2 ++;
        }
        if (numeroEncontrado2 > 3642){
            System.out.println("No hay ningun numero entre 2567 y 3642, que sea multiplo de 2, 3, y 5.");
        } else {
            System.out.println("El primer multiplo de 2, 3, y 5 entre 2567 y 3642 es: " + numeroEncontrado2);
        }
    }
}
