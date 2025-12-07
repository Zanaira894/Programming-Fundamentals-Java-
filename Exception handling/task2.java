//Program to accept 10 integers and handle wrong index exception
import java.util.*;

class task2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    System.out.print("Enter integer for index " + i + ": ");
                    arr[i] = sc.nextInt();
                    break;
                }
                catch (InputMismatchException ex) {
                    System.out.println("You have entered an invalid input");
                    System.out.println("Try Again");
                    sc.next();
                }
            }
        }
        while (true) {
            try {
                System.out.print("Enter index to view value: ");
                int index = sc.nextInt();
                System.out.println("Value at index " + index + " = " + arr[index]);
                break;
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Wrong index entered!");
                System.out.println("Try Again (Valid: 0 to 9)");
            }
            catch (InputMismatchException ex) {
                System.out.println("You have entered an invalid input");
                System.out.println("Try Again");
                sc.next();
            }
        }
    }
}
    

