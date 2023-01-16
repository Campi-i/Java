package Zadatak5;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = 0;

        while (M < 2 || M > 10) {
            System.out.print("Unesite broj M (2 <= M <= 10): ");
            M = input.nextInt();
        }

        int[][] matrica = new int[M][M];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("Unesite element matrice [" + i + "][" + j + "]: ");
                matrica[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < M; i++) {
            Nit nit = new Nit(matrica[i], i);
            nit.start();
        }
    }
}
