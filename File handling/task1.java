import java.io.*;
import java.util.Scanner;
public class task1 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int[] integers= new int[10];
        System.out.println("Enter 10 INTERGERS: ");
        for(int i=0; i<integers.length;i++){
            System.out.println("Enter integer" +( i+1) + ": ");
            integers[i]=sc.nextInt();
        }
        try{
            FileWriter fw= new FileWriter("task.txt");
            for(int i=0; i<integers.length;i++){
                fw.write(integers[i] + "\n");
            }
            fw.close();
            System.out.println("Data saved to file successfully");
        }catch(Exception e){
            System.out.println("Error in writing in file");

        }
        
        }


    }

    

