import java.util.Scanner;

public class Task4d{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
