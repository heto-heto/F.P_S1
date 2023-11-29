public class P19_U4
{
	public static void main(String[] args) {
        int filas = 3;
        int columnas = 3;

        int[][] matriz = {
                {1, 2, 3},
                {6, 5, 4},
                {7, 8, 9}
        };

        System.out.println("Matriz:");
        m_Matriz(matriz);

        int pares = 0;
        int impares = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }

    static void m_Matriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}