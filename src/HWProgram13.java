import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HWProgram13 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("введіть число для m");

        int m = scanner.nextInt();
        System.out.println("введіть число для n");
        int n = scanner.nextInt();


        int[][] matrix1 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + ", ");
            }
            System.out.println();
        }
        int[][] matrix2 = new int[n][m];
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {

                matrix2[i][j] = matrix1[j][i];
            }
        }
        System.out.println();

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + ", ");
            }
            System.out.println();
        }

    }
}
