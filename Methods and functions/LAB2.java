import java.util.Scanner;

public class LAB2 {
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Reversed number = " + reverse(num));
        if (isPalindrome(num))
            System.out.println("The number is a palindrome.");
        else
            System.out.println("The number is not a palindrome.");
}
}
