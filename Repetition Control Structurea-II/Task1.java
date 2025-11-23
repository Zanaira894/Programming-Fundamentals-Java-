import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int index = -1;
        int i = 1;

      
        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;
            i++;
            if (num > max) 
                max = num;
                index = i;
            }

        System.out.println("Index of maximum element: " + index);
    }
}
