package OtrosTipoDeDatos;

public class ArraysMultidimensionales {
    public static void main(String[] args) {

        int miArrayDeUnaDimension[] = new int[15];
        int miArrayDeDosDimension[][] = new int[10][20];
        int miArrayDeTresDimension[][][] = new int[5][4][2];

        int tablaDeMultiplicar[][] = new int[10][10];

        for(int i = 0; i < 10; i++){
            for(int j = 0; i < 10; i++){
                tablaDeMultiplicar[i][j] = i * j;
            }
        }
        System.out.println("El resultado de 4 por 5 esta en la posicion [4][5]" +  tablaDeMultiplicar[4][5]);

        int miArrayMultidimensional[][] = {{2,5,-9},{-7, -25, -0}, {8, 3, 4}, {5, -6, 85, 69, 287}};
    }
}
