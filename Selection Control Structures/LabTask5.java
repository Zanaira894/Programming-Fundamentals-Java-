import java.util.Scanner;

public class LabTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) 
            System.out.println(3);
        else if (a == b || b == c || a == c) 
            System.out.println(2);
        else 
            System.out.println(0);
    }
}