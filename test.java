import java.util.Random;

public class test {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4]; // Declaramos matriz de 4 filas y 4 columnas
        Random rand = new Random();

        // Inicializamos la matriz con números aleatorios entre 10 y 99
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(90) + 10;
            }
        }

        int suma = 0; // Inicializamos suma en 0
        for (int i = 0; i < 4; i++) { // Ciclo para las filas y columnas
            suma += matriz[i][i]; // Sumamos el elemento de la diagonal principal a suma
        }

        System.out.println("La suma de la diagonal principal es: " + suma);


        

    }
}

