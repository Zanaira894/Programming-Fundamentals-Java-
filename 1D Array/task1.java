import java.util.Scanner;
public class task1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] ratings= new int[10];
         int sum= 0;
        System.out.println("Enter the ratings(1 to 10");
        for(int i=0; i<10;i++){
            System.out.print("Student " + (i + 1) + ":");
            ratings[i]= sc.nextInt();
            sum += ratings[i];

        }
        double average= (double)sum/10;
        System.out.println("\n----Summary----");
        System.out.println("Total Ratings= " + sum);
        System.out.println("Average Rating" + average);
        sc.close();


    }
    
}
