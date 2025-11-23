import java.util.Scanner;

public class Lab3a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a decimal value (0 to 15): ");
            int dec = input.nextInt();

            if (dec > 15) {
                System.out.println(dec + " is an invalid input");
                break;                                                                                                                   
            }

            if (dec >= 0 && dec <= 15) {
                String hex = Integer.toHexString(dec).toUpperCase();
                System.out.println("The hex value is " + hex);
            } else {
                System.out.println(dec + " is an invalid input");
            }
        }
}
}
