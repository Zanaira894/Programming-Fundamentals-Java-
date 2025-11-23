import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count = 0;

        System.out.println("Enter numbers (end with 0):");
        while ((num = sc.nextInt()) != 0) {
            if (num % 2 == 0) {
                count++;
            }
        }

        System.out.println("Number of even elements: " + count);
    }
}


              
