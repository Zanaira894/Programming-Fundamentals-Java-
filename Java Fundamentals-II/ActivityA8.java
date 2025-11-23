import java.util.Scanner;

public class ActivityA8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int number = sc.nextInt();

        if (number < 0 || number > 1000) {
            System.out.println("Invalid input");
        } else {
            int digit1 = number % 10;
            int digit2 = (number / 10) % 10;
            int digit3 = (number / 100) % 10;
            int digit4 = (number / 1000) % 10;

            int sum = digit1 + digit2 + digit3 + digit4;
            System.out.println("The sum of digits is: " + sum);
        }

        sc.close();
    }
}
         
         
         
   

























[