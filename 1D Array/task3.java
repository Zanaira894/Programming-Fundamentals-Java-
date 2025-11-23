import java.util.Scanner;
public class task3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] arr1= new int[10];
        int[] arr2= new int[10];
        System.out.println("Enter 10 numbers :");
        for(int i = 0; i< 10; i++){
            System.out.print("arr1[" + i + "]=");
            arr1[i]= sc.nextInt();

        }
        for(int i = 0; i< 10; i++){
            arr2[i]= arr1[9-i];}
        System.out.println("\nArray in reverse order");
        for(int i= 0; i<10; i++){
            System.out.println("arr2[" + i +"]=" + arr2[i] );
        }
        sc.close();

    }
    
}
