//Program to accept two integers and display their sum
import java.util.*;

class task1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = 0, b = 0;

        // Input first number
        while (true) {
            try {
                System.out.print("Enter first integer: ");
                a = sc.nextInt();
                break;
            }
            catch (InputMismatchException ex) {
                System.out.println("You have entered an invalid input");
                System.out.println("Try Again");
                sc.next();  
            }
        }

        // Input second number
        while (true) {
            try {
                System.out.print("Enter second integer: ");
                b = sc.nextInt();
                break;
            }
            catch (InputMismatchException ex) {
                System.out.println("You have entered an invalid input");
                System.out.println("Try Again");
                sc.next();
            }
        }

        System.out.println("Sum = " + (a + b));
    }
} 
