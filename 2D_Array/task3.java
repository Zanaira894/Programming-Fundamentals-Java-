import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] A = new int[3][4];
        int[][] B = new int[4][3];
        int[][] C = new int[3][3];  
        System.out.println("Enter matrix A (3x4):");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter row " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nEnter matrix B (4x3):");
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter row " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {     
            for (int j = 0; j < 3; j++) {  
                int sum = 0;
                for (int k = 0; k < 4; k++) {
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }
        System.out.println("\nResultant Matrix (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    

