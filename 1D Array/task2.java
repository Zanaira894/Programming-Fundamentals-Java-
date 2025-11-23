import java.util.Scanner;
public class task2 { 
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int[] integers= new int[10];
        System.out.println("Enter 10 numbers :");
        for(int i= 0; i< 10; i++){
            System.out.print("elements " + (i+1) + "=");
            integers[i] = sc.nextInt();

        }
        modify(integers);
        System.out.println("\nArray after multiplying each element by 3:");
        for(int i= 0; i< 10; i++){
            System.out.println("integers[" + i + "]=" + integers[i]);
        }
        sc.close();        

    }
    public static void modify(int[] integers) {
        for(int i= 0; i< 10; i++){
            integers[i]=integers[i]* 3;
        }

    }
    
}
