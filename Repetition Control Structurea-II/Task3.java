import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prev, curr, count = 0;

        System.out.println("Enter numbers (end with 0):");
        prev = sc.nextInt();
        while (true) {
            curr = sc.nextInt();
            if (curr == 0) break;
            if (curr > prev) count++;
            prev = curr;
        }

        System.out.println("Number of elements greater than previous: " + count);
    }
}
