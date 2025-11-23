import java.util.Scanner;

public class Lab3b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a hex digit (0–9 or A–F): ");
            String hex = input.next().toUpperCase(); 

            if (hex.length() == 1 && "0123456789ABCDEF".contains(hex)) {
                int decimal = Integer.parseInt(hex, 16);
                String binary = Integer.toBinaryString(decimal);
                System.out.println("The binary value is " + binary);
            } else {
                System.out.println(hex + " is an invalid input");
                break;
            }
        }

        System.out.println("Program ended because invalid input was entered.");
}
}
